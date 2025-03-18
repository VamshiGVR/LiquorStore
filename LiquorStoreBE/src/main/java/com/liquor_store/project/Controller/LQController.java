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
import com.liquor_store.project.Service.LQService;

@RestController
@RequestMapping("/LiquorStore")
public class LQController {
	
	private LQService lqService;
	
	public LQController(LQService lqService) {
		this.lqService =lqService;
	}

	@PostMapping("/adddata")
		public Liquor addBottles(@RequestBody Liquor liquor) {
			return lqService.addBottles(liquor);
		}
	
	@GetMapping("/getalldata")
		public List<Liquor> getAllBottles(@RequestBody Liquor liquor) {
			return lqService.getallBottles(liquor);
		}
	
	@GetMapping("/getdata")
	public Liquor getBottles(@RequestBody Liquor liquor) {
		return lqService.getBottles(liquor);
	}
	
	@PutMapping("/updatedata")
		public String updateBottles() {
			return "Bottle";
		}
	
	@DeleteMapping("/deletedata")
		public String deleteBottles(@RequestBody Liquor liquor) {
			return lqService.deleteBottles(liquor);
		}
}
