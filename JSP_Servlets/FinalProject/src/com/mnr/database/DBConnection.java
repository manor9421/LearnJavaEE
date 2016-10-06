package com.mnr.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mnr.beans.Book;

public class DBConnection {

	//private Connection connection;
	
	public DBConnection(/*Connection connection*/){
		//this.connection = connection;
	}
	
	public static Connection getConnection(){
		String mySqlUser = "root";
		String mySqlPwd = "";
		String mySqlUrl = "jdbc:mysql://localhost:3306/workers";
		try {
			return DriverManager.getConnection(mySqlUrl,mySqlUser,mySqlPwd);
		}catch (SQLException e) {
			return null;
		}
	}
	
	public static Book[] findBooks(Connection connection){

		String sql = "SELECT `id`,`name`,`price`,`author` FROM `books`";
		
		try(
				Statement stmt = connection.createStatement();
				ResultSet rs = stmt.executeQuery(sql);
			){
			
			rs.last();
			Book[] books = new Book[rs.getRow()];
			
			rs.beforeFirst();
			int i = 0;
			while(rs.next()){
				books[i] = new Book(rs.getInt("id"),rs.getString("name"),
						rs.getString("author"), rs.getDouble("price"));
				i++;
			}
			
			return books;
			
		}catch (SQLException e) {
			// TODO: handle exception
			return null;
		}
		
		
	}
	
	public static Book findBook(Connection connection, String name){
		
		PreparedStatement stmt = null;
		
		ResultSet rs = null;
		
		try{
			String sql = "SELECT `id`,`name`,`price`,`author` FROM `books` WHERE `name`=?";
			
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, name);
			
			rs = stmt.executeQuery();
			Book book = null;
			rs.first();
			//while(rs.next()){
				book = new Book(rs.getInt("id"),rs.getString("name"),
						rs.getString("author"), rs.getDouble("price"));
			//}
			return book;
		}catch (SQLException e) {
			return null;
		}
		
	}
	
}
