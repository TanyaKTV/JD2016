package by.it.sergeev.jd03_01;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Connect
 */
public class Connect {

    public static void main(String[] args) {

        try(Connection connection = DriverManager.getConnection(CN.URL_DB,CN.USER_DB,CN.PASSWORD_DB)){
            if (!connection.isClosed())
                System.out.println("Connected");
            connection.close();
            if (connection.isClosed())
                System.out.println("Connection interrupted");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}