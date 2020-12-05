package com.ruoan.secshopping.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author ruoan
 */
@Table(name = "sec_shopping_order")
@Data
public class SecShoppingOrder {
    /**
     * 秒杀商品ID
     */
    @Id
    @Column(name = "secshopping_id")
    private Long secShoppingId;

    /**
     * 用户手机号
     */
    @Id
    @Column(name = "user_phone")
    private Long userPhone;

    /**
     * 支付金额
     */
    private BigDecimal money;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 状态：-1无效 0成功 1已付款
     */
    private Byte state;

    /**
     * 秒杀商品，和订单是一对多的关系
     */
    private SecShopping secShopping;
}
