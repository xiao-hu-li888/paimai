package com.accp.biz;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.AuctionDao;
import com.accp.pojo.Auction;
import com.accp.vo.AuctionRecordVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;


@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionBiz {
	@Autowired
	private AuctionDao auctionDao;
	
	/**
	 * 新增竞拍商品
	 * 
	 * @param record
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertSelective(Auction record) {
		return auctionDao.insertSelective(record);
	}
	
	/**
	 * 查询所有竞拍商品（分页）
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Auction> selectall(Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Auction>(auctionDao.selectall());
	}
	
	/**
	 * 带条件分页查询
	 * @param auctionname
	 * @param auctiondesc
	 * @param auctionstarttime
	 * @param auctionendtime
	 * @param auctionstartprice
	 * @return
	 */
	public PageInfo<Auction> selectallBy(String auctionname,String auctiondesc,String auctionstarttime,String auctionendtime,Float auctionstartprice,Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Auction>(auctionDao.selectallBy(auctionname, auctiondesc, auctionstarttime, auctionendtime, auctionstartprice));
	}
	
	/**
	 * 查询正在的竞拍商品（分页）
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<Auction> selectcontinue(Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<Auction>(auctionDao.selectcontinue());
	}
	
	/**
	 * 根据id查询竞拍商品
	 * @param auctionid
	 * @return
	 */
	public Auction selectByPrimaryKey(Integer auctionid) {
		return auctionDao.selectByPrimaryKey(auctionid);
	}
	
	/**
	 * 根据id查询竞拍记录vo对象
	 * @param auctionid
	 * @return
	 */
	public List<AuctionRecordVo> selectAuctionrecordvo(Integer auctionid){
		return auctionDao.selectAuctionrecordvo(auctionid);
	}
	
	/**
	 * 根据主键修改
	 * @param record
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int updateByPrimaryKeySelective(Auction record) {
		return auctionDao.updateByPrimaryKeySelective(record);
	}
	
	/**
	 * 根据主键删除
	 * @param auctionid
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int deleteByPrimaryKey(Integer auctionid) {
		return auctionDao.deleteByPrimaryKey(auctionid);
	}
}
