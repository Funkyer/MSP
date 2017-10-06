/**
 * 
 */
package com.funkyer.msm.spi.service;

import java.util.List;

import com.funkyer.msm.spi.domain.Vod;
import com.funkyer.msm.spi.JdbcTemplate;
import com.funkyer.msm.spi.common.Contants;

/**
 * @author dell
 * 
 */
public class VodManage {

	private JdbcTemplate jdbcTemplate;

	public void add(Vod vod) {
		jdbcTemplate.add(Contants.VodSQL.VodInsertSQL, vod);
	}
	
	public void delete(Vod vod)
	{
		jdbcTemplate.delete(Contants.VodSQL.VodDeleteSQL, vod);
	}
	
	public List<Object> query(Vod vod)
	{
		return jdbcTemplate.query(Contants.VodSQL.VodQuerySQL, vod);
	}

	public void update(Vod vod)
	{
		jdbcTemplate.update(Contants.VodSQL.VodUpdateSQL,vod);
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
