package com.funkyer.msp.api.dto;

import com.funkyer.common.domain.NamedParameter;
import com.funkyer.common.domain.Result;

import java.io.Serializable;

/**
 * Created by liushi on 17/4/8.
 */
public class BaseResponse implements Serializable
{
    private Result result;
    


    private NamedParameter[] extendInfos;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public NamedParameter[] getExtendInfos() {
        return extendInfos;
    }

    public void setExtendInfos(NamedParameter[] extendInfos) {
        this.extendInfos = extendInfos;
    }
}
