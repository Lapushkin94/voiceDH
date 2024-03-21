package com.group.interview.services;

import com.group.interview.api.NumbersApiDelegate;
import com.group.interview.domain.PhoneCompositeKey;
import com.group.interview.model.Status;
import com.group.interview.repositories.VoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VoiceService implements NumbersApiDelegate {

    private final VoiceRepository voiceRepository;

    public ResponseEntity<Status> getNumberStatus(String onkz, String number) {
        return voiceRepository.findById(new PhoneCompositeKey(onkz, number))
                .map(phoneNumber -> {
                    var status = new Status();
                    status.setStatus(phoneNumber.getStatus().name());
                    return new ResponseEntity<>(status, HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
