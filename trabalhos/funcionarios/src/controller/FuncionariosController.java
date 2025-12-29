package controller;

import model.Funcionario;
import java.util.ArrayList;

public class FuncionariosController {
    
    public boolean cadastrarFuncionarios(String nome, String cargo, String salario, String cpf, String telefone, String endereco) {
        if (nome != null && nome.length() > 0 && cargo != null && salario != null && cpf != null && telefone != null && endereco != null) {
            Funcionario funcionarios = new Funcionario(nome, cargo, salario, cpf, telefone, endereco);
            funcionarios.modelo_cadastrarFuncionario(funcionarios);
            return true;
        }
        return false;
    }
    
    public ArrayList<Funcionario> listarFuncionario(String nome) {
        return new Funcionario().listarFuncionario(nome);
    }
}
