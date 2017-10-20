/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class Reserva {
    
    private int id;
    private String dt;
    private int periodo;
    
    //OneToOne?
    private Hospede hospede;
    
    //OneToMany?
    private Quarto quarto;
    
    //OneToOne?
    private Ocupacao ocupacao;
    
    //OneToOne?
    private Estado estado;
    
    //Faz sentido listar serviços em uma reserva? Visto que na reserva o hospede
    //somente selecionou um perido pra ficar.
    private List<Servico> servico;
    
    public Reserva () {
        this.hospede = new Hospede();
        this.quarto = new Quarto();
        this.ocupacao = new Ocupacao();
        this.estado = new Estado();
        this.servico = new ArrayList<>();
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

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
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

    public List<Servico> getServico() {
        return servico;
    }

    public void setServico(List<Servico> servico) {
        this.servico = servico;
    }
}
