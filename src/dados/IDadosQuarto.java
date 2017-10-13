/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Quarto;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public interface IDadosQuarto {
    
    void cadastrarQuarto(Quarto q) throws Exception;
    void atualizarQuarto(Quarto q) throws Exception;
    void removerQuarto(Quarto q) throws Exception;
    List<Quarto> listarQuarto(Quarto filtro) throws Exception;
}
