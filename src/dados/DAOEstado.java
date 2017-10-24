/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Estado;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author lauriavictor
 */
public class DAOEstado extends DAOGenerico<Estado> {
    
    public DAOEstado(EntityManagerFactory emf) {
        super(emf);
    }
    
}
