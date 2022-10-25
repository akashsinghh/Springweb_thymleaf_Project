package com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.service;

import com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.model.Studentts;
import com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.reposistry.Studentreposistry;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentserviceImpl implements StudentService {
    @Autowired
    Studentreposistry studentreposistry;
    public StudentserviceImpl(Studentreposistry studentreposistry){
        super();
        this.studentreposistry=studentreposistry;

    }
    @Override
    public List<Studentts> getallStudent() {
        return studentreposistry.findAll();
    }
}
