package com.ruoan.secshopping.mapper;

import com.ruoan.secshopping.BaseTest;
import com.ruoan.secshopping.entity.SecShoppingOrder;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.List;

public class SecShoppingOrderMapperTest extends BaseTest {

    @Autowired
    private SecShoppingOrderMapper secShoppingOrderMapper;

    @Test
    public void insertOneTest() {
        long res = secShoppingOrderMapper.insertSuccessOrdered(1L, 18817551234L, BigDecimal.valueOf(100));
        System.out.println(1);
    }

    @Test
    public void testSelectOne() {
        SecShoppingOrder secShoppingOrder = new SecShoppingOrder();
        secShoppingOrder.setSecShoppingId(1L);
        secShoppingOrder.setUserPhone(18817551234L);
        List<SecShoppingOrder> secShoppingOrders = secShoppingOrderMapper.select(secShoppingOrder);
        System.out.println(secShoppingOrders);
    }

    @Test
    public void testInsertSuccessOrdered() {
        Long secShoppingId = 1L;
        Long userPhone = 18812344321L;
        BigDecimal money = new BigDecimal(100);
        long l = secShoppingOrderMapper.insertSuccessOrdered(secShoppingId, userPhone, money);
    }

    @Test
    public void testFindById() {
        Long secShoppingId = 1L;
        Long userPhone = 18817551234L;
        SecShoppingOrder secShoppingOrder = secShoppingOrderMapper.findById(secShoppingId, userPhone);
        System.out.println(secShoppingOrder);
    }
}