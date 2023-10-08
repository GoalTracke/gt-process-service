package com.goaltracke.gtprocessservice.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.goaltracke.gtprocessservice.entity.Goal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GoalDto {

	private String id;

	private String name;

	@JsonProperty("user_id")
	private String userId;

	@JsonProperty("progress_range")
	private String progressRange;

	@JsonProperty("update_type")
	private String updateType;

	@JsonProperty("current_status")
	private String currentStatus;

	@JsonProperty("created_at")
	private Date createdAt;

	public Goal toEntity() {
		Goal entity = new Goal();
		entity.setName(name);
		entity.setCurrentStatus(currentStatus);
		entity.setProgressRange(progressRange);
		entity.setUpdateType(updateType);
		entity.setUserId(userId);
		return entity;
	}

	public static GoalDto fromEntity(Goal entity) {
		return GoalDto.builder()
				.userId(entity.getUserId())
				.name(entity.getName())
				.id(entity.getId())
				.currentStatus(entity.getCurrentStatus())
				.progressRange(entity.getProgressRange())
				.updateType(entity.getUpdateType())
				.createdAt(entity.getCreatedAt()).build();
	}
}
