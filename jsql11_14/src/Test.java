
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;


import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: dong jin cheng
 * Date: 2023-11-14
 * Time: 22:44
 */

public class Test {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("input studentId: ");
        int studentId = scanner.nextInt();
        System.out.println("input name: ");
        String name = scanner.next();
        //1.创立数据源
        DataSource dataSource = new MysqlDataSource();
        ((MysqlDataSource) dataSource).setUrl("jdbc:mysql://127.0.0.1:3306/xiaodong?characterEncoding=utf8&useSSL=false");
        ((MysqlDataSource) dataSource).setUser("root");
        ((MysqlDataSource) dataSource).setPassword("2300851034");

        //2.和数据库服务器建立联系
        Connection connection = dataSource.getConnection();

        //3.构造一个sql
        //String sql = "select * from student";
        String sql = "update studnet set name = ? where studentId = ?";

        //String sql = "insert into student values(?, ?)";
        // 把string sql转换成语句对象
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1,studentId);
        statement.setString(2,name);
        //4.向服务器发送执行
        int n = statement.executeUpdate();
        System.out.println("n = " + n);

       /* ResultSet resultSet = statement.executeQuery();
        while(resultSet.next()){
            int studentId = resultSet.getInt("studentId");
            String name = resultSet.getString("name");
            System.out.println("id:" + studentId);
            System.out.println("name: " + name);
        }*/

        //5.释放资源
        //resultSet.close();
        statement.close();
        connection.close();

    }
}
