package com.ruoan.secshopping.service;

import com.ruoan.secshopping.dto.Exposer;
import com.ruoan.secshopping.dto.SecShoppingExecution;
import com.ruoan.secshopping.entity.SecShopping;
import com.ruoan.secshopping.exception.RepeatShoppingException;
import com.ruoan.secshopping.exception.SecShoppingCloseException;
import com.ruoan.secshopping.exception.SecShoppingException;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: ruoan
 * Date: 2020/12/5 11:56 下午
 * @Description:
 */
public interface SecShoppingService {

    /**
     * 获取所有秒杀商品的列表
     *
     * @return 获取所有秒杀商品的列表
     */
    List<SecShopping> findAll();

    /**
     * 获取某一条商品秒杀信息
     *
     * @param secShoppiongId 商品id
     * @return 输入商品id对应的具体信息
     */
    SecShopping findById(Long secShoppiongId);

    /**
     * 秒杀开始时输出暴露秒杀的地址
     * 否者输出系统时间和秒杀时间
     *
     * @param secShoppiongId 商品id
     * @return 暴露秒杀地址的dto
     */
    Exposer exportSecShoppingUrl(Long secShoppiongId);


    /**
     * /**
     * 执行具体的秒杀操作
     *
     * @param secShoppiongId 商品id
     * @param money          金额
     * @param userPhone      秒杀用户的手机号
     * @param md5            标识接口暴露接口是否合法的md5
     * @return 秒杀执行的dto
     * @throws SecShoppingException      秒杀系统抛出的最大的异常
     * @throws RepeatShoppingException   重复秒杀异常
     * @throws SecShoppingCloseException 秒杀已关闭异常
     */
    SecShoppingExecution executeSecShopping(Long secShoppiongId, BigDecimal money, Long userPhone, String md5)
            throws SecShoppingException, RepeatShoppingException, SecShoppingCloseException;

}
