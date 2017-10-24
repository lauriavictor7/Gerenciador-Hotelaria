/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Funcionario;
import dados.DadosFuncionario;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class NegocioFuncionario {
    
    private void validarCadastrarFuncionario(Funcionario f) throws Exception {
        if(f.getCpf().trim().length() < 14) {
            throw new Exception("Por favor, informar o CPF.");
        }
        
        if(f.getCpf().equals("   .   .   -  ")) {
            throw new Exception("Por favor, informar o CPF");
        }
        
        if(f.getNome().trim().equals("")) {
            throw new Exception("Por favor, informar o NOME.");
        }
        /*
        if(f.getDataNasc().trim().length() < 10) {
            throw new Exception("Por favor, informar DATA DE NASCIMENTO.");
        } 
        */
        if(f.getCargo().equals("") || f.getCargo() == null) {
            throw new Exception("Por favor, informar CARGO.");
        }
        
        if(f.getSalario() <= 0) {
            throw new Exception("Por favor, informar SALÁRIO.");
        }
        
        if(f.getEndereco() == null) {
            throw new Exception("Por favor, informar o ENDEREÇO.");
        }
    }
    
    private void validarAtualizarFuncionario(Funcionario f) throws Exception {
        /*
        if(f.getDataNasc().trim().length() < 10) {
            throw new Exception("Por favor, informar DATA DE NASCIMENTO.");
        } 
        */
        if(f.getCargo().equals("") || f.getCargo() == null) {
            throw new Exception("Por favor, informar CARGO.");
        }
        
        if(f.getSalario() <= 0) {
            throw new Exception("Por favor, informar SALÁRIO.");
        }
        
        if(f.getEndereco() == null) {
            throw new Exception("Por favor, informar o ENDEREÇO.");
        }        
    }
    
    private void validarRemoverFuncionario(Funcionario f) throws Exception {
        if(f.getCpf().trim().length() < 14) {
            throw new Exception("Por favor, informar o CPF.");
        }
        
        if(f.getCpf().equals("   .   .   -  ")) {
            throw new Exception("Por favor, informar o CPF");
        }        
    }
    
    private final DadosFuncionario iDF;
    
    public NegocioFuncionario () {
        this.iDF = new DadosFuncionario();
    }
    
    public void cadastrarFuncionario(Funcionario f) throws Exception {
        validarCadastrarFuncionario(f);
        iDF.cadastrarFuncionario(f);
    }
    
    public void atualizarFuncionario(Funcionario f) throws Exception {
        validarAtualizarFuncionario(f);
        iDF.atualizarFuncionario(f);
    }
    
    public void removerFuncionario(Funcionario f) throws Exception {
        validarRemoverFuncionario(f);
        iDF.removerFuncionario(f);
    }
    
    public List<Funcionario> listarHospede(Funcionario filtro) throws Exception {
        return iDF.listarFuncionario(filtro);
    }
}
