package ua.com.vitkovska.springbootthymeleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ua.com.vitkovska.springbootthymeleaf.dao.EmployeeDao;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    private EmployeeDao employeeDao;

    @GetMapping
    public String getAll(Model model){
        model.addAttribute("employeeList",employeeDao.findAll());
        return "employee-list";
    }
}
