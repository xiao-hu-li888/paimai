package com.accp.biz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.accp.dao.AuctionUserDao;
import com.accp.pojo.AuctionUser;

@Service
@Transactional(propagation = Propagation.SUPPORTS, isolation = Isolation.READ_COMMITTED, readOnly = true)
public class AuctionUserBiz {
	@Autowired
	private AuctionUserDao auctionuserDao;
	
	/**
	 * 竞拍者注册
	 * @param record
	 * @return
	 */
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
	public int insertSelective(AuctionUser record) {
		return auctionuserDao.insertSelective(record);
	}

	/**
	 * 竞拍者登录
	 * 
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	public AuctionUser selectLoginjpz(String userName,String userPassword) {
		return auctionuserDao.selectLoginjpz(userName, userPassword);
	}
	
	/**
	 * 管理员登录
	 * 
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	public AuctionUser selectLogingly(String userName,String userPassword) {
		return auctionuserDao.selectLogingly(userName, userPassword);
	}
}
