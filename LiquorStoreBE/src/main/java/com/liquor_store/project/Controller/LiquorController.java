package com.liquor_store.project.Controller;

import java.util.List;

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
@RequestMapping("/LiquorStore")
public class LiquorController {
	
	private LiquorService lqService;
	
	public LiquorController(LiquorService lqService) {
		this.lqService =lqService;
	}

	@PostMapping("/AddData")
		public Liquor addBottles(@RequestBody Liquor liquor) {
			return lqService.addBottles(liquor);
		}
	
	@GetMapping("/GetAllData")
		public List<Liquor> getAllBottles() {
			return lqService.getallBottles();
		}
	
	@GetMapping("/GetData")
	public Liquor getBottles(@RequestBody Liquor liquor) {
		return lqService.getBottles(liquor);
	}
	
	@PutMapping("/UpdateData")
		public String updateBottles(@RequestBody Liquor liquor) {
			return lqService.updateBottles(liquor);
		}
	
	@DeleteMapping("/DeleteData")
		public String deleteBottles(@RequestBody Liquor liquor) {
			return lqService.deleteBottles(liquor);
		}
		
    @PostMapping("/SendEmail")
    public String sendDataEmail(@RequestBody Liquor  liquor) {
        return lqService.sendDataEmail(liquor);
    }
}
