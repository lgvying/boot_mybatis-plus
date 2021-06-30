package com.zut.boot.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 梁贵莹
 * @create 2021/6/30 下午 9:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseVo<T> {
    private String message;
    private Integer status;
    private T data;
}
