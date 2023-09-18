package com.example.programlaugh.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connect {
    /**
     * Встановлює з'єднання з базою даних.
     *
     * @return Об'єкт Connection для з'єднання з базою даних.
     */
    public static Connection connect() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/acces_metod";
        String username = "root";
        String password = "adidas200415";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            return connection;

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
