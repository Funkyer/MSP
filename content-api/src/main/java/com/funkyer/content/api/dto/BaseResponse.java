package com.funkyer.content.api.dto;

import com.funkyer.common.domain.NamedParameter;
import com.funkyer.common.domain.Result;

/**
 * Created by dell on 2017/5/14.
 */
public class BaseResponse {
    private Result result;
    private NamedParameter[] extendsInfo;

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public NamedParameter[] getExtendsInfo() {
        return extendsInfo;
    }

    public void setExtendsInfo(NamedParameter[] extendsInfo) {
        this.extendsInfo = extendsInfo;
    }
}
