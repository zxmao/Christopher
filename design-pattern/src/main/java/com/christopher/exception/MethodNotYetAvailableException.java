package com.christopher.exception;

import com.christopher.strategy.sort.SortName;

/**
 * 方法暂未提供异常
 */
public class MethodNotYetAvailableException extends NotYetAvailableException {

    private SortName name;

    public MethodNotYetAvailableException(String message, SortName n) {
        super("Method name is "+n.name()+":"+message);
        this.name = n;
    }
}
