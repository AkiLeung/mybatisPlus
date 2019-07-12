package com.mybatisplus.demo.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.mybatisplus.demo.entity.Student;
import com.mybatisplus.demo.mapper.IStudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentMapper mapper;

    public int insert(Student model) {
        return mapper.insert(model);
    }

    public int delete(int id) {
        return mapper.deleteById(id);
    }

    public int update(Student model) {
        //更新全部字段，但可以跟application.yml中的field-strategy字段策略相配合，不更新为null或为空的字段
        return mapper.updateById(model);
        //更新全部字段，且不可为NULL
        //return mapper.updateAllColumnById(model);
    }

    public Student get(int id) {
        return mapper.selectById(id);
    }

    public List<Student> list() {
        EntityWrapper ew = new EntityWrapper();
        ew.where("1={0}", 1);
        return mapper.selectList(ew);
    }

    /**
     * 调用自定义方法
     */
    public Integer selectCount() {
        EntityWrapper<Student> qryWrapper = new EntityWrapper<>();
        qryWrapper.where("  1=1");
        return mapper.selectCount(qryWrapper);
    }

    /**
     * 调用自定义方法
     */
    public int listCount() {
        return mapper.listCount();
    }
}
