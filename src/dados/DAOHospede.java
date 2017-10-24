/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Hospede;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author lauriavictor
 */
public class DAOHospede extends DAOGenerico<Hospede> {
    
    public DAOHospede(EntityManagerFactory emf) {
        super(emf);
    }   
}
