/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Funcionario;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author lauriavictor
 */
public class DAOFuncionario extends DAOGenerico<Funcionario> {
    
    public DAOFuncionario(EntityManagerFactory emf) {
        super(emf);
    }
    
}
