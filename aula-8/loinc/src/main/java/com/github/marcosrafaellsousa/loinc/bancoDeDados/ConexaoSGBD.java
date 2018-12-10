package com.github.marcosrafaellsousa.loinc.bancoDeDados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class ConexaoSGBD {

    public static boolean CarregarDriver() {
        try {
            Class.forName("org.sqlite.JDBC");
            return true;
        } catch (ClassNotFoundException exp) {
            return false;
        }
    }

    public static Connection Conectar(String caminhoArquivo) {
        try {
            // db parameters
            String url = "jdbc:sqlite:" + caminhoArquivo;
            // create a connection to the database
            return DriverManager.getConnection(url);
        } catch (SQLException e) {
            return null;
        }
    }

    public static void FecharConexao(Connection connection)
    {
        try {
            if (connection != null)
                connection.close();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}
