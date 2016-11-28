package com.jxust.ssh.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.jxust.ssh.dao.ProductDao;
import com.jxust.ssh.model.Product;
import com.jxust.ssh.service.ProductService;
@Transactional
public class ProductServiceImpl implements ProductService{
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
