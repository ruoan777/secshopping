package com.ruoan.secshopping.mapper;

import com.ruoan.secshopping.BaseTest;
import com.ruoan.secshopping.entity.SecShopping;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.Assert;

import java.util.List;

/**
 * @Author: ruoan
 * Date: 2020/12/4 11:58 下午
 * @Description:
 */
public class SecShoppingMapperTest extends BaseTest {

    @Autowired
    private SecShoppingMapper secShoppingMapper;

    @Test
    public void queryAllTest() {
        List<SecShopping> secShoppings = secShoppingMapper.selectAll();
        Assert.notEmpty(secShoppings, "sec_shopping table has empty data");
    }

    @Test
    public void queryOneTest() {
        SecShopping secShopping = new SecShopping();
        secShopping.setSecShoppingId(1L);
        List<SecShopping> secShoppings = secShoppingMapper.select(secShopping);
        Assert.notEmpty(secShoppings, "sec_shopping id=1 is null");
    }
}