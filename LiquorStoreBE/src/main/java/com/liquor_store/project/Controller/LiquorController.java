package com.liquor_store.project.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liquor_store.project.Entity.Liquor;
import com.liquor_store.project.Service.LiquorService;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/LiquorStore")
public class LiquorController {
	
	private LiquorService lqService;
	
	public LiquorController(LiquorService lqService) {
		this.lqService =lqService;
	}

	@PostMapping("/AddLiquorStock")
		public Liquor addBottles(@RequestBody Liquor liquor) {
			return lqService.addBottles(liquor);
		}
	
	@GetMapping("/GetAllLiquorStock")
		public List<Liquor> getAllBottles() {
			return lqService.getAllBottles();
		}
	
	@GetMapping("/GetLiquorStock")
	public Liquor getBottles(@RequestBody Liquor liquor) {
		return lqService.getBottles(liquor);
	}
	
	@PutMapping("/UpdateLiquorStock")
		public String updateBottles(@RequestBody Liquor liquor) {
			return lqService.updateBottles(liquor);
		}
	
	@DeleteMapping("/DeleteLiquorStock")
		public String deleteBottles(@RequestBody Liquor liquor) {
			return lqService.deleteBottles(liquor);
		}
		
    @PostMapping("/SendEmailOfLiquorStock")
    public String sendDataEmail(@RequestBody Liquor  liquor) {
        return lqService.sendDataEmail(liquor);
    }
}
