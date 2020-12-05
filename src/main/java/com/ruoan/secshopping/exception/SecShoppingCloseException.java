package com.ruoan.secshopping.exception;

/**
 * @Author: ruoan
 * Date: 2020/12/6 12:05 上午
 * @Description:
 */
public class SecShoppingCloseException extends SecShoppingException {
    public SecShoppingCloseException(String message) {
        super(message);
    }

    public SecShoppingCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}
