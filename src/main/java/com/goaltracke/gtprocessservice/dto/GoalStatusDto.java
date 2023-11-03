package com.goaltracke.gtprocessservice.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.goaltracke.gtprocessservice.entity.GoalStatus;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class GoalStatusDto extends BaseDto {

    @JsonProperty("cycle_period")
    private int cyclePeriod;

    @JsonProperty("progress_update")
    private String progressUpdate;

    @JsonProperty("last_position")
    private String lastPosition;

    private int version;

    public GoalStatus toEntity() {
        GoalStatus entity = new GoalStatus();
        entity.setCyclePeriod(cyclePeriod);
        entity.setVersion(version);
        entity.setLastPosition(lastPosition);
        entity.setProgressUpdate(progressUpdate);
        return entity;
    }

    public static GoalStatusDto fromEntity(GoalStatus entity) {
        return GoalStatusDto.builder()
                .cyclePeriod(entity.getCyclePeriod())
                .lastPosition(entity.getLastPosition())
                .progressUpdate(entity.getProgressUpdate())
                .version(entity.getVersion())
                .createdAt(entity.getCreatedAt()).build();
    }

}
