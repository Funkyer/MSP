package com.funkyer.jdbc;

import com.funkyer.jdbc.domain.Vod;

/**
 * Created by dell on 17-4-5.
 */
public class VodSpi {

    private JdbcTemplate<Vod> jdbcTemplate;

    public void addVod(Vod vod)
    {
        jdbcTemplate.add("VodInsertSQL",vod);
    }

    public void setJdbcTemplate(JdbcTemplate<Vod> jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
