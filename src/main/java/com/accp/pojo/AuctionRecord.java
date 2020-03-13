package com.accp.pojo;

import java.util.Date;

public class AuctionRecord {
    private Integer id;

    private Integer aucAuctionid;

    private Integer aucUserid;

    private Integer auctionid;

    private Integer userid;

    private Date auctiontime;

    private Float auctionprice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAucAuctionid() {
        return aucAuctionid;
    }

    public void setAucAuctionid(Integer aucAuctionid) {
        this.aucAuctionid = aucAuctionid;
    }

    public Integer getAucUserid() {
        return aucUserid;
    }

    public void setAucUserid(Integer aucUserid) {
        this.aucUserid = aucUserid;
    }

    public Integer getAuctionid() {
        return auctionid;
    }

    public void setAuctionid(Integer auctionid) {
        this.auctionid = auctionid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
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

	public AuctionRecord(Integer auctionid, Integer userid, Date auctiontime, Float auctionprice) {
		super();
		this.auctionid = auctionid;
		this.userid = userid;
		this.auctiontime = auctiontime;
		this.auctionprice = auctionprice;
	}

	public AuctionRecord() {
		super();
	}
    
}