package com.liquor_store.project.Service;

import java.util.List;

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
		
	public List<SoldStock> getAllBottles(){
		return soldStockRepository.findAll();
	}

	public SoldStock getSoldBottleById(SoldStock soldStock){
		return soldStockRepository.findById(soldStock.id).orElseThrow(() -> new RuntimeException("Bottle not found"));
	}	
	
	public String updateSoldBottles(SoldStock soldStock) {
		SoldStock updatedBottle = soldStockRepository.findById(soldStock.id).orElseThrow(() -> new RuntimeException("Bottle not found"));
		updatedBottle.id = soldStock.id;
		updatedBottle.Alcohol = soldStock.Alcohol;
		updatedBottle.brand = soldStock.brand;
		updatedBottle.code = soldStock.code;
		updatedBottle.customerName = soldStock.customerName;
		updatedBottle.emailId=soldStock.emailId;
		updatedBottle.modeOfPayment = soldStock.modeOfPayment;
		updatedBottle.name = soldStock.name;
		updatedBottle.online = soldStock.online;
		updatedBottle.phoneNumber = soldStock.phoneNumber;
		updatedBottle.price = soldStock.price;
		updatedBottle.quantity = soldStock.quantity;
		updatedBottle.size = soldStock.size;
		updatedBottle.tax = soldStock.tax;
		soldStockRepository.save(updatedBottle);
		return "Sold Bottle Data was updated for bottle id: " + updatedBottle.id;
	}
	
	//Should delete data. 
	public String deleteSoldBottles(SoldStock soldStock) {
		soldStockRepository.deleteById(soldStock.id);
		return "Deleted the Sale of bottle id: " + soldStock.id;
	}
	
	//Should add all daily data into an PDF Sheet & Should send to a mail id. 
	// PDF name should be "monthly report of $date + $Day name with month & year"
	public String getDaillyReport() {
		long totalNoOfTransactions = soldStockRepository.count();
		System.out.println("Added" + totalNoOfTransactions);
		
		return "PRINTED";
	}
	
	//Should add all Monthly data into an PDF Sheet & Should send to a mail id. 
	// PDF name should be "YMonthly report of $monthname, Todate to fromdate"
	public String getMonthlyReport() {
		return "PRINTED";
	}
	
	// Should add all Yearly data into an PDF Sheet & Should send to a mail id.
	// PDF name should be "Yearly report of $yearname, Todate to fromdate"
	public String getYearlyReport() {
		return "PRINTED";
	}
}