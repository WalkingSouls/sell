package com.imooc.sell.enums;
/*商品状态*/

import lombok.Data;
import lombok.Getter;

@Getter
public enum ProductStatusEnum implements CodeEnum{
    UP(0,"在架"),DOWN(1,"下架")
    ;
    private Integer code;

    private String msg;

    ProductStatusEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
