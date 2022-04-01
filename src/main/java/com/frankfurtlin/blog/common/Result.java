package com.frankfurtlin.blog.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author Frankfurtlin
 * @version 1.0
 * @date 2022/4/1 14:49
 */
@Data
public class Result implements Serializable {
    private String code;
    private String msg;
    private Object data;

    public static Result success(String msg, Object data){
        Result result = new Result();
        result.setCode("0");
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result success(Object data){
        Result result = new Result();
        result.setCode("0");
        result.setMsg("操作成功");
        result.setData(data);
        return result;
    }

    public static Result fail(String msg, Object data){
        Result result = new Result();
        result.setCode("-1");
        result.setMsg(msg);
        result.setData(data);
        return result;
    }

    public static Result fail(String msg){
        Result result = new Result();
        result.setCode("-1");
        result.setMsg(msg);
        result.setData(null);
        return result;
    }
}
