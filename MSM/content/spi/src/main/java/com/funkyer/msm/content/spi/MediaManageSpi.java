package com.funkyer.msm.content.spi;


import com.funkyer.msm.content.api.MediaManage;
import com.funkyer.msm.content.api.domain.Media;
import com.funkyer.msm.content.spi.common.Contants;
import com.funkyer.msm.jdbc.JdbcTemplate;

import java.util.List;

/**
 * Created by liushi on 17/8/25.
 */
public class MediaManageSpi implements MediaManage
{
    private JdbcTemplate jdbcTemplate;

    @Override
    public void add(Media media) {
        jdbcTemplate.add(Contants.MediaSQL.MediaInsertSQL, media);
    }

    @Override
    public void delete(Media media)
    {
        jdbcTemplate.delete(Contants.MediaSQL.MediaDeleteSQL, media);
    }

    @Override
    public List<Object> query(Media media)
    {
        return jdbcTemplate.query(Contants.MediaSQL.MediaQuerySQL, media);
    }

    @Override
    public void update(Media media)
    {
        jdbcTemplate.update(Contants.MediaSQL.MediaUpdateSQL,media);
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
