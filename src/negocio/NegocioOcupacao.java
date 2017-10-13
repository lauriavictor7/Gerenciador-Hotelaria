/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Ocupacao;
import dados.DadosOcupacao;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class NegocioOcupacao {
    
    private final DadosOcupacao iDO;
    
    public NegocioOcupacao () {
        this.iDO = new DadosOcupacao();
    }
    
    public void cadastrarOcupacao(Ocupacao o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void atualizarOcupacao(Ocupacao o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void removerOcupacao(Ocupacao o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public List<Ocupacao> listarOcupacao(Ocupacao filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public Ocupacao pesquisarOcupacao(Ocupacao o) {
        throw new UnsupportedOperationException("");
    }
    
    public Ocupacao procurarServico(Ocupacao o) {
        throw new UnsupportedOperationException("");
    }    
}
