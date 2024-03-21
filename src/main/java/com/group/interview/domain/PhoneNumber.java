package com.group.interview.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneNumber {
    @EmbeddedId
    private PhoneCompositeKey compositeKey;

    @Enumerated(value = EnumType.ORDINAL)
    private NumberStatus status;

}
