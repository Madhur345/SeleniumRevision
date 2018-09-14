package seleniumrevision.org.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DatabaseTesting extends BaseClassFireFox {
	@Test
	public void databaseTesting() throws ClassNotFoundException, InterruptedException{
		driver.get("http://tpod.accotech.xyz/erp_squareplums/index.html#/login");
		ERPLoginPage l = new ERPLoginPage(driver);
		try {
			Connection con =DriverManager.getConnection("jdbc:mysql//95.216.12.207:3306/master","root","tzcld");
			Class.forName("com.mysql.jdbc.Driver");
			Statement stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery("select * from int_um_user where user_id=784");
			while(rs.next()){
				String username =rs.getString(6);
				String password = rs.getString(2);
				l.setUserName(username);
				l.setPassword(password);
				l.clickLogin();
			}
		} catch (SQLException e) {
		}
		Thread.sleep(3000);
		String expectedTitle ="SquarePlums ERP";
		String actualTitle =driver.getTitle();
		SoftAssert s = new SoftAssert();
		s.assertEquals(actualTitle, expectedTitle);
		System.err.println("Expected title is "+expectedTitle);
		System.err.println("Actual title is "+actualTitle);
		s.assertAll();
		driver.close();
	}
}
