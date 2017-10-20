/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author lauriavictor
 */

@Entity
public class Servico {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String desc;
    private double valor;
    
    @ManyToMany
    @JoinTable(name = "OcupacaoServico",
               joinColumns = {@JoinColumn(name = "idServico")},
               inverseJoinColumns = {@JoinColumn(name = "idOcupacao")})
    private List<Ocupacao> listaOcupacao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public List<Ocupacao> getListaOcupacao() {
        return listaOcupacao;
    }

    public void setListaOcupacao(List<Ocupacao> listaOcupacao) {
        this.listaOcupacao = listaOcupacao;
    }
    
}
