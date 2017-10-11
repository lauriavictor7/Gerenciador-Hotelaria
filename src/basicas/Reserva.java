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
    
    private int cod;
    private String dt;
    private int periodo;
    private Hospede hospede;
    private Quarto quarto;
    private Ocupacao ocupacao;
    private Situacao situacao;
    private List<Servico> servico;
    
    public Reserva () {
        this.hospede = new Hospede();
        this.quarto = new Quarto();
        this.ocupacao = new Ocupacao();
        this.situacao = new Situacao();
        this.servico = new ArrayList<>();
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

    public List<Servico> getServico() {
        return servico;
    }

    public void setServico(List<Servico> servico) {
        this.servico = servico;
    }
}
