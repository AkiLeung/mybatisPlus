package com.mybatisplus.demo.controller;

import com.mybatisplus.demo.entity.Student;
import com.mybatisplus.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Joseph.L
 * @date
 * @description
 */
@Controller
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService service;

    @ResponseBody
    @RequestMapping("/insert")
    public int insert() {
        Student model = new Student();
        model.setName("test0001");
        model.setSex(1);
        model.setNote("123456 - notes insert");
        return service.insert(model);
    }

    @ResponseBody
    @RequestMapping("/delete")
    public int delete(int id) {
        return service.delete(id);
    }

    @ResponseBody
    @RequestMapping("/update")
    public int update() {
        Student model = new Student();
        model.setId(7);
        model.setName("test0002");
        model.setSex(0);
        model.setNote("123456 - notes update");
        return service.update(model);
    }

    @ResponseBody
    @RequestMapping("/get")
    public Student get(int id) {
        return service.get(id);
    }

    @ResponseBody
    @RequestMapping("/list")
    public List<Student> list() {
        List<Student> list = service.list();
        return list;
    }

    @ResponseBody
    @RequestMapping("/listCount")
    public int listCount() {
        return service.listCount();
    }
}
