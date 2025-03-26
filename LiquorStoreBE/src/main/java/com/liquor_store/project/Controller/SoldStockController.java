package com.liquor_store.project.Controller;

import java.util.List;

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
	
	@GetMapping("/GetAllSoldLiquorStock")
	public List<SoldStock> getAllSoldBottles(){
		return soldStockService.getAllBottles();
	}
	
	@GetMapping("/GetSoldLiquorStock")
	public SoldStock getSoldBottleById(@RequestBody SoldStock soldStock ){
		return soldStockService.getSoldBottleById(soldStock);
	}
	
	@PutMapping("/UpdateSoldLiquorStock")
	public String updateSoldBottles(@RequestBody SoldStock soldStock) {
		return soldStockService.updateSoldBottles(soldStock);
	}
	
	@DeleteMapping("/DeleteSoldLiquorStock")
	public String deleteSoldBottles(@RequestBody SoldStock soldStock) {
		return soldStockService.deleteSoldBottles(soldStock);
	}
	
	@GetMapping("/GetDailyReport")
	public String getDailyReport() {
		return soldStockService.getDaillyReport();
	}
	
	@GetMapping("/GetMonthlyReport")
	public String getMonthlyReport() {
		return "PRINTED";
	}

	@GetMapping("/GetYearlyReport")
	public String getYearlyReport() {
		return "PRINTED";
	}
}
