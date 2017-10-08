/**
 * 
 */
package com.funkyer.msm.spi.service;

import java.util.List;

import com.funkyer.msm.api.VodManage;
import com.funkyer.msm.api.domain.Vod;
import com.funkyer.msm.spi.JdbcTemplate;
import com.funkyer.msm.spi.common.Contants;

/**
 * @author dell
 * 
 */
public class VodManageSpi implements VodManage
{

	private JdbcTemplate jdbcTemplate;

	@Override
	public void add(Vod vod) {
		jdbcTemplate.add(Contants.VodSQL.VodInsertSQL, vod);
	}
	@Override
	public void delete(Vod vod)
	{
		jdbcTemplate.delete(Contants.VodSQL.VodDeleteSQL, vod);
	}
	@Override
	public List<Object> query(Vod vod)
	{
		return jdbcTemplate.query(Contants.VodSQL.VodQuerySQL, vod);
	}

	@Override
	public void update(Vod vod)
	{
		jdbcTemplate.update(Contants.VodSQL.VodUpdateSQL,vod);
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
