package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.AuctionRecord;
import com.accp.vo.AuctionVo;
import com.accp.vo.AuctionsVo;

public interface AuctionRecordDao {
	int deleteByPrimaryKey(Integer id);

	int insert(AuctionRecord record);

	/**
	 * 新增竞拍记录
	 * @param record
	 * @return
	 */
	int insertSelective(@Param("record") AuctionRecord record);

	AuctionRecord selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(AuctionRecord record);

	int updateByPrimaryKey(AuctionRecord record);

	/**
	 * 查询拍卖结束的商品
	 * 
	 * @return
	 */
	List<AuctionsVo> selectAuctionsvoend();
	
	/**
	 *查询 拍卖中的商品
	 * @return
	 */
	List<AuctionVo> selectAuctionVoall();
}