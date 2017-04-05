package com.funkyer.jdbc;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 * Created by dell on 17-4-4.
 */
public class JdbcTemplate<T> extends SqlMapClientDaoSupport 
{
	
	public void add(String statementName,T parameterObject)
	{
		this.getSqlMapClientTemplate().insert(statementName, parameterObject);
	}
	
	@SuppressWarnings("unchecked")
	public List<Object> query(String statementName,T parameterObject)
	{
		return this.getSqlMapClientTemplate().queryForList(statementName, parameterObject);
	}
	
	public void update(String statementName,T parameterObject)
	{
		this.getSqlMapClientTemplate().update(statementName, parameterObject);
	}
	
	public void delete(String statementName,T parameterObject)
	{
		this.getSqlMapClientTemplate().delete(statementName, parameterObject);
	}
}
