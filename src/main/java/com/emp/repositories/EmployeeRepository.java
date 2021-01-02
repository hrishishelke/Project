/**
 * 
 */
package com.emp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emp.entity.Employee;

/**
 * @author HP
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	}



