package com.group.interview.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "phone_numbers")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PhoneNumber {
    @EmbeddedId
    private PhoneCompositeKey compositeKey;

    @Enumerated(value = EnumType.ORDINAL)
    private NumberStatus status;

}
