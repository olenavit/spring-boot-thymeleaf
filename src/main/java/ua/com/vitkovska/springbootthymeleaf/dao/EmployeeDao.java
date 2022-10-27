package ua.com.vitkovska.springbootthymeleaf.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.vitkovska.springbootthymeleaf.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer> {
}
