package until;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {
	/**
	 * JDBC操作数据库的基本步骤：
	 *  1）加载（注册）数据库驱动（到JVM）。
	 *  2）建立（获取）数据库连接。
	 *  3）创建（获取）数据库操作对象。   
	 *  4）定义操作的SQL语句。   
	 *  5）执行数据库操作。    
	 *  6）获取并操作结果集。  
	 *  7）关闭对象，回收数据库资源（关闭结果集-->关闭数据库操作对象-->关闭连接）。
	 * @param args
	 */
		
	public static void main(String[] args) {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://127.0.0.1:3306/jdbctest";
		String username="root";
		String password="root";
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		try {
			Class.forName(driver);
			conn=DriverManager.getConnection(url,username,password);
			stmt=conn.createStatement();
			String sql="";
		} catch (Exception e) {
		}
	}

}
