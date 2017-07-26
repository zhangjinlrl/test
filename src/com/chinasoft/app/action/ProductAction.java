package com.chinasoft.app.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.alibaba.fastjson.JSON;
import com.chinasoft.app.vo.Product;
import com.opensymphony.xwork2.ActionSupport;

public class ProductAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private List<Product> ps;
	private Product p;
	private String name;
	private String result;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public List<Product> getPs() {
		return ps;
	}
	public void setPs(List<Product> ps) {
		this.ps = ps;
	}
	public Product getP() {
		return p;
	}
	public void setP(Product p) {
		this.p = p;
	}
public String loginCheck(){
	//����û�����ѯ���ݿ�
	//����ֵ�ж�
	if("admin".equals(name)){
		result="�û����Ѿ�����";
		return SUCCESS;
	}
	return NONE;
}
	
 public String add(){
	HttpServletRequest  servletRequest= ServletActionContext.getRequest();
	
	 ps= new ArrayList<Product>(); 
	 Product p1=new Product(1,"����",200.00);
	 Product p2=new Product(2,"ϴ�»�",300.00);
	 Product p3=new Product(3,"����",400.00);
	 ps.add(p1);
	 ps.add(p2);
	 ps.add(p3);
	 result = JSON.toJSONString(ps);
	 return SUCCESS;
 }
}
