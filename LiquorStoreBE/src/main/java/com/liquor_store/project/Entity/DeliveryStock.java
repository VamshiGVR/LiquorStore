package com.liquor_store.project.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table
public class DeliveryStock {
	@Id
	public long id;
	
	@Column(name="DELIVERY_DATE")
	public String delivery_date;
	
	@Column(name="CODE")
	public String code;
}
