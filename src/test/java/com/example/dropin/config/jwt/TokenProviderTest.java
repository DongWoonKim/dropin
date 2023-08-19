package com.example.dropin.config.jwt;

import com.example.dropin.enums.RoleType;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@SpringBootTest
class TokenProviderTest {

//    @Autowired
//    private TokenProvider tokenProvider;

//    @Test
//    public void 토큰_테스트() {
//
//        // given
//        String userId = "dropin", userPw = passwordEncoder().encode("1234");
//
//        List<GrantedAuthority> roles = new ArrayList<>();
//        roles.add(new SimpleGrantedAuthority(RoleType.ROLE_MASTER.name()));
//        Authentication authentication = new UsernamePasswordAuthenticationToken(userId, userPw, roles);
//
//        // when
//        String jwt = tokenProvider.createToken(authentication);
//        System.out.println("jwt :: " + jwt);
//        Authentication resAuth = tokenProvider.getAuthentication(jwt);
//
//        // then
//        assertEquals(userId, resAuth.getName());
//        assertEquals(RoleType.ROLE_MASTER.name(), resAuth.getAuthorities().stream().findFirst().get().toString());
//
//    }
//
//    private PasswordEncoder passwordEncoder() {
//        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
//    }

}