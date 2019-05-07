package com.imooc.sell.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/*http外层商品包含类目*/
@Data
public class ProductVO {
    @JsonProperty("name")
//    private String CategoryName;
    private String name;

    @JsonProperty("type")
//    private Integer CategoryType;
    private Integer type;

    @JsonProperty("foods")
    private List<ProductInfoVO> productInfoVOList;
}
