/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import basicas.Endereco;
import basicas.Estado;
import basicas.Hospede;
import dados.DAOFactory;
import java.util.GregorianCalendar;
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
        
        try {
            
            Endereco e = new Endereco();
            Fachada f = new Fachada();
            
            e.setId(1);
            e.setCep("51150-244");
            e.setBairro("Imbiribeira");
            e.setLogradouro("Rua dez");
            e.setNum("614");
            
            f.cadastrarEndereco(e);
            
            //DAOFactory.getDAOEndereco().cadastrarObjeto(e);
            
            /*
            Estado e = new Estado();
            
            e.setId(1);
            e.setDesc("Finalzado");
            
            DAOFactory.getDAOEstado().cadastrarObjeto(e);
            */
            /*
            Hospede h = new Hospede();

            h.setDataUltimaAtualizacao(new GregorianCalendar(2017, 21, 10));
            h.setCpf("107.079.914-98");
            h.setDataNasc(new GregorianCalendar(1993, 20, 11));
            h.setNome("Victor Lauria");
            h.setSexo("Masculino");
            h.setEmail("victor7lauria@live.com");
            h.setTelefone("(81) 9.9768-2838");
            
            DAOFactory.getDAOHospede().cadastrarObjeto(h);
            */
            System.out.println("Sucesso!");
        } catch (Exception ex) {
            System.out.println("Erro: " + ex.getMessage());
        }
        
    }
    
}
