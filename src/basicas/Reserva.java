/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author lauriavictor
 */

@Entity
public class Reserva {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String dt;
    private int periodo;
    
    @OneToOne
    @JoinColumn(name = "idHospede")
    private Hospede hospede;
    
    @OneToMany(mappedBy = "reserva")
    private List<Quarto> listaQuarto;
    
    @OneToOne
    @JoinColumn(name = "idOcupacao")        
    private Ocupacao ocupacao;
    
    @OneToOne
    @JoinColumn(name = "idEstado")
    private Estado estado;
    
    public Reserva () {
        this.hospede = new Hospede();
        this.listaQuarto = new ArrayList<>();
        this.ocupacao = new Ocupacao();
        this.estado = new Estado();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDt() {
        return dt;
    }

    public void setDt(String dt) {
        this.dt = dt;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public Ocupacao getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(Ocupacao ocupacao) {
        this.ocupacao = ocupacao;
    }    

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public List<Quarto> getListaQuarto() {
        return listaQuarto;
    }

    public void setListaQuarto(List<Quarto> listaQuarto) {
        this.listaQuarto = listaQuarto;
    }
}
