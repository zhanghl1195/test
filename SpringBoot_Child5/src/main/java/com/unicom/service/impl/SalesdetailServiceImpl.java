package com.unicom.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.unicom.mapper.SalesdetailMapper;
import com.unicom.model.Salesdetail;
import com.unicom.model.SalesdetailExample;
import com.unicom.service.SalesdetailService;

@Service
public class SalesdetailServiceImpl implements SalesdetailService {
	
	@Autowired
	private SalesdetailMapper salesdetailMapper;

/*	@Override
	public List<Salesdetail> getall(int page, int rows) {
		
		SalesdetailExample example = new SalesdetailExample();
		
		PageHelper.startPage(page, rows);
			
		List<Salesdetail> list = salesdetailMapper.selectByExample(example);
		System.out.println(list);
		return list;
	}*/
	
	
	@Override
	public Map<String,Object> getall(int page, int rows) {

	   Map<String, Object> map = new HashMap<>();

	   PageHelper.startPage(page, rows);
	   List<Salesdetail> items = salesdetailMapper.selectByExample(null);
	   PageInfo<Salesdetail> pageInfo = new PageInfo<>(items);
	   System.out.println(pageInfo);
	   map.put("list", items);
	   map.put("total", pageInfo.getTotal());
	   return map;
	}
	
	
	
	

	@Override
	public Salesdetail get(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Salesdetail salesdetail) {
		// TODO Auto-generated method stub
		salesdetailMapper.insert(salesdetail);
		
	}
	
	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		salesdetailMapper.delete(id);
		
	}

	@Override
	public void update(Salesdetail salesdetail) {
		System.out.println();
		// TODO Auto-generated method stub
		Salesdetail i = new Salesdetail();
		i.setId(salesdetail.getId());
		salesdetailMapper.updateByPrimaryKey(salesdetail);
	}

	@Override
	public Salesdetail save(Salesdetail salesdetail) {
		// TODO Auto-generated method stub
		salesdetailMapper.insert(salesdetail);
		return salesdetail;
	}

}
