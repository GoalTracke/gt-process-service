package com.goaltracke.gtprocessservice.service.impl;

import java.util.List;
import java.util.stream.Collectors;

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
	public List<GoalDto> getGoals() {
		List<Goal> goals = goalRepository.findAll();

		List<GoalDto> goalDtos = goals.stream().map(goal -> GoalDto.fromEntity(goal)).collect(Collectors.toList());

		return goalDtos;
	}

	@Override
	public GoalDto createGoal(GoalDto goalDto) {
		Goal goal = goalDto.toEntity();
		Goal responseGoal = goalRepository.save(goal);
		return GoalDto.fromEntity(responseGoal);
	}

}
