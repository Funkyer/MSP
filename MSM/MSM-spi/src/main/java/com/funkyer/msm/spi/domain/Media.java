package com.funkyer.msm.spi.domain;

import java.io.Serializable;

/**
 * Created by liushi on 17/8/25.
 */
public class Media implements Serializable {
    /**
     * id
     */
    private String id;

    /**
     * 内容Id
     */
    private String contentId;

    /**
     * 媒资URL
     */
    private String url;

    /**
     * 码率等级
     */
    private int definition;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getDefinition() {
        return definition;
    }

    public void setDefinition(int definition) {
        this.definition = definition;
    }

    @Override
    public String toString() {
        return "Media{" +
                "id='" + id + '\'' +
                ", contentId='" + contentId + '\'' +
                ", url='" + url + '\'' +
                ", definition=" + definition +
                '}';
    }
}
