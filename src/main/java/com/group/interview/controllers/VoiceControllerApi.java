package com.group.interview.controllers;

import com.group.interview.domain.PhoneNumberDto;
import org.springframework.http.ResponseEntity;

public interface VoiceControllerApi {

    ResponseEntity<PhoneNumberDto> getPhoneNumber(String number);
}
