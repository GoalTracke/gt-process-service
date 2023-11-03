package com.goaltracke.gtprocessservice.dto;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.goaltracke.gtprocessservice.entity.Goal;
import com.goaltracke.gtprocessservice.entity.GoalStatus;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.springframework.util.CollectionUtils;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class GoalDto extends BaseDto {

	private String name;

	@JsonProperty("user_id")
	private String userId;

	@JsonProperty("target_position")
	private String targetPosition;

	@JsonProperty("start_position")
	private String startPosition;

	@JsonProperty("checkpoint_habit")
	private String checkpointHabit;

	@JsonProperty("goal_status")
	private List<GoalStatusDto> goalStatusDtoList;

	public Goal toEntity() {
		Goal entity = new Goal();
		entity.setName(name);
		entity.setUserId(userId);
		entity.setCheckpointHabit(checkpointHabit);
		entity.setStartPosition(startPosition);
		entity.setTargetPosition(targetPosition);
		if (!CollectionUtils.isEmpty(goalStatusDtoList)) {
			entity.setGoalStatus(goalStatusDtoList.stream().map(GoalStatusDto::toEntity).toList());
		}
		return entity;
	}

	public static GoalDto fromEntity(Goal entity) {
		return GoalDto.builder()
				.id(entity.getId())
				.userId(entity.getUserId())
				.name(entity.getName())
				.checkpointHabit(entity.getCheckpointHabit())
				.startPosition(entity.getStartPosition())
				.targetPosition(entity.getTargetPosition())
				.goalStatusDtoList(Objects.nonNull(entity.getGoalStatus()) ?entity.getGoalStatus().stream()
						.map(GoalStatusDto::fromEntity)
						.toList() : null)
				.createdAt(entity.getCreatedAt())
				.build();
	}
}
