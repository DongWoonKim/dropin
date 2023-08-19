package com.example.dropin.controller;

import com.example.dropin.dto.SignInRequestDTO;
import com.example.dropin.dto.SignInResponseDTO;
import com.example.dropin.dto.SignUpRequestDTO;
import com.example.dropin.service.SignIn;
import com.example.dropin.service.impl.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/member")
public class MemberApiController {

    private final MemberService memberService;

    @PostMapping
    public SignInResponseDTO signIn(@RequestBody SignInRequestDTO dto) {
        return memberService.signIn( dto );
    }

    @PostMapping(value = "join")
    public ResponseEntity<Boolean> join(@RequestBody SignUpRequestDTO dto) {
        System.out.println(dto);
        return ResponseEntity.ok(true);
    }


}
