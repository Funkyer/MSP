package com.funkyer.content.api.dto;

import com.funkyer.common.domain.NamedParameter;

/**
 * Created by dell on 2017/5/14.
 */
public class GetVodByIdRequest
{
    private String id;
    private NamedParameter[] extendsInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public NamedParameter[] getExtendsInfo() {
        return extendsInfo;
    }

    public void setExtendsInfo(NamedParameter[] extendsInfo) {
        this.extendsInfo = extendsInfo;
    }
}
