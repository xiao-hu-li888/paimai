package com.accp.dao;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.AuctionUser;

public interface AuctionUserDao {
	/**
	 * 竞拍者注册
	 * @param record
	 * @return
	 */
	int insertSelective(@Param("record") AuctionUser record);

	/**
	 * 竞拍者登录
	 * 
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	AuctionUser selectLoginjpz(@Param("userName") String userName, @Param("userPassword") String userPassword);
	
	/**
	 * 管理员登录
	 * 
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	AuctionUser selectLogingly(@Param("userName") String userName, @Param("userPassword") String userPassword);
}