package com.jxlg.wan.common.test;

import com.jxlg.wan.bean.Product;
import com.jxlg.wan.dao.ProductDao;

public class DaoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ProductDao dao=new ProductDao();
		dao.save(new Product(1001,"篮球",160));
		System.out.println("success!");
	}

}
