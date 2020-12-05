package com.ruoan.secshopping.exception;

/**
 * @Author: ruoan
 * Date: 2020/12/6 12:04 上午
 * @Description:
 */
public class SecShoppingException extends RuntimeException {
    public SecShoppingException(String message) {
        super(message);
    }

    public SecShoppingException(String message, Throwable cause) {
        super(message, cause);
    }
}
