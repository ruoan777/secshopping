package com.ruoan.secshopping.exception;

/**
 * @Author: ruoan
 * Date: 2020/12/6 12:05 上午
 * @Description:
 */
public class RepeatShoppingException extends SecShoppingException {
    public RepeatShoppingException(String message) {
        super(message);
    }

    public RepeatShoppingException(String message, Throwable cause) {
        super(message, cause);
    }
}
