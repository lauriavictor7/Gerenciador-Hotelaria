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

@Entity
public class Hospede {
    
    @Id
    private String cpf;
    private String nome;
    private String fone;
    private String sexo;
    private ArrayList<Hospede> detalhes;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ArrayList<Hospede> getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(ArrayList<Hospede> detalhes) {
        this.detalhes = detalhes;
    }   
}
