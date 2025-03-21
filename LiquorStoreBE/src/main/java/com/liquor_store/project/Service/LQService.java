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

	public List<Liquor> getallBottles( ) {
		return lqRepository.findAll();
	}
	
	public Liquor getBottles(Liquor liquor) {
		Liquor existLiquor = lqRepository.findById(liquor.id).orElseThrow(()-> new RuntimeException("Bottle not found....."));		
		return existLiquor;
	}


	public String updateBottles(Liquor liquor) {
		Liquor existLiquor = lqRepository.findById(liquor.id).orElseThrow(()-> new RuntimeException("Bottle not found....."));
		existLiquor.id = liquor.id;
		existLiquor.brand = liquor.brand;
		existLiquor.name = liquor.name;
		existLiquor.size = liquor.size;
		existLiquor.quanity = liquor.quanity;
		existLiquor.price = liquor.price;
		existLiquor.code = liquor.code;
		return "Bottle "+ existLiquor.id + " is updated" + existLiquor;
		 
	}

	public String deleteBottles(Liquor liquor) {
		lqRepository.deleteById(liquor.id);
		return "DELETED";
	}
}
