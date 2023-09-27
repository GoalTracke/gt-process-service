package com.goaltracke.gtprocessservice.service;

import java.util.List;

import com.goaltracke.gtprocessservice.dto.GoalDto;

public interface GoalService {

	public List<GoalDto> getGoals();

	public GoalDto createGoal(GoalDto goal);

}
