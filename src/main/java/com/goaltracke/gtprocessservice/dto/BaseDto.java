package com.goaltracke.gtprocessservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@MappedSuperclass
@SuperBuilder
public abstract class BaseDto {

    private String id;

    @JsonProperty("created_at")
    private Date createdAt;
}
