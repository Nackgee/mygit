//package jp.ken.hotel.msController;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
//
//
//public class DBConnectionTest {
//	
//	String url = "jdbc:mysql://localhost:3306/";
//	String dbName = "scott";
//	String ID = "root";
//	String PW = "1234";
//	
//	DBConnectionTest() {
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			System.out.println("성공!");
//			Connection conn = DriverManager.getConnection(url + dbName, ID, PW);
//			System.out.println("성공2!");
//		} catch (ClassNotFoundException e) {
//			System.out.println("실패");
//		} catch (SQLException e) {
//			System.out.println("실패2");
//		}
//	}
//	
//	public static void main(String[] args) {
//		new DBConnectionTest();
//	}
//
//}
