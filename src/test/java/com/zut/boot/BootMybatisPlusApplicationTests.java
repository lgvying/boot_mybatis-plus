package com.zut.boot;

import com.zut.boot.controller.TeacherConterller;
import com.zut.boot.mapper.TeacherMapper;
import com.zut.boot.pojo.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BootMybatisPlusApplicationTests {
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private TeacherConterller teacherConterller;

    @Test
    void contextLoads() {
    }
    @Test
    void getOneByTid(){
        Teacher teacher = teacherMapper.selectById(1);
        System.out.println(teacher.getTname());
    }
    @Test
    void c1(){
        Teacher teacher=new Teacher();
        teacher.setTname("李伟");
        teacher.setTemail("1234@163.com");
        teacher.setTphone("123");
        System.out.println(teacherConterller.addOne(teacher));
    }

}
