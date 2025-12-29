package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexao {
    public Connection Conexao() {
        
        Connection con = null;
        
        try {
            Class.forName("com.mysql.cj.jdbcDriver");
        } catch (ClassNotFoundException error) {
            System.out.println("Adicione o Driver Manager");
        }
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/funcionarios", "root", "usbw");
            System.out.println("Conectado com sucesso!");
        } catch (SQLException error) {
            System.out.println("Erro: " + error);
        }
        return con;
    }
}
