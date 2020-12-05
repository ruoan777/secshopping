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
@Table(name = "sec_shopping")
@Data
public class SecShopping {
    /**
     * 商品id
     */
    @Id
    @Column(name = "secshopping_id")
    private Long secShoppingId;

    /**
     * 商品标题
     */
    private String title;

    /**
     * 商品图片
     */
    private String image;

    /**
     * 商品原价格
     */
    private BigDecimal price;

    /**
     * 商品秒杀价格
     */
    @Column(name = "cost_price")
    private BigDecimal costPrice;

    /**
     * 剩余库存数量
     */
    @Column(name = "stock_count")
    private Long stockCount;

    /**
     * 秒杀开始时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "start_time")
    private Date startTime;

    /**
     * 秒杀结束时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "end_time")
    private Date endTime;

    /**
     * 创建时间
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    @Column(name = "create_time")
    private Date createTime;
}
