/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

import java.util.Calendar;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author lauriavictor
 */

@MappedSuperclass
public abstract class Pessoa extends ObjetoSistema {
    
    public Pessoa() {
        
    }
    
    public Pessoa(Integer codigo, Calendar dataUltimaAtualizacao, Calendar dataNasc, String nome,
                                                              String sexo, String cpf) {
        super(codigo, dataUltimaAtualizacao);
        this.dataNasc = dataNasc;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
    }
    
    public Pessoa(Calendar dataNasc, String nome, String sexo, String cpf) {
        super();
        this.dataNasc = dataNasc;
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
    }
    
    @Temporal(TemporalType.DATE)
    private Calendar dataNasc;
    private String nome;
    private String sexo;
    private String cpf;

    public Calendar getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Calendar dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }   
}
