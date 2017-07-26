package com.chinasoft.app.tesst;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import com.chinasoft.app.vo.Product;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class GosnTest {

	public static void main(String[] args) {
		Gson gson = new Gson(); 
	     
		   System.out.println("1��ͨ��Bean��ת��**************************"); 
		   System.out.println("��һ��Beanת����Ϊjson�ַ���->"); 
		   Product Product1 = new Product(1,"����",200.00); 
		   System.out.println("ת��֮ǰ��Product1"+Product1); 
		   String json = gson.toJson(Product1); 
		   System.out.println("Product����ת����ΪJson�ַ�����json==="+json); 
		     
		   System.out.println("***************************"); 
		   System.out.println("��һ��json�ַ���ת����ΪBean->"); 
		   Product Product2 = gson.fromJson(json, Product.class); 
		   System.out.println("ת����Ϊ��Product2=="+Product2); 
		   System.out.println(); 
		     
		   System.out.println("2Collection���ϵ�ת��**************************"); 
		   System.out.println("��һ��Bean��List����ת����Ϊjson�ַ���->"); 
		   Collection<Product> ProductList1 = new ArrayList<Product>(); 
		   for(int i=0;i<3;i++){ 
		    Product Product = new Product(2,"ϴ�»�",300.00); 
		    ProductList1.add(Product); 
		   } 
		   json = gson.toJson(ProductList1); 
		   System.out.println("Product��List���϶���ת����ΪJson�ַ�����json==="+json); 
		     
		   System.out.println("***************************"); 
		   System.out.println("��һ��json�ַ���ת����ΪBean��List����->"); 
		   Collection<Product> ProductList2 = 
		      gson.fromJson(json, 
		         new TypeToken<Collection<Product>>(){}.getType()); 
		   System.out.println("ת����Ϊ��Product��List���ϣ�ProductList2="+ProductList2); 
		   System.out.println(); 
		     
		   System.out.println("3Array�����ת��**************************"); 
		   System.out.println("��һ��Bean��Array����ת����Ϊjson�ַ���->"); 
		   Product [] ProductArray1 = new Product[3]; 
		   for(int i=0;i<ProductArray1.length;i++){ 
		    ProductArray1[i] = new Product(3,"����",400.00); 
		   } 
		   json = gson.toJson(ProductArray1); 
		   System.out.println("Product���������ת����ΪJson�ַ���,json==="+json); 
		     
		   System.out.println("***************************"); 
		   System.out.println("��һ��json�ַ���ת����ΪBean���������->"); 
		   Product [] ProductArray2 = gson.fromJson(json, new TypeToken<Product[]>(){}.getType()); 
		   System.out.println("ת����Ϊ��Product���������,ProductArray2="+Arrays.toString(ProductArray2)); 
		   System.out.println(); 
		     
		   System.out.println("4Map��ת��**************************"); 
		   System.out.println("��һ��Bean��Mapת����Ϊjson�ַ���->"); 
		   Map<String,Product> map1 = new HashMap<String,Product>(); 
		   for(int i=0;i<3;i++){ 
		    map1.put(""+(i+10), ProductArray1[i]); 
		   } 
		   json = gson.toJson(map1); 
		   System.out.println("Product��Map����ת����ΪJson�ַ���,json==="+json); 
		     
		   System.out.println("***************************"); 
		   System.out.println("��һ��json�ַ���ת����ΪBean���������->"); 
		   Map<String,Product> map2 = 
		      gson.fromJson(json, 
		         new TypeToken<Map<String,Product>>(){}.getType()); 
		   System.out.println("ת����Ϊ��Product���������map2=="+map2); 
		  } 


}
