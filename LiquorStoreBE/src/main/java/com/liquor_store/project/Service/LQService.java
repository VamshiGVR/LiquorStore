package com.liquor_store.project.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.liquor_store.project.Entity.Liquor;
import com.liquor_store.project.Repository.LQRepository;

@Service
public class LQService {
	
	private LQRepository lqRepository;
	private final EmailService emailService;
	
	public LQService(LQRepository lqRepository,EmailService emailService ) {
		this.lqRepository =lqRepository;
		this.emailService = emailService;
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
		System.out.println("here" + liquor.id);
		existLiquor.id = liquor.id;
		existLiquor.brand = liquor.brand;
		existLiquor.name = liquor.name;
		existLiquor.size = liquor.size;
		existLiquor.quantity = liquor.quantity;
		existLiquor.price = liquor.price;
		existLiquor.code = liquor.code;
		lqRepository.save(existLiquor);
		return "Bottle With ID: "+ existLiquor.id + " is updated" 
				+" "+"BRAND: "+ liquor.brand 
				+" "+"NAME: " + liquor.name
				+" "+"SIZE: " + liquor.size
				+" "+"QUANTITY: " + liquor.quantity
				+" "+"PRICE: "+ liquor.price ;
	}

	public String deleteBottles(Liquor liquor) {
		lqRepository.deleteById(liquor.id);
		return "DELETED Bottle With ID: "+ liquor.id;
	}
	
	public String sendDataEmail(Liquor liquor) {
	  /*  if (liquor == null || liquor.id == null) {
	        throw new IllegalArgumentException("Invalid liquor data. ID is missing.");
	    }*/

	    Liquor existLiquor = lqRepository.findById(liquor.id)
	            .orElseThrow(() -> new RuntimeException("Bottle not found....."));

	    String subject = "BOTTLE DATA REQUEST " + existLiquor.id + ": " + existLiquor.brand + " " + existLiquor.name;
	    
	    String body = String.format(
	        "Dear Customer,\n\n" +
	        "A bottle data request has been made:\n\n" +
	        "Brand: %s\n" +
	        "Name: %s\n" +
	        "Size: %s\n" +
	        "Price: %.2f\n\n" +
	        "Thank you,\n" +
	        "LQ Team",
	        existLiquor.brand, existLiquor.name, existLiquor.size, existLiquor.price
	    );

	    emailService.sendEmail(subject, body);
	    
	    return "EMAIL SENT SUCCESSFULLY!!!!";
	}

}
