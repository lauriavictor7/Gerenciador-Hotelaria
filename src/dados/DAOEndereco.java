/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Endereco;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author lauriavictor
 */
public class DAOEndereco extends DAOGenerico<Endereco> {
    
    public DAOEndereco(EntityManagerFactory emf) {
        super(emf);
    }   
}
