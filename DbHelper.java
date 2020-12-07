import java.sql.*;

public class DbHelper {
    private String username = "root";
    private String password = "db2020db";
    private String dbUrl = "jdbc:mysql://localhost:3307/world?useSSL=false&serverTimezone=UTC";
    
    public Connection getConnection() throws SQLException{
        return DriverManager.getConnection(dbUrl, username, password);
    }
    
    public void showErrorMessage(SQLException exception){
        System.out.println("Error: "+ exception.getMessage());
        System.out.println("Error Code  : "+ exception.getErrorCode());
    }
}
