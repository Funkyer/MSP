package com.funkyer.common.domain;

/**
 * Created by dell on 17-3-27.
 */
public class MspException extends RuntimeException
{

    private String errorCode;

    private String message;

    public MspException(String errorCode,String message)
    {
        super(message);
        this.errorCode = errorCode;
        this.message = message;
    }

    public MspException(String message)
    {
        super(message);
    }

    public MspException(String errorCode,String message,Throwable cause)
    {
        super(message,cause);
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "MspException{" +
                "errorCode='" + errorCode + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
