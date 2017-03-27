package com.funkyer.qiniu.api;

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
    public String getPath(String name);
}
