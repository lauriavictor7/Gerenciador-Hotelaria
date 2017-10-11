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
    
    private final DadosFuncionario iDF;
    
    public NegocioFuncionario () {
        this.iDF = new DadosFuncionario();
    }
    
    public void cadastrarFuncionario(Funcionario f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void atualizarFuncionario(Funcionario f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void removerFuncionario(Funcionario f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Funcionario> listarHospede(Funcionario filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
