package com.example.dropin.service;

import com.example.dropin.dto.SignInRequestDTO;
import com.example.dropin.dto.SignInResponseDTO;

public interface SignIn {

    SignInResponseDTO signIn(SignInRequestDTO dto);

}
