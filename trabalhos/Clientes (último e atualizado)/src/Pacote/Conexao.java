package Pacote;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conexao {
    public static Connection varConexao = null;
    
    public static void Conectar(){
        String servidor = "localhost:3306/"; //se eu for usar o usb web, se for normal é só localhost
        String usuario = "root"; //usuario e senha q vc colocar na hora de entrar
        String senha = "usbw";
        String banco = "clientes"; //banco de dados q vc criou
        
        System.out.println("Conectando...");
        
        try { //tente
            Class.forName("com.mysql.cj.jdbc.Driver");
            varConexao = DriverManager.getConnection("jdbc:mysql://" + servidor + banco, usuario, senha);
            System.out.println("Conectado");
            
        } catch (ClassNotFoundException error) { //caso der erro de classe n encontrada
                System.out.println("não esqueça de adicionar a conexão");
        } catch (SQLException error){ //caso der erro no sql
                System.out.println("erro" + error);
                throw new RuntimeException(error);
        }
    }
    
    public static void Desconectar() {
    
    }
}
