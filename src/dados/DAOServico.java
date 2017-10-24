/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Servico;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author lauriavictor
 */
public class DAOServico extends DAOGenerico<Servico> {
    
    public DAOServico(EntityManagerFactory emf) {
        super(emf);
    }
    
}
