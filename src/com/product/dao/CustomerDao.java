package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.product.configuration.CustomerClass;
import com.product.dto.CustomerDto;
public class CustomerDao {
	CustomerClass customerClass=new CustomerClass();
	Connection connection=null;
	
	//TO SAVE THE DATA
	public CustomerDto saveCustomer(CustomerDto customer) {
		
		Connection connection=customerClass.getConnection();
		String sql="INSERT INTO customer VALUES(?,?,?)";
				
	try {
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.setInt(1,customer.getId());
		preparedStatement.setString(2, customer.getName());
		preparedStatement.setString(3, customer.getAddress());
		
		preparedStatement.execute();
		
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally {
		try {
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	return customer;
		
	}
	
	//TO UPDATE THE DATA
		public boolean UpdateCustomerById(int id,String name,String address) {
			connection=customerClass.getConnection();
			String sql="UPDATE customer SET address=? WHERE Id=?";
			int i=0;
			
			try {
				PreparedStatement preparedStatement=connection.prepareStatement(sql);
				
				preparedStatement.setString(1, address);
				preparedStatement.setInt(2, id);
				
			i=	preparedStatement.executeUpdate();
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("all good");
			if(i>0) {
				return true;
			}else {
				return false;
			}
		}
		
	//TO DELETE THE DATA
		public boolean DeleteCustomerById(int id,String name) {
		connection= customerClass.getConnection();
		String sql="DELETE FROM customer WHERE Id=?";
		int i=0;
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			preparedStatement.setInt(1, id);
			
			i=preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if(i>0) {
			return true;
		}
		else {
			return false;
		}
		
		}
		
		
		//TO GETALL THE DATA FROM DATABASE INTO ECLIPSE
		
	public 	CustomerDto getALLCustomer(CustomerDto customer) {
		connection=customerClass.getConnection();
		String sql="SELECT * FROM customer";
		
		try {
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			
			
			ResultSet resultSet =preparedStatement.executeQuery();
			while(resultSet.next()) {
				System.out.println(resultSet.getInt(1));
				System.out.println(resultSet.getString(2));
				System.out.println(resultSet.getString(3));
				System.out.println("----------------------------------------");
			}	
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return customer;
		
	}
				
}

		