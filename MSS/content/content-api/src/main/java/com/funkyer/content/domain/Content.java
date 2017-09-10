package com.funkyer.content.domain;

import com.funkyer.common.domain.NamedParameter;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by dell on 17-4-4.
 */
public class Content implements Serializable
{
    private static final long serialVersionUID = 5797667438858088010L;

    private String id;

    private Map<String,Dialect> dialectMap;

    private NamedParameter[] extendInfos;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Dialect> getDialectMap() {
        return dialectMap;
    }

    public void setDialectMap(Map<String, Dialect> dialectMap) {
        this.dialectMap = dialectMap;
    }

    public NamedParameter[] getExtendInfos() {
        return extendInfos;
    }

    public void setExtendInfos(NamedParameter[] extendInfos) {
        this.extendInfos = extendInfos;
    }
}
