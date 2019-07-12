package com.mybatisplus.demo.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.io.Serializable;

/**
 * @author Joseph.L
 * @date
 * @description
 */
@Data
@TableName("student")
public class Student implements Serializable {

    @TableId(value = "id", type = IdType.AUTO)
    private int id;
    private String name;
    private int sex;
    private String note;

}
