/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Funcionario;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public interface IDadosFuncionario {
    
    void cadastrarFuncionario(Funcionario f) throws Exception;
    void atualizarFuncionario(Funcionario f) throws Exception;
    void removerFuncionario(Funcionario f) throws Exception;
    List<Funcionario> listarFuncionario(Funcionario filtro) throws Exception;
}
