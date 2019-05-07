package com.imooc.sell.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Data
@Component
@ConfigurationProperties(prefix = "wechat")
public class WechatAccountConfig {
    /**
     * 公众平台id
     */
    private String mpAppId;
    /**
     * 公众平台秘钥
     */
    private String mpAppSecrect;
    /**
     * 开放平台id
     */
    private String openAppId;
    /**
     * 开放平台秘钥
     */
    private String openAppSecrect;

    /**
     * 商户号
     */
    private String mchId;

    /**
     * 商户密匙
     */
    private String mchKey;

    /**
     * 商户证书路径
     */
    private String keyPath;

    /**
     * 异步通知地址
     */
    private String notyfyUrl;
    /**
     * 微信模板Id
     */
    private Map<String, String> templateId;
}
