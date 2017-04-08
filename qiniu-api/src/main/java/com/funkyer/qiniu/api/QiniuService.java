package com.funkyer.qiniu.api;

import com.funkyer.common.domain.MspException;

/**
 * Created by dell on 17-3-27.
 */
public interface QiniuService
{
    /**
     * 获取文件在七牛云上的外链地址
     * @param name 文件名字
     * @return 外链地址
     */
    public String getPath(String name) throws MspException;

    /**
     * 上传文件到七牛云
     * @return
     * @throws MspException
     */
    public boolean upload() throws MspException;

    /**
     * 下载七牛云文件到本地
     * @return
     * @throws MspException
     */
    public boolean download() throws MspException;
}
