package com.unicom.service;

import java.util.List;


import java.util.Map;

import com.unicom.model.Salesdetail;

public interface SalesdetailService {
	
	    //查询所有
		//List<Salesdetail> getall(int page,int rows);
		//List<Salesdetail> getall(int page,int rows);
	    Map<String,Object> getall(int page, int rows);
		//查询某个记录
		Salesdetail get(int id);
		
		//新增某个记录
		void add(Salesdetail salesdetail);
		
		// 删除
		void delete(int id);
		
		// 新增
		Salesdetail save(Salesdetail salesdetail);
				
		// 更新
		void update(Salesdetail salesdetail);
		
		
}
