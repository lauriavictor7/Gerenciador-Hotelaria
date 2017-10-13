/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Estado;
import dados.DadosEstado;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class NegocioEstado {
    
    private final DadosEstado iDE;
    
    public NegocioEstado () {
        this.iDE = new DadosEstado();
    }
    
    public void atualizarEstado(Estado s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List<Estado> listarEstado(Estado filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
}
