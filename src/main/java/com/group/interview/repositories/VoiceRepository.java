package com.group.interview.repositories;

import com.group.interview.domain.PhoneNumber;
import org.springframework.data.repository.CrudRepository;

public interface VoiceRepository extends CrudRepository<PhoneNumber, String> {
}
