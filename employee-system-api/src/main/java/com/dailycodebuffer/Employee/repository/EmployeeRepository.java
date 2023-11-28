package com.dailycodebuffer.Employee.repository;

import com.dailycodebuffer.Employee.entity.EmployeeEntity;
import com.dailycodebuffer.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long>{
}
