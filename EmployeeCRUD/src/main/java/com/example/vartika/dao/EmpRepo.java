package com.example.vartika.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.vartika.model.Employee;

public interface EmpRepo extends JpaRepository<Employee, Integer>{

}
