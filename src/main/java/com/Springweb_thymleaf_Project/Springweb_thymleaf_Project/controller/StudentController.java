//package com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.controller;
//
//import com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.service.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//
//@Controller
//public class StudentController {
//    @Autowired
//    StudentService studentService;
//    public StudentController(StudentService studentService){
//        super();
//        this.studentService=studentService;
//    }
//    @GetMapping("/students")
//    public String listStudents(Model model){
//        model.addAttribute("students",studentService.getallStudent());
//        return "students";
//    }
//}
