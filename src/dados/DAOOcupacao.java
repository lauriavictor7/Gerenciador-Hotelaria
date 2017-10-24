/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Ocupacao;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author lauriavictor
 */
public class DAOOcupacao extends DAOGenerico<Ocupacao> {
    
    public DAOOcupacao(EntityManagerFactory emf) {
        super(emf);
    }
    
}
