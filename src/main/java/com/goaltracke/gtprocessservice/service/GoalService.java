package com.goaltracke.gtprocessservice.service;

import java.util.List;

import com.goaltracke.gtprocessservice.dto.GoalDto;
import com.goaltracke.gtprocessservice.entity.Goal;

public interface GoalService {

	public List<Goal> getGoals();

	public GoalDto createGoal(GoalDto goal);

}
