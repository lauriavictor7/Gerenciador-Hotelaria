/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Hospede;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author lauriavictor
 */
public class DadosHospede implements IDadosHospede {
    
    private EntityManager em;
    
    public DadosHospede() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
        em = emf.createEntityManager();        
    }
    
    @Override
    public void cadastrarHospede(Hospede h) throws Exception {
        EntityTransaction tx = em.getTransaction();
        
        try {
           tx.begin();
           em.persist(h);
           tx.commit();
        } catch (Exception e) {
           tx.rollback();
        }
    }

    @Override
    public void atualizarHospede(Hospede h) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void removerHosptede(Hospede h) throws Exception {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<Hospede> listarHospede(Hospede filtro) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hospede pesquisarHospede(String cpf) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Hospede detalhesHospede(Hospede h) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }  
}
