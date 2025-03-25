package com.liquor_store.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liquor_store.project.Entity.SoldStock;

public interface SoldStockRepository extends JpaRepository<SoldStock, Long> {

}
