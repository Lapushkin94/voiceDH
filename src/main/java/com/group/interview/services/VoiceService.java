package com.group.interview.services;

import com.group.interview.domain.PhoneNumber;
import com.group.interview.domain.PhoneNumberDto;
import com.group.interview.repositories.VoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class VoiceService {

    private final VoiceRepository voiceRepository;

    public PhoneNumberDto getPhoneNumber(String number) {

        Optional<PhoneNumber> phoneNumber = voiceRepository.findById("123");

        return new PhoneNumberDto("1", "123");
    }
}
