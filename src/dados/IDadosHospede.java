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
public interface IDadosHospede {
    
    void cadastrarHospede(Hospede h) throws Exception;
    void atualizarHospede(Hospede h) throws Exception;
    void removerHospede(Hospede h) throws Exception;
    List<Hospede> listarHospede (Hospede filtro) throws Exception;
    Hospede pesquisarHospede (String cpf) throws Exception; 
}
