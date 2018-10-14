package com.unicom.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unicom.model.Salesdetail;
import com.unicom.service.SalesdetailService;



@RestController
@CrossOrigin
public class SalesdetailController {
	
	@Autowired
	private SalesdetailService salesdetailService;
	
	@RequestMapping("/find/{page}/{rows}")
	//@RequestMapping("/find")
	public Map<String,Object> findAllSales(@PathVariable int page,@PathVariable int rows){
		
		
		return salesdetailService.getall(page,rows);
		//return salesdetailService.getall();
	}
	
	@RequestMapping("/add")
	public String addSales(){
		
		Salesdetail salesdetail = new Salesdetail();
		salesdetail.setMonth("十一月");
		salesdetail.setSales(20000);
		salesdetail.setCreatetime(new Date());
		
		salesdetailService.add(salesdetail);
		return "ok";
	}
	
	
	// 删除
		@RequestMapping(value="/delete/{id}")
		@Transactional // 开启事务
		public Map<String, Object> delete(@PathVariable("id") int id){
			
			Map<String, Object> resultMap = new HashMap<>();
			
			try {
				// 执行删除
				salesdetailService.delete(id);
				
				resultMap.put("code", 1);
				resultMap.put("msg", "success");
				
			} catch (Exception e) {
				e.printStackTrace();
				resultMap.put("code", 0);
				resultMap.put("msg", "删除失败");
			}
			
			return resultMap;
		}
		
		
		@RequestMapping("/save")
		public Map<String, Object> save(Salesdetail salesdetail){
			Map<String, Object> resultMap = new HashMap<>();
			salesdetail.setCreatetime(new Date());
			System.out.println(salesdetail);
			
			try {
				salesdetailService.save(salesdetail);
				resultMap.put("code", 1);
				resultMap.put("msg", "success");
				resultMap.put("item", salesdetail);
			} catch (Exception e) {
				e.printStackTrace();
				resultMap.put("code", 0);
				resultMap.put("msg", "失败");
			}
			return resultMap;
		}
		
		@RequestMapping("/update")
		public Map<String, Object> update(Salesdetail salesdetail){
			Map<String, Object> resultMap = new HashMap<>();
			salesdetail.setCreatetime(new Date());
			System.out.println(salesdetail);
			
			try {
				salesdetailService.update(salesdetail);
				resultMap.put("code", 1);
				resultMap.put("msg", "success");
			} catch (Exception e) {
				e.printStackTrace();
				resultMap.put("code", 0);
				resultMap.put("msg", "失败");
			}
			return resultMap;
		}
	
	
	
	
	
}
