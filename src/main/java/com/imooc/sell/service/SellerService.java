package com.imooc.sell.service;

import com.imooc.sell.dataobject.SellerInfo;

public interface SellerService {
    /**
     * 查询卖家端登录信息
     * @param openid
     * @return
     */
    SellerInfo findSellerInfoByOpenid(String openid);
}
