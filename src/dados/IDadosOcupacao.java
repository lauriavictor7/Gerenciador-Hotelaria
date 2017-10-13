/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Ocupacao;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public interface IDadosOcupacao {
    
    void cadastrarOcupacao(Ocupacao o) throws Exception;
    void atualizarOcupacao(Ocupacao o) throws Exception;    
    void removerOcupacao(Ocupacao o) throws Exception;
    List<Ocupacao> listarOcupacao(Ocupacao filtro) throws Exception;
    Ocupacao pesquisarOcupacao(Ocupacao o) throws Exception;
    Ocupacao procursarServico(Ocupacao o) throws Exception;
}
