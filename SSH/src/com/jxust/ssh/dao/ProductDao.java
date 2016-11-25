package com.jxust.ssh.dao;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.jxust.ssh.model.Product;

/**
 * 商品管理的DAO的类
 * @author Peng
 * @Date2016年11月25日下午4:45:37
 */
public class ProductDao extends HibernateDaoSupport{

	/**
	 * DAO中的保存商品的方法
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("DAO中的save方法执行了....");
		this.getHibernateTemplate().save(product);
	}
}
