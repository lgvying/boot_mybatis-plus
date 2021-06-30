package com.zut.boot.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.zut.boot.pojo.Teacher;
import com.zut.boot.service.TeacherService;
import com.zut.boot.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

/**
 * @author 梁贵莹
 * @create 2021/6/30 下午 10:49
 */
@RestController
@RequestMapping("/")
public class TeacherConterller {
    @Autowired
    private TeacherService teacherService;

    /**
     * 增加一个
     * @param teacher
     * @return
     */
    @PostMapping
    public ResponseVo<String> addOne(Teacher teacher){
        return teacherService.addOne(teacher);
    }

    /**
     * 删除一个
     * @param tid
     * @return
     */
    @DeleteMapping
    public ResponseVo<String> deleteOne(Integer tid){
        return teacherService.deleteOne(tid);
    }

    /**
     * 修改一个
     * @param teacher
     * @return
     */
    @PutMapping
    public ResponseVo<String> updateOne(Teacher teacher){
        return teacherService.updateOne(teacher);
    }

    /**
     * 查询一个
     * @param tid
     * @return
     */
    @RequestMapping(value = "/getOne/{tid}",method = RequestMethod.GET)
    public ResponseVo<Teacher> getOneByTid(@PathVariable("tid") Integer tid){
        return teacherService.getOneByTid(tid);
    }

    /**
     * 查询所有
     * @return
     */
    @RequestMapping(value = "/getAll",method = RequestMethod.GET)
    public ResponseVo<List<Teacher>> getAll(){
        return teacherService.getAll();
    }

    /**
     * 分页查询
     * @param pageNumber
     * @param pageSize
     * @return
     */
    @RequestMapping(value = "/getFenYe/{pageNumber}/{pageSize}",method = RequestMethod.GET)
    public ResponseVo<IPage<Teacher>> getFenYe(@PathVariable("pageNumber")Integer pageNumber,
                                               @PathVariable("pageSize")Integer pageSize){
        return teacherService.getFenYe(pageNumber,pageSize);
    }

    /**
     * 根据条件查询
     * @param tsex
     * @param createTime
     * @param updateTime
     * @return
     */
    @RequestMapping(value = "/getListByTJ/{tsex}/{createTime}/{updateTime}",method = RequestMethod.GET)
    public ResponseVo<List<Teacher>> getListByTJ(@PathVariable("tsex")String tsex,
                                                 @PathVariable("createTime")Date createTime,
                                                 @PathVariable("updateTime")Date updateTime){
        return teacherService.getListByTJ(tsex,createTime,updateTime);
    }
}
