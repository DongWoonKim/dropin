package com.example.dropin.service.impl;

import com.example.dropin.config.jwt.TokenProvider;
import com.example.dropin.dto.SignUpRequestDTO;
import com.example.dropin.dto.SignUpResponseDTO;
import com.example.dropin.service.SignIn;
import com.example.dropin.service.SignUp;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService implements SignUp, SignIn {

    private final TokenProvider tokenProvider;

    @Override
    public SignUpResponseDTO SignUp(SignUpRequestDTO dto) {
        return null;
    }
}
