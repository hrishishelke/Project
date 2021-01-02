package com.emp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.entity.EmpContact;


	
	
	@Repository
	public interface EmpContactRepository extends JpaRepository<EmpContact, Integer> {

	}

	





