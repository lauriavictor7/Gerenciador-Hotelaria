/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

import java.util.ArrayList;

/**
 *
 * @author lauriavictor
 */
public class Ocupacao {
    
    private int id;
    private String dtEntrada;
    private String dtSaida;
    private String hrEntrada;
    private String hrSaida;
    private float valorDiaria;
    private Quarto quarto;
    private Hospede hospede;
    private ArrayList<Servico> servico;
    
    public Ocupacao () {
        this.hospede = new Hospede();
        this.quarto = new Quarto();
        this.servico = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDtEntrada() {
        return dtEntrada;
    }

    public void setDtEntrada(String dtEntrada) {
        this.dtEntrada = dtEntrada;
    }

    public String getDtSaida() {
        return dtSaida;
    }

    public void setDtSaida(String dtSaida) {
        this.dtSaida = dtSaida;
    }

    public String getHrEntrada() {
        return hrEntrada;
    }

    public void setHrEntrada(String hrEntrada) {
        this.hrEntrada = hrEntrada;
    }

    public String getHrSaida() {
        return hrSaida;
    }

    public void setHrSaida(String hrSaida) {
        this.hrSaida = hrSaida;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public ArrayList<Servico> getServico() {
        return servico;
    }

    public void setServico(ArrayList<Servico> servico) {
        this.servico = servico;
    }       
}
