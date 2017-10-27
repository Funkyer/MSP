/**
 * 
 */
package com.funkyer.msm.content.spi;


import com.funkyer.msm.content.api.VodManage;
import com.funkyer.msm.content.api.domain.Vod;
import com.funkyer.msm.content.spi.common.Contants;
import com.funkyer.msm.jdbc.JdbcTemplate;

import java.util.List;

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
