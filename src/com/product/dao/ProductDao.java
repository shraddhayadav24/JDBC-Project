package com.product.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.product.configuration.ProductClass;

import com.product.dto.ProductDto;

public class ProductDao {
	ProductClass productClass=new ProductClass();
	Connection connection=null;
	
	//TO SAVE THE DATA
		public ProductDto saveProduct(ProductDto product) {
			
			Connection connection=productClass.getConnection();
			String sql="INSERT INTO product VALUES(?,?,?)";
					
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(sql);
			
			preparedStatement.setInt(1,product.getId());
			preparedStatement.setString(2, product.getName());
			preparedStatement.setInt(3, product.getPrice());
			
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
		return product;
		}
		
		
		//TO UPDATE THE DATA
				public boolean UpdateProductById(int id,int price) {
					connection=productClass.getConnection();
					String sql="UPDATE product SET price=? WHERE id=?";
					int i=0;
					
					try {
						PreparedStatement preparedStatement=connection.prepareStatement(sql);
						
						preparedStatement.setInt(1, price);
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
				public boolean DeleteProductById(int id,String name) {
				connection= productClass.getConnection();
				String sql="DELETE FROM product WHERE Id=?";
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
				
				public 	ProductDto getALLProduct(ProductDto product) {
					connection=productClass.getConnection();
					String sql="SELECT * FROM product";
					
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
					return product;				
				
				}		
				
				
				//
				
				
				
				
				
				
}
