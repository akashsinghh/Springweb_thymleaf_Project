//package com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.controller;
//
//import com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.model.Employesss;
//import com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.service.EmployeeService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//@Controller
//public class EmployessController {
//    @Autowired
//    EmployeeService employeeService;
//
//    @RequestMapping("/")
//    public String viewpage(Model model) {
//        model.addAttribute("listofemployesss", employeeService.getAllEmployesss());
//        return "index";
//    }
//
//    @GetMapping("/showNewEmployeeForm")
//    public String showNewEmployeeForm(Model model) {
//        // create model attribute to bind form data
//        Employesss employesss=new Employesss();
//        model.addAttribute("employesss",employesss);
//        return "new_employee";
//    }
//
//    @PostMapping("/saveEmployee")
//    public String saveEmployee(@ModelAttribute("employesss") Employesss employesss) {
//        // save employee to database
//        employeeService.saveEmployee(employesss);
//        return "redirect:/";
//
//    }
//
//    @GetMapping("/showFormForUpdate/{id}")
//    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model) {
//        Employesss employesss = employeeService.getEmployeeById(id);
//        model.addAttribute("employees", employesss);
//        return "Update_employee";
//    }
//}
//
//
