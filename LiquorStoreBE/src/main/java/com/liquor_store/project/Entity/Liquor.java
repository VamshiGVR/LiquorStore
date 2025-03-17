package com.liquor_store.project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="LIQUOR")
public class Liquor {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	
	@Column(name ="LIQUOR_BRAND")
	private String brand;
	
	@Column(name ="LIQUOR_NAME")
	private String name;
	
	@Column(name ="SIZE")
	private String size;
	
	@Column(name ="QUANITY")
	private Long quanity;
	
	@Column(name ="PRICE")
	private double price;
	
	@Column(name ="CODE")
	private long code;
	
		

}
