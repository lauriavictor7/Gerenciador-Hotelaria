/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Estado;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public interface IDadosEstado {
    
    void atualizarEstado(Estado e) throws Exception;
    List<Estado> listarEstado(Estado filtro) throws Exception;
}
