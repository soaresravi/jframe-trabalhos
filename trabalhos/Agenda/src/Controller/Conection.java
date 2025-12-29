package Controller;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class Conection {
    public static Connection con = null;
    
    public static void Conectar() {
        
        String servidor = "localhost:3306/"; //tem que declarar nessa ordem
        String banco = "agenda";
        String usuario = "root"; //usuario e senha so deixa quando for usar o usbwebserver
        String senha = "usbw";
        
        System.out.println("Conectando...");
        
        try { //importante para que seja detectado erros no sql
            Class.forName("com.mysql.cj.jdbc.Driver"); //chamando a class jdbc
            con = DriverManager.getConnection("jdbc:mysql://" + servidor + banco, usuario, senha); //pego o driver manager e a conexão que é a mesma coisa em c#, php...
            System.out.println("Conectado com sucesso!");
        } catch (ClassNotFoundException error) { //caso eu esqueça do mysql connector
            System.out.println("Driver não encontrado, por favor adicione e tente novamente");
        } catch (SQLException error) { //caso de erro no mysql
            System.out.println("Foi encontrado um erro: " + error);
            throw new RuntimeException(error); //para na hora que identifica o erro
        }
    }
    
    public static void Desconectar() {
        try {
            con.close(); //fecha a conexão
            con = null; //define que a conexão é nula de novo
            System.out.println("Conexão fechada com sucesso!");
        } catch (SQLException error) {
            System.out.println("Foi e;ncontrado um erro: " + error);
            throw new RuntimeException(error);
        }
    }
    
}
