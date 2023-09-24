package com.goaltracke.gtprocessservice.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.goaltracke.gtprocessservice.dto.GoalDto;
import com.goaltracke.gtprocessservice.entity.Goal;
import com.goaltracke.gtprocessservice.repository.GoalRepository;
import com.goaltracke.gtprocessservice.service.GoalService;

@Service
public class GoalServiceImpl implements GoalService {

	private GoalRepository goalRepository;

	public GoalServiceImpl(GoalRepository goalRepository) {
		this.goalRepository = goalRepository;
	}

	@Override
	public List<Goal> getGoals() {
		return goalRepository.findAll();
	}

	@Override
	public GoalDto createGoal(GoalDto goalDto) {
		Goal goal = goalDto.toEntity();
		Goal responseGoal = goalRepository.save(goal);
		return GoalDto.fromEntity(responseGoal);
	}

}
