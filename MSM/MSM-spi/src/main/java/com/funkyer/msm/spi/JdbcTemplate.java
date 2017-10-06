package com.funkyer.msm.spi;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * Created by dell on 17-4-4.
 */

public class JdbcTemplate extends SqlMapClientDaoSupport 
{
	
	public void add(String statementName,Object parameterObject)
	{
		this.getSqlMapClientTemplate().insert(statementName, parameterObject);
	}
	
	@SuppressWarnings("unchecked")
	public List<Object> query(String statementName,Object parameterObject)
	{
		return this.getSqlMapClientTemplate().queryForList(statementName, parameterObject);
	}
	
	public void update(String statementName,Object parameterObject)
	{
		this.getSqlMapClientTemplate().update(statementName, parameterObject);
	}
	
	public void delete(String statementName,Object parameterObject)
	{
		this.getSqlMapClientTemplate().delete(statementName, parameterObject);
	}
}
