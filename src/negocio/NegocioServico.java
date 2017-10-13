/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Servico;
import dados.DadosServico;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class NegocioServico {
    
    private final DadosServico iDS;
    
    public NegocioServico () {
        this.iDS = new DadosServico();
    }
    
    public void cadastrarServico(Servico s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void atualizarServico(Servico s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void removerServico(Servico s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Servico> listarServico(Servico filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Servico pesquisarServico(Servico s) {
        throw new UnsupportedOperationException("");
    }    
}
