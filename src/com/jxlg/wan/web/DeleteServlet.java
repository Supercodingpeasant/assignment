package com.jxlg.wan.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jxlg.wan.service.IProductService;
import com.jxlg.wan.service.impl.ProductServiceImpl;

 
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private IProductService productService;
    public DeleteServlet() {
        super();
        productService=new ProductServiceImpl();
    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}
 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		long id=Long.parseLong(request.getParameter("id"));
		productService.deleteProduct(id);
		request.getRequestDispatcher("/success.jsp").forward(request, response);
	}

}
