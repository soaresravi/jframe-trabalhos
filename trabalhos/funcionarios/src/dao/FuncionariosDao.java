package dao;

import java.sql.PreparedStatement;
import java.sql.Connection;

public class FuncionariosDao {
    
    public void cadastrarFuncionario(String nome) {
        String sql = "insert into funcionarios (nome, cargo, salario, cpf, telefone, endereco) values (?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = null;
        Connection connection =  null;
        
        try {
            connection = new Conexao().Conexao();
            stm = connection.prepareStatement(sql);
            stm.setString(1, funcionarios.getNome());
        } catch (SQLException error) {
            
        }
    }
}
