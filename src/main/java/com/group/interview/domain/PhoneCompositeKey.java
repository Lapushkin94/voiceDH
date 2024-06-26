package com.group.interview.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PhoneCompositeKey implements Serializable {

    private String onkz;    // Onkz
    private String phone;  // Number

}
