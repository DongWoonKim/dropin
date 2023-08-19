package com.example.dropin.dto;

import com.example.dropin.enums.RoleType;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class SignUpRequestDTO {

    private String userId;
    private String userPw;
    private String userName;
    private RoleType userRole;
    private String birth;
    private String gender;

}
