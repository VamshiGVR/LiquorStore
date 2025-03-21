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
	public Long id;
	
	@Column(name ="LIQUOR_BRAND")
	public String brand;
	
	@Column(name ="LIQUOR_NAME")
	public String name;
	
	@Column(name ="SIZE")
	public String size;
	
	@Column(name ="QUANITY")
	public Long quanity;
	
	@Column(name ="PRICE")
	public double price;
	
	@Column(name ="CODE")
	public long code;

}
