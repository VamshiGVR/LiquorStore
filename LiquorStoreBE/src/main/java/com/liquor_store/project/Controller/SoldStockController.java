package com.liquor_store.project.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liquor_store.project.Entity.SoldStock;
import com.liquor_store.project.Service.SoldStockService;

@RestController
@RequestMapping("/LiquorStore")
public class SoldStockController {
	
	private SoldStockService soldStockService;

	public SoldStockController(SoldStockService soldStockService) {
		this.soldStockService = soldStockService;
	}
	
	@PostMapping("/AddSoldLiquorStock")
	public SoldStock addSoldBottles(@RequestBody SoldStock soldStock) {
		return soldStockService.addSoldBottles(soldStock);
	}
	
	@GetMapping("/GetSoldLiquorStock")
	public String getAllBottles(@RequestBody SoldStock soldStock ){
		return "Sold";
	}

	@GetMapping("/GetSoldLiquorStock")
	public String getSoldBottle(){
		return "SoldbyID";
	}
	
	@PutMapping("/UpdateSoldLiquorStock")
	public String updateSoldBottles() {
		return "Sold";
	}
	
	@DeleteMapping("/DeleteSoldLiquorStock")
	public String deleteSoldBottles() {
		return "DELETE";
	}
}
