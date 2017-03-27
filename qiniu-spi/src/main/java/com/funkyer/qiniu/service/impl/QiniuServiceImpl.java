package com.funkyer.qiniu.service.impl;

import com.funkyer.common.domain.MspException;
import com.funkyer.qiniu.api.QiniuService;

/**
 * Created by dell on 17-3-27.
 */
public class QiniuServiceImpl implements QiniuService
{
    @Override
    public String getPath(String name) {
        return null;
    }

    @Override
    public boolean upload() throws MspException {
        return false;
    }

    @Override
    public boolean download() throws MspException {
        return false;
    }
}
