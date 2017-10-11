/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

import java.util.List;

/**
 *
 * @author lauriavictor
 */


public class Hospede extends Pessoa {
    
    private List<Hospede> detalhes;

    public List<Hospede> getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(List<Hospede> detalhes) {
        this.detalhes = detalhes;
    }
}
