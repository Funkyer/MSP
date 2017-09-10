package com.funkyer.msp.api.dto;

import com.funkyer.common.domain.NamedParameter;

import java.io.Serializable;

/**
 * Created by liushi on 17/4/8.
 */
public class BaseResponse implements Serializable
{
    
    private String code = "000000";

    private String msg = "Success";

    private NamedParameter[] extendInfos;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public NamedParameter[] getExtendInfos() {
        return extendInfos;
    }

    public void setExtendInfos(NamedParameter[] extendInfos) {
        this.extendInfos = extendInfos;
    }
}
