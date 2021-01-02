package com.emp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.entity.WorkExperience;


	
	@Repository
	public interface WorkExperienceRepository extends JpaRepository<WorkExperience, Integer> {

	}


