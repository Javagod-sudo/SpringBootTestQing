package com.example.springboottestqing.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("teach")
public class Teach {
    @TableId(type = IdType.AUTO)
    private int teachId;

    private int courseId;

    @TableField(exist = false)
    private String courseName;

    private int teacherId;

    @TableField(exist = false)
    private String teacherName;

    private String classroomId;

}
