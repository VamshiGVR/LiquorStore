package com.liquor_store.project.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.liquor_store.project.Entity.Liquor;

public interface LiquorRepository extends JpaRepository<Liquor, Long>{

}
