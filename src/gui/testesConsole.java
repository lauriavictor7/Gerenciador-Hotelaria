/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import basicas.Servico;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import negocio.Fachada;

/**
 *
 * @author lauriavictor
 */
public class testesConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistencia");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
        
        /*
        try {
            Servico s = new Servico();
            Fachada f = new Fachada();
        
            s.setDesc("Cerveja");
            s.setValor(4);
            s.setId(1);
                    
            f.cadastrarServico(s);
            System.out.println("Sucesso!");
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        */
    }
    
}
