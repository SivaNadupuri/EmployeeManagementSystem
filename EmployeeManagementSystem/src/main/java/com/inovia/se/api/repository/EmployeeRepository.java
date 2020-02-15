/**
 * 
 */
package com.inovia.se.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inovia.se.api.model.Employee;

/**
 * @author siva
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
