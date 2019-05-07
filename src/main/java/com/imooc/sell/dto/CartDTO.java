package com.imooc.sell.dto;

import lombok.Data;

@Data
public class CartDTO {
    /**前端回传数据商品id*/
    private String productId;

    /**前端回传数据商品数量*/
    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
