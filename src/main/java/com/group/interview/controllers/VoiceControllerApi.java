package com.group.interview.controllers;

import com.group.interview.domain.PhoneNumberDto;
import org.springframework.http.ResponseEntity;

public interface VoiceControllerApi {

    ResponseEntity<PhoneNumberDto> getPhoneNumber(Long number);

    ResponseEntity<String> createPhoneNumber(PhoneNumberDto phoneNumberDto);

    ResponseEntity<String> updatePhoneNumber(PhoneNumberDto phoneNumberDto);

    ResponseEntity<String> deletePhoneNumber(Long id);
}
