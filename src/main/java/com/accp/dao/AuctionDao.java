package com.accp.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.accp.pojo.Auction;
import com.accp.vo.AuctionRecordVo;

public interface AuctionDao {
	/**
	 * 根据主键删除
	 * @param auctionid
	 * @return
	 */
	int deleteByPrimaryKey(@Param("auctionid") Integer auctionid);

	int insert(Auction record);

	/**
	 * 新增竞拍商品
	 * 
	 * @param record
	 * @return
	 */
	int insertSelective(@Param("record") Auction record);

	/**
	 * 根据id查询竞拍商品
	 * @param auctionid
	 * @return
	 */
	Auction selectByPrimaryKey(@Param("auctionid") Integer auctionid);
	
	/**
	 * 根据id查询竞拍记录vo对象
	 * @param auctionid
	 * @return
	 */
	List<AuctionRecordVo> selectAuctionrecordvo(@Param("auctionid") Integer auctionid);

	/**
	 * 查询所有竞拍商品
	 * @return
	 */
	List<Auction> selectall();
	
	/**
	 * 带条件分页查询
	 * @param auctionname
	 * @param auctiondesc
	 * @param auctionstarttime
	 * @param auctionendtime
	 * @param auctionstartprice
	 * @return
	 */
	List<Auction> selectallBy(@Param("auctionname") String auctionname,@Param("auctiondesc") String auctiondesc,@Param("auctionstarttime") String auctionstarttime,@Param("auctionendtime") String auctionendtime,@Param("auctionstartprice") Float auctionstartprice);
	
	/**
	 * 查询正在的竞拍商品
	 * @return
	 */
	List<Auction> selectcontinue();

	/**
	 * 根据主键修改
	 * @param record
	 * @return
	 */
	int updateByPrimaryKeySelective(@Param("record") Auction record);

	int updateByPrimaryKeyWithBLOBs(Auction record);

	int updateByPrimaryKey(Auction record);
}