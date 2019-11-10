package com.db.project.springboot.dao;

import com.db.project.springboot.pojo.University;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniversityDao extends JpaRepository<University, Integer> {
}
