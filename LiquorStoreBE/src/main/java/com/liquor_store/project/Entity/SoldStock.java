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
@Table(name="SOLD_STOCK")
public class SoldStock {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="ID")
	public long id;
	
	@Column(name ="BRAND")	
	public String brand;
	
	@Column(name ="NAME")
	public String name;
	
	@Column(name ="SIZE")
	public String size;
	
	@Column(name ="QUANTITY")
	public Long quantity;
	
	@Column(name ="CODE")
	public String code;
	
	@Column(name="IS_AlCOHOL")
	public boolean Alcohol;

	@Column(name="DATE_TIME")
	public String datetime;
	
	@Column(name="ONLINE_PAYMENT")
	public boolean online;
	
	@Column(name="MODE_OF_PAYMENT")
	public String modeOfPayment;
	
	@Column(name ="PRICE")
	public double price;
	
	@Column(name="TAX")
	public double tax;
	
	@Column(name="CUSTOMER_NAME")
	public String customerName;
	
	@Column(name="EMAIL_ID")
	public String emailId;
	
	@Column(name="PHONE_NUMBER")
	public Long phoneNumber;
}