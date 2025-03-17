package com.liquor_store.project.Service;

import org.springframework.stereotype.Service;

import com.liquor_store.project.Entity.Liquor;
import com.liquor_store.project.Repository.LQRepository;

@Service
public class LQService {
	
	private LQRepository lqRepository;
	
	public String addBottles() {
		return "Bottle";
	}

	public Liquor getBottles(Liquor liquor) {
		return lqRepository.findAllById(liquor.getId());
	}

	public String updateBottles() {
		return "Bottle";
	}

	public String deleteBottles() {
		return "Bottle";
	}
}
