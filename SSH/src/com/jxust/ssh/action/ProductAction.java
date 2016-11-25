package com.jxust.ssh.action;

import com.jxust.ssh.model.Product;
import com.jxust.ssh.service.ProductService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
/**
 * 商品管理的Action类
 * @author Peng
 * @Date2016年11月25日下午4:44:11
 */
public class ProductAction extends ActionSupport implements ModelDriven<Product> {
	private Product product = new Product();
	@Override
	public Product getModel() {
		return product;
	}
	
	private ProductService produceService;

	public void setProduceService(ProductService produceService) {
		this.produceService = produceService;
	}
	
	/**
	 * 保存商品的执行的方法：save
	 */
	public String save(){
		System.out.println("Action中的save方法执行了......");
		System.out.println(product.toString());
		produceService.save(product);
		return "index";
	}
}
