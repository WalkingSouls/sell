package com.imooc.sell.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

/*http请求返回最外层对象*/
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultVO<T> {
    /*错误码*/
    private Integer code;
    /*提示信息*/
    private String msg;
    /*返回具体内容*/
    private T data;

    public ResultVO() {
    }

    public ResultVO(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public ResultVO(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }
}
