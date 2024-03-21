package com.group.interview.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PhoneNumberDto {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("phoneNumber")
    private String phoneNumber;
}
