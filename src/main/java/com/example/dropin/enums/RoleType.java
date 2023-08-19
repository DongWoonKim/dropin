package com.example.dropin.enums;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum RoleType {

    ROLE_COMMON("일반 사용자"),
    ROLE_ADMIN("관리자"),
    ROLE_MASTER("슈퍼 관리자");

    private final String describe;

}
