package com.zut.boot.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zut.boot.pojo.Teacher;
import com.zut.boot.vo.ResponseVo;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @author 梁贵莹
 * @create 2021/6/30 下午 9:45
 */
public interface TeacherService {
    ResponseVo<String> addOne(Teacher teacher);
    ResponseVo<String > deleteOne(Integer tid);
    ResponseVo<String> updateOne(Teacher teacher);
    ResponseVo<Teacher> getOneByTid(Integer tid);
    ResponseVo<List<Teacher>> getAll();
    ResponseVo<IPage<Teacher>> getFenYe(Integer pageNumber, Integer pageSize);
    ResponseVo<List<Teacher>> getListByTJ(String  tsex, Date time,Date time2);
}
