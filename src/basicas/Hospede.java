/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author lauriavictor
 */


public class Hospede extends Pessoa {
    
    private ArrayList<Hospede> detalhes;

    public ArrayList<Hospede> getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(ArrayList<Hospede> detalhes) {
        this.detalhes = detalhes;
    }   
}
