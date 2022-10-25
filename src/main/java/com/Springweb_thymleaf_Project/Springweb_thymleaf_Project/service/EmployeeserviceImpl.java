//package com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.service;
//
//import com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.model.Employesss;
//import com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.reposistry.EmployeeReposistry;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class EmployeeserviceImpl implements EmployeeService {
//    @Autowired
//    EmployeeReposistry employeeReposistry;
//
//
//    @Override
//    public List<Employesss> getAllEmployesss() {
//        return employeeReposistry.findAll();
//    }
//
//    @Override
//    public void saveEmployee(Employesss employesss) {
//        this.employeeReposistry.save(employesss);
//
//    }
//
//
//    @Override
//    public Employesss getEmployeeById(Long id) {
//        Optional<Employesss > optional=employeeReposistry.findById(id);
//        Employesss employesss=null;
//        if(optional.isPresent()){
//            employesss=optional.get();
//        }else {
//            throw new RuntimeException("employee not found ::"+id );
//
//        }
//        return employesss;
//    }
//}
