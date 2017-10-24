/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Reserva;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author lauriavictor
 */
public class DAOReserva extends DAOGenerico<Reserva> {
    
    public DAOReserva(EntityManagerFactory emf) {
        super(emf);
    }
    
}
