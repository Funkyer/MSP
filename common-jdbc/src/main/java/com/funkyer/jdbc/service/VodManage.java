/**
 * 
 */
package com.funkyer.jdbc.service;

import java.util.List;

import com.funkyer.jdbc.JdbcTemplate;
import com.funkyer.jdbc.common.Contants;
import com.funkyer.jdbc.domain.Vod;

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

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
}
