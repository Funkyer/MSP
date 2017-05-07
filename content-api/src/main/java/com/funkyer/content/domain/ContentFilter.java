package com.funkyer.content.domain;

/**
 * Created by dell on 17-4-4.
 */
public enum ContentFilter
{
    ARTIST("artist");

    private String filter;

    ContentFilter(String filter)
     {
         this.filter = filter;
     }

}
