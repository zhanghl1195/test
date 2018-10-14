package com.unicom.mapper;


import com.unicom.model.Salesdetail;
import com.unicom.model.SalesdetailExample;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SalesdetailMapper {
	
    int countByExample(SalesdetailExample example);

    int deleteByExample(SalesdetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Salesdetail record);

    int insertSelective(Salesdetail record);

    List<Salesdetail> selectByExample(SalesdetailExample example);

    Salesdetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Salesdetail record, @Param("example") SalesdetailExample example);

    int updateByExample(@Param("record") Salesdetail record, @Param("example") SalesdetailExample example);

    int updateByPrimaryKeySelective(Salesdetail record);

    int updateByPrimaryKey(Salesdetail record);
    
    @Select("select * from salesdetail where id = #{id}")
    Salesdetail get(@Param("id") int id);
    
    @Delete("delete from salesdetail where id = #{id}")
    void delete(@Param("id") int id);
    
    
}