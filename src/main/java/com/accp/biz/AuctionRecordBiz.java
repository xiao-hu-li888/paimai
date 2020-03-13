package com.accp.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.AuctionRecordDao;
import com.accp.pojo.AuctionRecord;
import com.accp.vo.AuctionVo;
import com.accp.vo.AuctionsVo;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionRecordBiz {
	@Autowired
	private AuctionRecordDao auctionrecordDao;
	
	/**
	 * 查询拍卖结束的商品
	 * 
	 * @return
	 */
	public List<AuctionsVo> selectAuctionsvoend(){
		return auctionrecordDao.selectAuctionsvoend();
	}
	
	/**
	 * 查询 拍卖中的商品
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	public PageInfo<AuctionVo> selectAuctionVoall(Integer pageNum, Integer pageSize){
		PageHelper.startPage(pageNum, pageSize);
		return new PageInfo<AuctionVo>(auctionrecordDao.selectAuctionVoall());
	}
	
	/**
	 * 新增竞拍记录
	 * @param record
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertSelective(AuctionRecord record) {
		return auctionrecordDao.insertSelective(record);
	}
}
