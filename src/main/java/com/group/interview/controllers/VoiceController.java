package com.group.interview.controllers;

import com.group.interview.domain.PhoneNumberDto;
import com.group.interview.services.VoiceService;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
    public ResponseEntity<PhoneNumberDto> getPhoneNumber(@RequestParam Long id) {

        return ResponseEntity.ok(voiceService.getPhoneNumber(id));
    }

    @Override
    @PostMapping
    public ResponseEntity<String> createPhoneNumber(@RequestParam PhoneNumberDto number) {

        return ResponseEntity.ok(voiceService.createPhoneNumber(number));
    }

    @Override
    @PutMapping
    public ResponseEntity<String> updatePhoneNumber(@RequestParam PhoneNumberDto number) {

        return ResponseEntity.ok(voiceService.updatePhoneNumber(number));
    }

    @Override
    @DeleteMapping
    public ResponseEntity<String> deletePhoneNumber(@PathParam("id") Long id) {

        return ResponseEntity.ok(String.format("deleted for %s", id));
    }

}
