package com.group.interview.controllers;

import com.group.interview.domain.PhoneNumberDto;
import com.group.interview.services.VoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/voice")
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class VoiceController implements VoiceControllerApi {

    private final VoiceService voiceService;

    @Override
    @GetMapping
    public ResponseEntity<PhoneNumberDto> getPhoneNumber(@RequestParam String number) {


        return ResponseEntity.ok(voiceService.getPhoneNumber("123"));
    }

}
