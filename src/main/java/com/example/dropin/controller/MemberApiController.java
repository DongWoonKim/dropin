package com.example.dropin.controller;

import com.example.dropin.dto.SignUpRequestDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member")
public class MemberApiController {

    @PostMapping
    public ResponseEntity<Boolean> join(@RequestBody SignUpRequestDTO dto) {

        System.out.println(dto);

        return ResponseEntity.ok(true);
    }

}
