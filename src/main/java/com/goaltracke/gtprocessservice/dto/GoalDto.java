package com.goaltracke.gtprocessservice.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.goaltracke.gtprocessservice.entity.Goal;

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
		GoalDto dto = new GoalDto();
		dto.setUserId(entity.getUserId());
		dto.setName(entity.getName());
		dto.setId(entity.getId());
		dto.setCreatedAt(entity.getCreatedAt());
		dto.setCurrentStatus(entity.getCurrentStatus());
		dto.setProgressRange(entity.getProgressRange());
		dto.setUpdateType(entity.getUpdateType());
		return dto;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getProgressRange() {
		return progressRange;
	}

	public void setProgressRange(String progressRange) {
		this.progressRange = progressRange;
	}

	public String getUpdateType() {
		return updateType;
	}

	public void setUpdateType(String updateType) {
		this.updateType = updateType;
	}

	public String getCurrentStatus() {
		return currentStatus;
	}

	public void setCurrentStatus(String currentStatus) {
		this.currentStatus = currentStatus;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

}
