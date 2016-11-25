package com.jxust.ssh.service;

import org.springframework.transaction.annotation.Transactional;

import com.jxust.ssh.dao.ProductDao;
import com.jxust.ssh.model.Product;
/**
 * 商品管理的业务层的类 
 * @author Peng
 * @Date2016年11月25日下午4:47:50
 */
@Transactional
public class ProductService {

	// 业务层注入DAO的类
	private ProductDao productDao;

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	/**
	 * 业务层保存商品的方法
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("Service中的save方法执行了....");
		productDao.save(product);
		
	}
}
