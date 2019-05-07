package com.imooc.sell.service;

public interface SecKillService {
    /**
     * 秒杀查询
     * @param productId
     * @return
     */
    String querySecKillProductInfo(String productId);

    /**
     * 秒杀
     * @param productId
     * @return
     */
    void orderProductMockDiffUser(String productId);
}
