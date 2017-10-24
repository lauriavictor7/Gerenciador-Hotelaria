/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Endereco;

/**
 *
 * @author lauriavictor
 */
public interface IDadosEndereco {

    void cadastrarEndereco(Endereco e) throws Exception;
    void atualizarEndereco(Endereco e) throws Exception;
    void removerEndereco(Endereco e) throws Exception;    
}
