/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import dados.DadosHospede;
import dados.IDadosHospede;
import java.util.GregorianCalendar;

/**
 *
 * @author lauriavictor
 */
public class TesteHospede {
    
    private IDadosHospede iDH;
    
    @Before
    public void init() {
        iDH = new DadosHospede();
    }
    
    @Test
    public void testeInsetirHospede() throws Exception {
        Hospede h = new Hospede(new GregorianCalendar(1993, 11, 20), "Victor Lauria", "Masculino", 
                                "107.079.914-98");
        h.setEmail("victor7lauria@live.com");
        h.setTelefone("(81) 9.9769-2838");
        System.out.println("3"); 
        iDH.cadastrarHospede(h);
    } 
}
