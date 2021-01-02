

package com.emp.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.entity.EducationalGap;
import com.emp.entity.Employee;


@Repository
public interface EducationalGapRepository extends JpaRepository<EducationalGap, Integer> {


	

}
