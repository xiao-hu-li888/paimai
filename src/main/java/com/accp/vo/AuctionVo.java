package com.accp.vo;

import java.util.List;

import com.accp.pojo.Auction;

public class AuctionVo {
	private Auction auction;
	
	private List<AuctionRecordVo> list;
	
	public Auction getAuction() {
		return auction;
	}
	public void setAuction(Auction auction) {
		this.auction = auction;
	}
	public List<AuctionRecordVo> getList() {
		return list;
	}
	public void setList(List<AuctionRecordVo> list) {
		this.list = list;
	}
	
	
}
