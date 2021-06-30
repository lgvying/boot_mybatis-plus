package com.zut.boot.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.zut.boot.mapper.TeacherMapper;
import com.zut.boot.pojo.Teacher;
import com.zut.boot.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/30 下午 9:50
 */
@Service
public class TeacherServiceImpl implements TeacherService{
    @Autowired
    private TeacherMapper teacherMapper;

    /**
     * 添加老师
     * @param teacher
     * @return
     */
    @Override
    public ResponseVo<String> addOne(Teacher teacher) {
        teacherMapper.insert(teacher);
        return new ResponseVo<>("添加老师"+teacher.getTname()+"成功",200,null);
    }

    /**
     * 根据id删除老师
     * @param tid
     * @return
     */
    @Override
    public ResponseVo<String> deleteOne(Integer tid) {
        teacherMapper.deleteById(tid);
        return new ResponseVo<>("删除id为"+tid+"的老师成功",200,null);
    }

    /**
     * 更新老师信息
     * @param teacher
     * @return
     */
    @Override
    public ResponseVo<String> updateOne(Teacher teacher) {
        teacherMapper.update(teacher,null);
        return new ResponseVo<>("更新老师"+teacher.getTname()+"成功",200,null);
    }

    /**
     * 根据id获取老师信息
     * @param tid
     * @return
     */
    @Override
    public ResponseVo<Teacher> getOneByTid(Integer tid) {
        Teacher teacher = teacherMapper.selectById(tid);
        return new ResponseVo<>("获取id为"+tid+"的老师成功",200,teacher);
    }

    /**
     * 获取所有
     * @return
     */
    @Override
    public ResponseVo<List<Teacher>> getAll() {
        List<Teacher> list = teacherMapper.selectList(null);
        return new ResponseVo<>("获取所有的老师成功",200,list);
    }

    /**
     * 分页查询
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @Override
    public ResponseVo<IPage<Teacher>> getFenYe(Integer pageNumber,Integer pageSize) {
        Page<Teacher> page=new Page<>(pageNumber,pageSize);
        IPage<Teacher> page1 = teacherMapper.selectPage(page, null);
        return new ResponseVo<>("获取第"+pageNumber+"页，"+pageSize+"条数据成功",200,page1);
    }
    /**
     * 根据性别或者创建时间在如期之后查询，并且按更新时间降序排序
     */
    /**
     * 根据性别或者状态进行查询
     * @param tsex
     * @param time
     * @return
     */
    @Override
    public ResponseVo<List<Teacher>> getListByTJ(String tsex, Date time,Date time2) {
        QueryWrapper<Teacher> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("tsex",tsex)
                    .or()
                    .gt("create_time",time)
                    .orderByDesc("update_time");
        List<Teacher> list = teacherMapper.selectList(queryWrapper);
        return new ResponseVo<>("获取性别为"+tsex+"或者用户创建时间大于"+time+"并且根据用户信息更新时间查询成功",200,list);
    }
}
