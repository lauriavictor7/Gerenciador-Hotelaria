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
    
    private void validarAtualizarEstado(Estado e) throws Exception {
        if(e.getCod() <= 0) {
            throw new Exception("Informe um CÓDIGO válido.");
        }
        
        if(e.getDesc().equals("")) {
            throw new Exception("Informe uma DESCRIÇÃO válida.");
        }
    }
    
    private final DadosEstado iDE;
    
    public NegocioEstado () {
        this.iDE = new DadosEstado();
    }
    
    public void atualizarEstado(Estado e) throws Exception {
        validarAtualizarEstado(e);
        iDE.atualizarEstado(e);
    }

    public List<Estado> listarEstado(Estado filtro) throws Exception {
        return iDE.listarEstado(filtro);
    }    
}
