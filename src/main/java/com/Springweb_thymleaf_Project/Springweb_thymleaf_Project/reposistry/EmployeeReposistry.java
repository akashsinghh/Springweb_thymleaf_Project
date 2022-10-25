package com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.reposistry;

import com.Springweb_thymleaf_Project.Springweb_thymleaf_Project.model.Employesss;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeReposistry extends JpaRepository<Employesss,Long> {
}
