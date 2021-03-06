package com.funkyer.qiniu.service.spi;

/**
 * Created by dell on 17-3-27.
 */

import com.funkyer.qiniu.service.QiniuService;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.BucketManager;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.model.FileInfo;
import com.qiniu.storage.model.FileListing;
import com.qiniu.util.Auth;

/**
 * 七牛服务类
 */
public class QiniuServiceSpi implements QiniuService
{
    private String ACCESS_KEY;
    private String SECRET_KEY;

    private Auth auth= Auth.create(ACCESS_KEY, SECRET_KEY);


    @Override
    public String getUrl(String name,String bucket) {

        Zone z = Zone.zone0();
        Configuration c = new Configuration(z);

        //实例化一个BucketManager对象
        BucketManager bucketManager = new BucketManager(auth, c);  //要列举文件的空间名


        try {
            //调用listFiles方法列举指定空间的指定文件
            //参数一：bucket    空间名
            //参数二：prefix    文件名前缀
            //参数三：marker    上一次获取文件列表时返回的 marker
            //参数四：limit     每次迭代的长度限制，最大1000，推荐值 100
            //参数五：delimiter 指定目录分隔符，列出所有公共前缀（模拟列出目录效果）。缺省值为空字符串
            FileListing fileListing = bucketManager.listFiles(bucket, name, null, 10, null);
            FileInfo[] items = fileListing.items;
            for (FileInfo fileInfo : items)
            {
                return fileInfo.key;
            }
        } catch (QiniuException e) {

        }

        return null;
    }

    public void setACCESS_KEY(String ACCESS_KEY) {
        this.ACCESS_KEY = ACCESS_KEY;
    }

    public void setSECRET_KEY(String SECRET_KEY) {
        this.SECRET_KEY = SECRET_KEY;
    }
}
