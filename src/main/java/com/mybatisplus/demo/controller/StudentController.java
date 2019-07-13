package com.mybatisplus.demo.controller;

import com.mybatisplus.demo.entity.Student;
import com.mybatisplus.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.resource.HttpResource;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Joseph.L
 * @date
 * @description
 */
@RestController
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
    @RequestMapping("/get1/{id}")
    public Student get1(@PathVariable("id") int id) {
        return service.get(id);
    }

    @ResponseBody
    @RequestMapping("/list")
    public List<Student> list() {
        List<Student> list = service.list();
        return list;
    }

    @ResponseBody
    @RequestMapping("/selectCount")
    public int selectCount() {
        return service.selectCount();
    }

    @ResponseBody
    @RequestMapping("/listCount")
    public int listCount() {
        return service.listCount();
    }


    @ResponseBody
    @RequestMapping("/login")
    public String login(HttpServletResponse response) throws Exception {
        String str="OK";
        String username = "Name:test123";
        String password = "Password:test123";
        Cookie c1 = new Cookie("loginName", username);
        c1.setPath("/");
        response.addCookie(c1);
        return str;
    }
}
