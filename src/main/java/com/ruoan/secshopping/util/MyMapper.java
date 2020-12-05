package com.ruoan.secshopping.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author ruoan
 * 特别注意，该接口不能被扫描到，否则会出错
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}