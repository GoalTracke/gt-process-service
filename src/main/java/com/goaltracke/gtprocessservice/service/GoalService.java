package com.goaltracke.gtprocessservice.service;

import java.util.List;

import com.goaltracke.gtprocessservice.dto.GoalDto;

public interface GoalService {

	List<GoalDto> getGoals();

	GoalDto createGoal(GoalDto goal);

}
