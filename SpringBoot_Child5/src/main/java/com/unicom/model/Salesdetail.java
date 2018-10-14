package com.unicom.model;

import java.util.Date;

public class Salesdetail {
    private Integer id;

    private String month;

    private Integer sales;

    private Date createtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month == null ? null : month.trim();
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

	@Override
	public String toString() {
		return "Salesdetail [id=" + id + ", month=" + month + ", sales="
				+ sales + ", createtime=" + createtime + "]";
	}
    
}