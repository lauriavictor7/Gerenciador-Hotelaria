/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Endereco;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author lauriavictor
 */
public class DadosEndereco implements IDadosEndereco {

    private EntityManager em;
    
    public DadosEndereco() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
        em = emf.createEntityManager();        
    }    
    
    @Override
    public void cadastrarEndereco(Endereco e) throws Exception {
        EntityTransaction tx = em.getTransaction();
        
        try {
           tx.begin();
           em.persist(e);
           tx.commit();
        } catch (Exception ex) {
           tx.rollback();
           System.out.println("1");
        }
    }

    @Override
    public void atualizarEndereco(Endereco e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerEndereco(Endereco e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
