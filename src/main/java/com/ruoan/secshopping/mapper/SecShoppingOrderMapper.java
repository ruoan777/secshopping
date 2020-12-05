package com.ruoan.secshopping.mapper;

import com.ruoan.secshopping.entity.SecShoppingOrder;
import com.ruoan.secshopping.util.MyMapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;

/**
 * @author ruoan
 */
public interface SecShoppingOrderMapper extends MyMapper<SecShoppingOrder> {
    /**
     * @param secShoppingId 秒杀的商品id
     * @param userPhone     用户手机号
     * @param money         秒杀金额
     * @return 返回该sql更新的记录数，如果>=1则表示更新成功
     */
    long insertSuccessOrdered(
            @Param("secShoppingId") Long secShoppingId,
            @Param("userPhone") Long userPhone,
            @Param("money") BigDecimal money);

    /**
     * 根据秒杀商品ID查询订单明细数据并得到对应秒杀商品的数据，因为我们再SeckillOrder中已经定义了一个Seckill的属性
     *
     * @param secShoppingId 秒杀的商品id
     * @param userPhone     用户手机号
     * @return 找到的实体
     */
    SecShoppingOrder findById(
            @Param("secShoppingId") Long secShoppingId, @Param("userPhone") Long userPhone);
}
