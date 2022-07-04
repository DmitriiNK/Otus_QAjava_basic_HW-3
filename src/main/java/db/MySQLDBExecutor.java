package db;

import conf_readers.IConfReader;
import conf_readers.PropertiesReader;

import java.sql.*;
import java.util.Map;

public class MySQLDBExecutor implements IDBExecute {
    private IConfReader confReader = new PropertiesReader();
    @Override
    public ResultSet execute(String query) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't get class. No driver found");
            e.printStackTrace();
        }
        Connection connection = null;
        Statement statement = null;
        Map<String,String> confData = confReader.read();
        try {
            connection = DriverManager.getConnection(
                    String.format("%s/%s",confData.get("url"),confData.get("db_name")),
                    confData.get("username"),
                    confData.get("password"));
            statement = connection.createStatement();
            return statement.executeQuery(query);
        }
        catch (SQLException e) {
            System.out.println("Can't get connection. Incorrect URL");
            e.printStackTrace();
        }

        try {
            connection.close();
        } catch (SQLException e) {
            System.out.println("Can't close connection");
            e.printStackTrace();
        }
        return null;
    }
}
