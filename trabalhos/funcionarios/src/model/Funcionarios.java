package model;

import dao.FuncionariosDao;
import java.util.ArrayList;

public class Funcionarios {
    
    private Integer id;
    private String nome, cargo;
    private Double salario;
    private String cpf,telefone, endereco;

    public Funcionarios(Integer id, String nome, String cargo, Double salario, String cpf, String telefone, String endereco) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.cpf = cpf;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public void modelo_CadastrarFuncionarios(Funcionarios funcionarios) {
        System.out.println("Gravando");
        new FuncionariosDao().cadastrarFuncionario(funcionarios);
    }
    
    public ArrayList<Funcionario> listarFuncionario(String nome) {
        System.out.println("Conectando...");
        return new FuncionariosDao.listarFuncionarios(nome);
    }
}
