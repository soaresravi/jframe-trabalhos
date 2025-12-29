package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    public static Connection con = null;
    
    public static void Conectar() {
        
        String servidor = "localhost:3306/";
        String banco = "imobiliaria";
        String user = "root";
        String pass = "usbw";
        
        System.out.println("Conectando...");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + servidor  + banco, user, pass);
            System.out.println("Conectado com sucesso!");
        } catch (ClassNotFoundException error) {
            System.out.println("Por favor adicione o Driver Manager.");
        } catch (SQLException error) {
            System.out.println("Erro: " + error);
            throw new RuntimeException("Erro: " + error);
        }

    }
    
    public static void Desconectar() {
        try {
            con.close();
            con = null;
            System.out.println("Conexão fechada com sucesso!");
        } catch (SQLException error) {
            System.out.println("Erro ao fechar conexão.");
            throw new RuntimeException("Erro: " + error);
        }
    }
}
