package com.ruoan.secshopping.dto;

import lombok.Data;

/**
 * @Author: ruoan
 * Date: 2020/12/5 11:59 下午
 * @Description:
 */
@Data
public class Exposer {

    /**
     * 是否开启秒杀
     */
    private boolean exposed;

    /**
     * 加密措施，避免用户通过抓包拿到秒杀地址
     */
    private String md5;

    /**
     * Id
     */
    private long secShoppingId;

    /**
     * 系统当前时间（毫秒）
     */
    private long now;

    /**
     * 秒杀开启时间
     */
    private long start;

    /**
     * 秒杀结束时间
     */
    private long end;
}
