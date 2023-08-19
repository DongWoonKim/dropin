package com.example.dropin.dto;

import com.example.dropin.enums.RoleType;
import lombok.Getter;

@Getter
public class SignInRequestDTO {
    private String userId;
    private String userPw;
    private RoleType userRole;
}
