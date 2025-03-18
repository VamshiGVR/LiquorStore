package com.liquor_store.project.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.liquor_store.project.Entity.Liquor;
import com.liquor_store.project.Repository.LQRepository;

@Service
public class LQService {
	
	private LQRepository lqRepository;
	
	public LQService(LQRepository lqRepository) {
		this.lqRepository =lqRepository;
	}
	
	public Liquor addBottles(Liquor liquor) {
		return lqRepository.save(liquor);
	}

	public List<Liquor> getallBottles(Liquor liquor) {
		return lqRepository.findAll();
	}
	
	public Liquor getBottles(Liquor liquor) {		
	   lqRepository.findById(liquor.id);
	return liquor;
	}


	public String updateBottles(Liquor liquor) {
		return "Bottle";
	}

	public String deleteBottles(Liquor liquor) {
		lqRepository.deleteById(liquor.id);
		return "DELETED";
	}
}
