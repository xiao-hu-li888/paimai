package com.accp.action;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.accp.biz.AuctionUserBiz;
import com.accp.pojo.AuctionUser;

@RestController
@RequestMapping("/api/auctionusers") // 命名空间
public class AuctionUserAction {
	@Autowired
	private AuctionUserBiz auctionuserBiz;
	
	/**
	 * 竞拍者注册
	 * @param record
	 * @return
	 */
	@PostMapping("/auctionuser")
	public Map<String, String> insertSelective(@RequestBody AuctionUser auctionuser) {
		Map<String, String> message = new HashMap<String, String>();
		auctionuserBiz.insertSelective(auctionuser);
		message.put("code", "200");
		message.put("msg", "ok");
		return message;
	}
	
	/**
	 * 竞拍者登录
	 * 
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	@GetMapping("/loginjpz/{userName}/{userPassword}")
	public AuctionUser selectBillAll(@PathVariable String userName,@PathVariable String userPassword) {
		return auctionuserBiz.selectLoginjpz(userName, userPassword);
	}
	
	/**
	 *  管理员登录
	 * 
	 * @param userName
	 * @param userPassword
	 * @return
	 */
	@GetMapping("/logingly/{userName}/{userPassword}")
	public AuctionUser selectLogingly(@PathVariable String userName,@PathVariable String userPassword) {
		return auctionuserBiz.selectLogingly(userName, userPassword);
	}
	
}
