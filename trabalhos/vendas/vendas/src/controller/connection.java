package controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class connection {
    public static Connection con = null;
    
    public static void Conectar() {
        String servidor = "localhost:3306/";
        String banco = "mercadinho";
        String user = "root";
        String pass = "usbw";
        
        System.out.println("Conectando...");
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://" + servidor + banco, user, pass);
            System.out.println("Conectado com sucesso!");
        } catch (ClassNotFoundException error) {
            System.out.println("Por favor adicione o Driver Manager");
        } catch (SQLException error) {
            JOptionPane.showMessageDialog(null, "Erro na conexão");
            throw new RuntimeException(error);
        }
    }
    
    public static void Desconectar() {
         try {
             con.close();
             con = null;
             System.out.println("Conexão fechada com sucesso!");
         } catch (SQLException error) {
             System.out.println("Erro ao fechar conexão");
             throw new RuntimeException(error);
         }
    }
}
