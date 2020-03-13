package com.accp.action;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.AuctionRecordBiz;
import com.accp.pojo.AuctionRecord;
import com.accp.vo.AuctionVo;
import com.accp.vo.AuctionsVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/auctionrecords") // 命名空间
public class AuctionRecordAction {
	@Autowired
	private AuctionRecordBiz auctionrecordBiz;
	
	/**
	 * 查询拍卖结束的商品
	 * 
	 * @return
	 */
	@GetMapping("/auctionrecord")
	public List<AuctionsVo> selectAuctionsvoend() {
		return auctionrecordBiz.selectAuctionsvoend();
	}
	
	/**
	 * 查询 拍卖中的商品
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/{pageNum}")
	public PageInfo<AuctionVo> selectAuctionVoall(@PathVariable Integer pageNum) {
		return auctionrecordBiz.selectAuctionVoall(pageNum, 2);
	}
	
	/**
	 * 新增竞拍记录
	 * @param auctionid
	 * @param userid
	 * @param auctionprice
	 * @return
	 */
	@PostMapping("/auctionrecord/{auctionid}/{userid}/{auctionprice}")
	public Map<String, String> insertSelective(@PathVariable Integer auctionid,@PathVariable Integer userid,@PathVariable Float auctionprice) {
		Map<String, String> message = new HashMap<String, String>();
		AuctionRecord record=new AuctionRecord(auctionid, userid, new Date(), auctionprice);
		auctionrecordBiz.insertSelective(record);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
