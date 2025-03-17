package com.liquor_store.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liquor_store.project.Entity.Liquor;

public interface LQRepository extends JpaRepository<Liquor, Long>{

}
