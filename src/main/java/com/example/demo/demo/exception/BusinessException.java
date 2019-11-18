package com.example.demo.demo.exception;

import com.example.demo.demo.enums.IExceptionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Create by
 *
 * @author xueshengwen
 */
@Data
@AllArgsConstructor
public class BusinessException extends RuntimeException {

    private final int code;

    private final String message;

    public BusinessException(IExceptionEnum iExceptionEnum) {
        super(iExceptionEnum.getMessage());
        this.code = iExceptionEnum.getCode();
        this.message = iExceptionEnum.getMessage();
    }
}
