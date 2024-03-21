package com.group.interview.services;

import com.group.interview.domain.PhoneNumber;
import com.group.interview.domain.PhoneNumberDto;
import com.group.interview.repositories.VoiceRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VoiceService {

    private final VoiceRepository voiceRepository;

    public PhoneNumberDto getPhoneNumber(Long id) {

        PhoneNumber phoneNumber = voiceRepository.findById(id).get();

        return new PhoneNumberDto(phoneNumber.getId(), phoneNumber.getNumber());
    }

    public String createPhoneNumber(PhoneNumberDto number) {

        PhoneNumber phoneNumber = voiceRepository.save(new PhoneNumber(1L, number.getPhoneNumber()));

        return phoneNumber.getNumber();
    }

    public String updatePhoneNumber(PhoneNumberDto number) {

        PhoneNumber phoneNumber = voiceRepository.save(new PhoneNumber(1L, number.getPhoneNumber()));

        return phoneNumber.getNumber();
    }

    public void deletePhoneNumber(Long id) {

        voiceRepository.deleteById(id);
    }
}
