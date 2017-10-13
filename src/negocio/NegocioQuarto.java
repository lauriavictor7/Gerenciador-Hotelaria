/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Quarto;
import dados.DadosQuarto;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class NegocioQuarto {
    
    private final DadosQuarto iDQ;
    
    public NegocioQuarto () {
        this.iDQ = new DadosQuarto();
    }
    
    public void cadastrarQuarto(Quarto q) {
        throw new UnsupportedOperationException("");
    }
    
    public void atualizarQuarto(Quarto q) {
        throw new UnsupportedOperationException("");
    }
    
    public void removerQuarto(Quarto q) {
        throw new UnsupportedOperationException("");
    }
    
    public List<Quarto> listarQuarto(Quarto filtro) {
        throw new UnsupportedOperationException("");
    }
}
