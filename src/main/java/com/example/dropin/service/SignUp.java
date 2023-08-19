package com.example.dropin.service;

import com.example.dropin.dto.SignUpRequestDTO;
import com.example.dropin.dto.SignUpResponseDTO;

public interface SignUp {
    SignUpResponseDTO SignUp(SignUpRequestDTO dto);
}
