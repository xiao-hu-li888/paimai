package com.accp.vo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class AuctionRecordVo {
	private Integer id;

    private Integer auctionid;

    private String username;

    @DateTimeFormat(pattern = "yyyy-MM-dd") // 非常重要
   	@JSONField(format = "yyyy-MM-dd")
    private Date auctiontime;

    private Float auctionprice;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAuctionid() {
		return auctionid;
	}

	public void setAuctionid(Integer auctionid) {
		this.auctionid = auctionid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getAuctiontime() {
		return auctiontime;
	}

	public void setAuctiontime(Date auctiontime) {
		this.auctiontime = auctiontime;
	}

	public Float getAuctionprice() {
		return auctionprice;
	}

	public void setAuctionprice(Float auctionprice) {
		this.auctionprice = auctionprice;
	}
    
    
}
