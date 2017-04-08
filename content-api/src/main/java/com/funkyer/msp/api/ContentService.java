package com.funkyer.msp.api;

import com.funkyer.msp.content.domain.Content;
import com.funkyer.msp.content.domain.ContentFilter;

/**
 * Created by dell on 17-4-4.
 */
public interface ContentService
{
    public Content getContentById(String id);

    public Content[] queryContent(ContentFilter[] filter);
}
