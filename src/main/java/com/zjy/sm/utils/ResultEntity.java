package com.zjy.sm.utils;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName ResultEntity
 * @Description TODO
 * @Author Z
 * @Date 2020/11/17
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ResultEntity {
    private  int code;
    private String message;
    private Object data;
}
