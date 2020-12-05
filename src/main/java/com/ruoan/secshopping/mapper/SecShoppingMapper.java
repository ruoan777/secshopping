package com.ruoan.secshopping.mapper;

import com.ruoan.secshopping.entity.SecShopping;
import com.ruoan.secshopping.util.MyMapper;
import io.lettuce.core.dynamic.annotation.Param;

import java.util.Date;

/**
 * @author ruoan
 */
public interface SecShoppingMapper extends MyMapper<SecShopping> {

    /**
     * 减库存。 对于Mapper映射接口方法中存在多个参数的要加@Param()注解标识字段名称，不然Mybatis不能识别出来哪个字段相互对应
     *
     * @param secShoppingId 秒杀商品ID
     * @param killTime      秒杀时间
     * @return 返回此SQL更新的记录数，如果>=1表示更新成功
     */
    int reduceStock(@Param("secShoppingId") long secShoppingId, @Param("killTime") Date killTime);
}
