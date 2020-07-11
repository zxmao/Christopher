package com.christopher.exception;

/**
 * 暂未提供服务异常
 */
public class NotYetAvailableException extends RuntimeException {
    public NotYetAvailableException(String message) {
        super(message);
    }
}
