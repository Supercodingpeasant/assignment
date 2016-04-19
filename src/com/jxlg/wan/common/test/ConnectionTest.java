package com.jxlg.wan.common.test;

import com.jxlg.wan.common.util.ConnectionFactory;

public class ConnectionTest {
	public static void main(String[] args){
		try {
			System.out.println(ConnectionFactory.getConn());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
