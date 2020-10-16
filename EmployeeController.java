package com.controller;
import com.dao.EmployeeDao;
import com.model.Employee;
import org.springframework.web.bind.annotation.Autowired;
//import org.springframework.web.bind.annotation.Getmapping;

@Controller
public class EmployeeController {
	// service
@Autowired
private EmployeeDao employeeDao;

@GetMapping("/read")
public String readFunction(@RequestParam("employeeNumber" ) int val, Model model)
{​​
Employee obj = employeeDao.readEmployeeById(val);
model.addAttribute("key1", obj);
return "success";
}​​
}​​
