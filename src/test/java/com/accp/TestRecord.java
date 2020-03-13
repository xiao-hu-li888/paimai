package com.accp;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.accp.biz.AuctionRecordBiz;

@SpringBootTest
@SuppressWarnings("all")
public class TestRecord {
	@Autowired
	private AuctionRecordBiz auctionrecordBiz;
	
	@Test
	public void test() {
		auctionrecordBiz.selectAuctionVoall(1, 3).getList().forEach(temp->{
			System.out.println(temp.getAuction().getAuctionname());
			temp.getList().forEach(temp2->{
				System.out.println(temp2.getUsername()+"\t"+temp2.getAuctionprice());
			});
		});
	}
}
