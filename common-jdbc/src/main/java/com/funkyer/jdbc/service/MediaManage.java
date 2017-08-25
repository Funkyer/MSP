package com.funkyer.jdbc.service;

import com.funkyer.jdbc.JdbcTemplate;
import com.funkyer.jdbc.common.Contants;
import com.funkyer.jdbc.domain.Media;
import com.funkyer.jdbc.domain.Vod;

import java.util.List;

/**
 * Created by liushi on 17/8/25.
 */
public class MediaManage
{
    private JdbcTemplate jdbcTemplate;

    public void add(Media media) {
        jdbcTemplate.add(Contants.MediaSQL.MediaInsertSQL, media);
    }

    public void delete(Media media)
    {
        jdbcTemplate.delete(Contants.MediaSQL.MediaDeleteSQL, media);
    }

    public List<Object> query(Media media)
    {
        return jdbcTemplate.query(Contants.MediaSQL.MediaQuerySQL, media);
    }

    public void update(Media media)
    {
        jdbcTemplate.update(Contants.MediaSQL.MediaUpdateSQL,media);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
