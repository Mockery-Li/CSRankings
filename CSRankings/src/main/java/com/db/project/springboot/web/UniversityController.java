package com.db.project.springboot.web;

import com.db.project.springboot.dao.UniversityDao;
import com.db.project.springboot.pojo.University;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UniversityController {

    @Autowired
    UniversityDao universityDao;

    @RequestMapping("/demo")
    public String listUniversities(Model model) {
        List<University> list = universityDao.findAll();
        model.addAttribute("all", list);
        return "demo";
    }
}
