/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Servico;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public interface IDadosServico {
    
    void cadastrarServico(Servico s) throws Exception;
    void atualizarServico(Servico s) throws Exception;
    void removerServico(Servico s) throws Exception;
    List<Servico> listarServico(Servico filtro) throws Exception;
    Servico pesquisarServico(Servico s) throws Exception;
}
