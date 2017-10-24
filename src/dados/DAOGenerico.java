/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceException;

/**
 *
 * @author lauriavictor
 */
public abstract class DAOGenerico<Entity> {
    
    private EntityManagerFactory entityManagerFactory;
    private Class<Entity> persistentClass;
    
    @SuppressWarnings("uncheked")
    public DAOGenerico(EntityManagerFactory emf) {
        this.setEntityManagerFactory(emf);
        this.entityManagerFactory = emf;
        ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
        persistentClass = (Class<Entity>) parameterizedType.getActualTypeArguments()[0];
    }
    
    public Entity atualizarObjeto(Entity obj) {
        EntityManager em = this.entityManagerFactory.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        obj = em.merge(obj);
        tx.commit();
        em.close();
        
        return obj;
    }
    
    public final List<Entity> listarObjeto() {
        List<Entity> instance = null;
        
        EntityManager em = this.entityManagerFactory.createEntityManager();
        
        try {
            instance = ((List<Entity>) em.createQuery("from " 
                                      + getPersistentClass().getName()).getResultList());
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
        
        em.close();
        
        return instance;
    }
    
    public void cadastrarObjeto(Entity obj) {
        EntityManager em = this.entityManagerFactory.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        
        try {
           tx.begin(); 
           em.persist(obj);
           tx.commit();
           em.close();
        } catch(PersistenceException pe) {
            System.out.println("Erro: " + pe.getMessage());
            tx.rollback();
        }
    }
    
    public final void inserirColecao(Collection<Entity> colecao) {
        EntityManager em = this.entityManagerFactory.createEntityManager();
        
        try {
            EntityTransaction tx = em.getTransaction();
            tx.begin();
            
            for(Entity entidade : colecao) {
                em.persist(entidade);
            }
            
            tx.commit();
            em.close();
        } catch(PersistenceException pe) {
            pe.printStackTrace();
        }
    }
    
    public final void removerObjeto(Entity obj) {
        EntityManager em = this.entityManagerFactory.createEntityManager();
        
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        obj = em.merge(obj);
        
        em.remove(obj);
        
        tx.commit();
        
        em.close();
    }
    
    public final Entity pesquisarObjeto(Serializable chave) {
        Entity instance = null;
        EntityManager em = this.entityManagerFactory.createEntityManager();
        
        try {
            instance = (Entity) em.find(getPersistentClass(), chave);
        } catch (RuntimeException re) {
            re.printStackTrace();
        }
        
        em.close();
        
        return instance;
    }
    
    public final void refreshObjeto(Entity obj) {
        EntityManager em = this.entityManagerFactory.createEntityManager();
        
        em.refresh(obj);
        em.close();
    }
    
    public void setEntityManagerFactory(EntityManagerFactory entityManagerFactory) {
        this.entityManagerFactory = entityManagerFactory;
    }
    
    public EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
    
    protected final Class<Entity> getPersistentClass() {
        return persistentClass;
    }
}
