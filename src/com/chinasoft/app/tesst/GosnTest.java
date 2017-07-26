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
	     
		   System.out.println("1普通的Bean的转换**************************"); 
		   System.out.println("将一个Bean转换成为json字符串->"); 
		   Product Product1 = new Product(1,"电视",200.00); 
		   System.out.println("转换之前的Product1"+Product1); 
		   String json = gson.toJson(Product1); 
		   System.out.println("Product对象转换成为Json字符串，json==="+json); 
		     
		   System.out.println("***************************"); 
		   System.out.println("将一个json字符串转换成为Bean->"); 
		   Product Product2 = gson.fromJson(json, Product.class); 
		   System.out.println("转换成为的Product2=="+Product2); 
		   System.out.println(); 
		     
		   System.out.println("2Collection集合的转换**************************"); 
		   System.out.println("将一个Bean的List集合转换成为json字符串->"); 
		   Collection<Product> ProductList1 = new ArrayList<Product>(); 
		   for(int i=0;i<3;i++){ 
		    Product Product = new Product(2,"洗衣机",300.00); 
		    ProductList1.add(Product); 
		   } 
		   json = gson.toJson(ProductList1); 
		   System.out.println("Product的List集合对象转换成为Json字符串，json==="+json); 
		     
		   System.out.println("***************************"); 
		   System.out.println("将一个json字符串转换成为Bean的List集合->"); 
		   Collection<Product> ProductList2 = 
		      gson.fromJson(json, 
		         new TypeToken<Collection<Product>>(){}.getType()); 
		   System.out.println("转换成为的Product的List集合，ProductList2="+ProductList2); 
		   System.out.println(); 
		     
		   System.out.println("3Array数组的转换**************************"); 
		   System.out.println("将一个Bean的Array数组转换成为json字符串->"); 
		   Product [] ProductArray1 = new Product[3]; 
		   for(int i=0;i<ProductArray1.length;i++){ 
		    ProductArray1[i] = new Product(3,"风扇",400.00); 
		   } 
		   json = gson.toJson(ProductArray1); 
		   System.out.println("Product的数组对象转换成为Json字符串,json==="+json); 
		     
		   System.out.println("***************************"); 
		   System.out.println("将一个json字符串转换成为Bean的数组对象->"); 
		   Product [] ProductArray2 = gson.fromJson(json, new TypeToken<Product[]>(){}.getType()); 
		   System.out.println("转换成为的Product的数组对象,ProductArray2="+Arrays.toString(ProductArray2)); 
		   System.out.println(); 
		     
		   System.out.println("4Map的转换**************************"); 
		   System.out.println("将一个Bean的Map转换成为json字符串->"); 
		   Map<String,Product> map1 = new HashMap<String,Product>(); 
		   for(int i=0;i<3;i++){ 
		    map1.put(""+(i+10), ProductArray1[i]); 
		   } 
		   json = gson.toJson(map1); 
		   System.out.println("Product的Map集合转换成为Json字符串,json==="+json); 
		     
		   System.out.println("***************************"); 
		   System.out.println("将一个json字符串转换成为Bean的数组对象->"); 
		   Map<String,Product> map2 = 
		      gson.fromJson(json, 
		         new TypeToken<Map<String,Product>>(){}.getType()); 
		   System.out.println("转换成为的Product的数组对象，map2=="+map2); 
		  } 


}
