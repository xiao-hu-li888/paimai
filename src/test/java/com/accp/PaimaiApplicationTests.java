package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.AuctionBiz;

@SpringBootTest
@SuppressWarnings("all")
class PaimaiApplicationTests {
	@Autowired
	private AuctionBiz auctionBiz;
	
	@Test
	public void contextLoads() {
//		System.out.println("ddd");
//		auctionBiz.selectall().forEach(temp->{
//			System.out.println(temp.getAuctionid());
//			System.out.println(temp.getAuctionstarttime());
//		});
		auctionBiz.selectallBy("青", null, null, null, null, 1, 3).getList().forEach(temp->{
			System.out.println(temp.getAuctionname());
		});
	}

}
