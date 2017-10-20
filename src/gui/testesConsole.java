/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import basicas.Hospede;
import basicas.Servico;
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
            Hospede h = new Hospede();
            Fachada f = new Fachada();
            
            h.setCpf("107.079.914-98");
            h.setDataNasc("20/11/1993");
            h.setEmail("victor7lauria@live.com");
            h.setNome("Victor Lauria");
            h.setSexo("Masculino");
            h.setTelefone("(81) 9.9768-2838");
            
            f.cadastrarHospede(h);
            System.out.println("Sucesso!");
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        */
    }
    
}
