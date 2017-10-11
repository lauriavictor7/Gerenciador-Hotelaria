/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Hospede;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class DadosHospede implements IDadosHospede {
    
    @Override
    public void cadastrarHospede(Hospede h) throws Exception {
        throw new Exception("Erro ao cadastrar hóspede.");
    }

    @Override
    public void atualizarHospede(Hospede h) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removerHosptede(Hospede h) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Hospede> listarHospede(Hospede filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hospede pesquisarHospede(String cpf) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hospede detalhesHospede(Hospede h) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
