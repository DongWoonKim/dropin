package com.example.dropin.service.impl;

import com.example.dropin.config.jwt.TokenProvider;
import com.example.dropin.dto.SignInRequestDTO;
import com.example.dropin.dto.SignUpRequestDTO;
import com.example.dropin.dto.SignInResponseDTO;
import com.example.dropin.service.SignIn;
import com.example.dropin.service.SignUp;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService implements SignUp, SignIn {

    private final TokenProvider tokenProvider;

    @Override
    public boolean SignUp(SignUpRequestDTO dto) {
        String userPw = passwordEncoder().encode(dto.getUserPw());
        return true;
    }

    @Override
    public SignInResponseDTO signIn(SignInRequestDTO dto) {
        String userId = dto.getUserId();
        String userPw = passwordEncoder().encode(dto.getUserPw());

        List<GrantedAuthority> roles = new ArrayList<>();
        roles.add(new SimpleGrantedAuthority(dto.getUserRole().name()));
        Authentication authentication = new UsernamePasswordAuthenticationToken(userId, userPw, roles);

        return SignInResponseDTO.builder()
                .token( tokenProvider.createToken(authentication) )
                .build();
    }

    private PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }
}
