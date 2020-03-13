package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.AuctionUserBiz;
import com.accp.pojo.AuctionUser;

@SpringBootTest
@SuppressWarnings("all")
public class TestUser {
	@Autowired
	private AuctionUserBiz auctionuserBiz;
	
	@Test
	public void test() {
		AuctionUser user=auctionuserBiz.selectLoginjpz("VIP", "456");
		if (user!=null) {
			System.out.println("登录成功！");
		}else {
			System.out.println("登录失败");
		}
	}
}
