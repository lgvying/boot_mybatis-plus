package com.zut.boot.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 梁贵莹
 * @create 2021/6/30 下午 8:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("tab_student")
public class Student {
        @TableId(value = "sid",type = IdType.AUTO)
        private Integer sid;
        private String sname;
        private String spwd;
        private String sphoto;
        private Integer sflag;
        private String email;
}
