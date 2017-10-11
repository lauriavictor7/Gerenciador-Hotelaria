/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Hospede;
import dados.DadosHospede;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class NegocioHospede {
    
    private final DadosHospede iDH;
    
    public NegocioHospede () {
        this.iDH = new DadosHospede();
    }

    public void cadastrarHospede(Hospede h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void atualizarHospede(Hospede h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void removerHosptede(Hospede h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Hospede> listarHospede(Hospede filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Hospede pesquisarHospede(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Hospede detalhesHospede(Hospede h) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
