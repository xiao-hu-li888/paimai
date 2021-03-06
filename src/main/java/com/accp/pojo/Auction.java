package com.accp.pojo;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import com.alibaba.fastjson.annotation.JSONField;

public class Auction {
    private Integer auctionid;

    private String auctionname;

    private Float auctionstartprice;

    private Float auctionupset;

    @DateTimeFormat(pattern = "yyyy-MM-dd") // 非常重要
	@JSONField(format = "yyyy-MM-dd")
    private Date auctionstarttime;

    @DateTimeFormat(pattern = "yyyy-MM-dd") // 非常重要
	@JSONField(format = "yyyy-MM-dd")
    private Date auctionendtime;

    private String auctionpic;

    private String auctiondesc;

    private String auctionpictype;

    public Integer getAuctionid() {
        return auctionid;
    }

    public void setAuctionid(Integer auctionid) {
        this.auctionid = auctionid;
    }

    public String getAuctionname() {
        return auctionname;
    }

    public void setAuctionname(String auctionname) {
        this.auctionname = auctionname == null ? null : auctionname.trim();
    }

    public Float getAuctionstartprice() {
        return auctionstartprice;
    }

    public void setAuctionstartprice(Float auctionstartprice) {
        this.auctionstartprice = auctionstartprice;
    }

    public Float getAuctionupset() {
        return auctionupset;
    }

    public void setAuctionupset(Float auctionupset) {
        this.auctionupset = auctionupset;
    }

    public Date getAuctionstarttime() {
        return auctionstarttime;
    }

    public void setAuctionstarttime(Date auctionstarttime) {
        this.auctionstarttime = auctionstarttime;
    }

    public Date getAuctionendtime() {
        return auctionendtime;
    }

    public void setAuctionendtime(Date auctionendtime) {
        this.auctionendtime = auctionendtime;
    }

    public String getAuctionpic() {
        return auctionpic;
    }

    public void setAuctionpic(String auctionpic) {
        this.auctionpic = auctionpic == null ? null : auctionpic.trim();
    }

    public String getAuctiondesc() {
        return auctiondesc;
    }

    public void setAuctiondesc(String auctiondesc) {
        this.auctiondesc = auctiondesc == null ? null : auctiondesc.trim();
    }

    public String getAuctionpictype() {
        return auctionpictype;
    }

    public void setAuctionpictype(String auctionpictype) {
        this.auctionpictype = auctionpictype == null ? null : auctionpictype.trim();
    }

	public Auction(Integer auctionid, String auctionname, Float auctionstartprice, Float auctionupset,
			Date auctionstarttime, Date auctionendtime, String auctionpic, String auctiondesc, String auctionpictype) {
		super();
		this.auctionid = auctionid;
		this.auctionname = auctionname;
		this.auctionstartprice = auctionstartprice;
		this.auctionupset = auctionupset;
		this.auctionstarttime = auctionstarttime;
		this.auctionendtime = auctionendtime;
		this.auctionpic = auctionpic;
		this.auctiondesc = auctiondesc;
		this.auctionpictype = auctionpictype;
	}

	public Auction() {
		super();
	}
    
}