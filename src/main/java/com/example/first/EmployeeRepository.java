package com.example.first;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
import com.example.first.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
