package com.jxust.ssh.dao;

import com.jxust.ssh.model.Product;

/**
 * 商品管理的DAO的接口
 * @author Peng
 * @Date2016年11月25日下午4:45:37
 */
public interface ProductDao {

	/**
	 * DAO中的保存商品的方法
	 * @param product
	 */
	public void save(Product product) ;
}
