/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Servico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author lauriavictor
 */
public class DadosServico implements IDadosServico {

    private EntityManager em;
    
    public DadosServico() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
        em = emf.createEntityManager();
    }    
    
    @Override
    public void cadastrarServico(Servico s) throws Exception {
        EntityTransaction tx = em.getTransaction();
        
        try {
           tx.begin();
           em.persist(s);
           tx.commit();
        } catch (Exception e) {
           tx.rollback();
        }
    }

    @Override
    public void atualizarServico(Servico s) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerServico(Servico s) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Servico> listarServico(Servico filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Servico pesquisarServico(Servico s) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
