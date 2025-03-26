package com.liquor_store.project.Service;

import org.springframework.stereotype.Service;

import com.liquor_store.project.Entity.SoldStock;
import com.liquor_store.project.Repository.SoldStockRepository;

@Service
public class SoldStockService {

  private SoldStockRepository soldStockRepository;
	
	public SoldStockService(SoldStockRepository soldStockRepository){
		this.soldStockRepository = soldStockRepository;
	}

	public SoldStock addSoldBottles(SoldStock soldStock) {
		return soldStockRepository.save(soldStock);
	}
		
	public String getAllBottles(){
		return "Sold";
	}

	public String getSoldBottle(){
		return "SoldbyID";
	}	
	
	public String updateSoldBottles() {
		return "Sold";
	}
	
	public String deleteSoldBottles() {
		return "DELETE";
	}
}