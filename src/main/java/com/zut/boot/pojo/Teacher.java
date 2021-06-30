package com.zut.boot.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**实现一个需求：
 老师登录  实现学生的增删改查
 老师注册：邮箱激活
 老师字段：t_flag
 0 可用
 -1 未激活
 学生：s_flag 0可见  1 逻辑删除
 注册：给注册邮箱发一个超链接：：：注册不能有延迟
 注册：每隔10分钟给游客发送邮件：提醒他 激活
 自己研究 怎么停止定时任务
 * @author 梁贵莹
 * @create 2021/6/30 下午 8:24
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tab_teacher")
public class Teacher {
    @TableId(value = "tid",type = IdType.AUTO)
    private Integer tid;
    private String tname;
    private String tpwd;
    private String temail;
    private String tphone;
    private String tsex;
    private Integer tFlag;
}
