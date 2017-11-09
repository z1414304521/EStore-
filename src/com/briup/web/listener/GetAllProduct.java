package com.briup.web.listener;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.briup.bean.Product;
import com.briup.web.GetConnection;

public class GetAllProduct  implements  ServletContextListener{

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		
	}

	@Override
	public void contextInitialized(ServletContextEvent arg0) {
		 //从数据库中查出所有的信息，当访问首页时将信息进行展示
		Connection conn =  GetConnection.getConnection();
		List<Product> list  =new ArrayList<Product>();
		String sql ="select * from e_product ";
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet  set = ps.executeQuery();
			while(set.next()){
				long  id = set.getLong("id");
				String name =set.getString("name");
				double price = set.getDouble("price");
				Product  pp = new Product();
				pp.setId(id);
				pp.setName(name);
				pp.setPrice(price);
				list.add(pp);
			}
			System.out.println(list.size()+"***************************");
			ServletContext  application = arg0.getServletContext();
	        application.setAttribute("prods", list);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
