package com.liquor_store.project.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.liquor_store.project.Entity.Liquor;

@RestController
@RequestMapping("/LiquorStore")
public class LQController {

	@PostMapping("/adddata")
		public String addBottles() {
			return "Bottle";
		}
	
	@GetMapping("/getdata")
		public Liquor getBottles(Liquor liquor) {
			return "Bottle";
		}
	
	@PutMapping("/updatedata")
		public String updateBottles() {
			return "Bottle";
		}
	
	@DeleteMapping("/deletedata")
		public String deleteBottles() {
			return "Bottle";
		}
}
