package com.group.interview.bootstrap;

import com.group.interview.domain.PhoneNumber;
import com.group.interview.repositories.VoiceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapData implements CommandLineRunner {

    private final VoiceRepository voiceRepository;

    public BootstrapData(VoiceRepository voiceRepository) {
        this.voiceRepository = voiceRepository;
    }

    @Override
    public void run(String... args) {

        PhoneNumber phoneNumber1 = new PhoneNumber();
        phoneNumber1.setNumber("123");

        // Save the entities
        voiceRepository.save(phoneNumber1);

    }
}
