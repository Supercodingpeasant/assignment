package com.jxlg.wan.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;

import com.jxlg.wan.bean.Product;
import com.jxlg.wan.common.util.ConnectionFactory;

public class ProductDao {
	public ProductDao(){

	}
	public void save(Product product){
		Connection conn=null;
		PreparedStatement pstmt = null;
		try {
			try{
				conn=ConnectionFactory.getConn();
				String sql="insert into product values(?,?,?)";
				pstmt=conn.prepareStatement(sql);
				pstmt.setLong(1, product.getId());
				pstmt.setString(2, product.getName());
				pstmt.setDouble(3, product.getPrice());
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Product findByName(){
		return null;
	}
	public void deleteById(long id) {
		// TODO Auto-generated method stub
		Connection conn=null;
		PreparedStatement pstmt=null;
		try {
			try{
				conn=ConnectionFactory.getConn();
				String sql="delete from product where id=?";
				pstmt=conn.prepareStatement(sql);
				pstmt.setLong(1, id);
				pstmt.executeUpdate();
			}finally{
				ConnectionFactory.close(null, pstmt, conn);
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
