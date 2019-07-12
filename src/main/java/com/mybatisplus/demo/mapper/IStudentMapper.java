package com.mybatisplus.demo.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.mybatisplus.demo.entity.Student;
import org.springframework.stereotype.Component;
/**
 * @author JOSEPH.L
 */
@Component
public interface IStudentMapper extends BaseMapper<Student> {
    /**
     * 统计个数
     */
    int listCount();
}
