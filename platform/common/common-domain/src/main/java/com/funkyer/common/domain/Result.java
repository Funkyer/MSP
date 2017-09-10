package com.funkyer.common.domain;

import java.io.Serializable;

/**
 * Created by dell on 2017/5/14.
 */
public class Result implements Serializable
{

    private static final long serialVersionUID = -65408163842418109L;

    private String retCode;

    private String retMsg;

    public Result()
    {
        this.retCode = "000000";
        this.retMsg = "Success";
    }

    public Result(String retCode,String retMsg)
    {
        this.retCode = retCode;
        this.retMsg = retMsg;
    }

    public String getRetCode() {
        return retCode;
    }

    public void setRetCode(String retCode) {
        this.retCode = retCode;
    }

    public String getRetMsg() {
        return retMsg;
    }

    public void setRetMsg(String retMsg) {
        this.retMsg = retMsg;
    }
}
