/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Quarto;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author lauriavictor
 */
public class DAOQuarto extends DAOGenerico<Quarto> {
    
    public DAOQuarto(EntityManagerFactory emf) {
        super(emf);
    }
    
}
