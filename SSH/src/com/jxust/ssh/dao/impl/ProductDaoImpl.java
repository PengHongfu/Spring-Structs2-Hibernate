package com.jxust.ssh.dao.impl;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import com.jxust.ssh.dao.ProductDao;
import com.jxust.ssh.model.Product;

public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao{

	/**
	 * DAO中的保存商品的方法
	 * @param product
	 */
	public void save(Product product) {
		System.out.println("DAO中的save方法执行了....");
		this.getHibernateTemplate().save(product);
	}
}
