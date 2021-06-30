package com.zut.boot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zut.boot.pojo.Teacher;
import org.springframework.stereotype.Repository;

/**
 * @author 梁贵莹
 * @create 2021/6/30 下午 8:45
 */
//在对应的Mapper上继承基本的类BaseMapper
@Repository
public interface TeacherMapper extends BaseMapper<Teacher> {
}
