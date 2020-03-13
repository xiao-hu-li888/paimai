package com.accp.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.AuctionBiz;
import com.accp.pojo.Auction;
import com.accp.vo.AuctionRecordVo;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/api/auctions") // 命名空间
public class AuctionAction {
	@Autowired
	private AuctionBiz auctionBiz;
	
	/**
	 * 新增竞拍商品
	 * 
	 * @param record
	 * @return
	 */
	@PostMapping("/auction")
	public Map<String, String> insertDetail(@RequestBody Auction auction) {
		Map<String, String> message = new HashMap<String, String>();
		auctionBiz.insertSelective(auction);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	/**
	 * 查询所有竞拍商品（分页）
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/all/{pageNum}")
	public PageInfo<Auction> selectBillAll(@PathVariable Integer pageNum) {
		return auctionBiz.selectall(pageNum, 3);
	}
	
	/**
	 * 查询所有竞拍商品（分页）
	 * @param pageNum
	 * @param pageSize
	 * @return
	 */
	@GetMapping("/continue/{pageNum}")
	public PageInfo<Auction> selectcontinue(@PathVariable Integer pageNum) {
		return auctionBiz.selectcontinue(pageNum, 3);
	}
	
	/**
	 * 根据id查询竞拍商品
	 * @param auctionid
	 * @return
	 */
	@GetMapping("/auction/{auctionid}")
	public Auction selectByPrimaryKey(@PathVariable Integer auctionid) {
		return auctionBiz.selectByPrimaryKey(auctionid);
	}
	
	/**
	 * 根据id查询竞拍商品
	 * @param auctionid
	 * @return
	 */
	@GetMapping("/auctionrecordvo/{auctionid}")
	public List<AuctionRecordVo> selectAuctionrecordvo(@PathVariable Integer auctionid) {
		return auctionBiz.selectAuctionrecordvo(auctionid);
	}
	
	/**
	 * 根据主键修改
	 * @param record
	 * @return
	 */
	@PutMapping("/auction")
	public Map<String, String> updateByPrimaryKeySelective(@RequestBody Auction auction) {
		Map<String, String> message = new HashMap<String, String>();
		auctionBiz.updateByPrimaryKeySelective(auction);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	/**
	 * 根据主键删除
	 * @param auctionid
	 * @return
	 */
	@DeleteMapping("auction/{auctionid}")
	public Map<String, Object> deleteByPrimaryKey(@PathVariable Integer auctionid) {
		auctionBiz.deleteByPrimaryKey(auctionid);
		Map<String, Object> message = new HashMap<String, Object>();
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
}
