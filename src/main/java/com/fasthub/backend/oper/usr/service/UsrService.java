package com.fasthub.backend.oper.usr.service;

import com.fasthub.backend.cmm.enums.UserRole;
import com.fasthub.backend.cmm.jwt.JwtService;
import com.fasthub.backend.cmm.result.Result;
import com.fasthub.backend.oper.usr.dto.JoinDto;
import com.fasthub.backend.oper.usr.entity.User;
import com.fasthub.backend.oper.usr.mapper.AuthMapper;
import com.fasthub.backend.oper.usr.repository.AuthRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsrService {

    private final AuthRepository authRepository;
    private final AuthMapper authMapper;
    private final PasswordEncoder passwordEncoder;

    public Result insert(JoinDto joinDto){
        joinDto.setUserPwd(passwordEncoder.encode(joinDto.getUserPwd()));
        joinDto.setAuthName(UserRole.ROLE_USER.getRole(joinDto.getAuthName()));
        User userEntity = authMapper.userDtoToUserEntity(joinDto);
        return Result.success("join",authMapper.userEntityToUserDto(authRepository.save(userEntity)));
    }
}
