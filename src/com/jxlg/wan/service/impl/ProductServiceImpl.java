
package com.jxlg.wan.service.impl;
import com.jxlg.wan.bean.Product;
import com.jxlg.wan.dao.ProductDao;
import com.jxlg.wan.service.IProductService;

public class ProductServiceImpl implements IProductService {
	
	private ProductDao productDao;
	public ProductServiceImpl(){
		productDao=new ProductDao();
	}
	public void addProduct(Product product){
		productDao.save(product);
	}
	public void deleteProduct(long id){
		productDao.deleteById(id);
	}
}
