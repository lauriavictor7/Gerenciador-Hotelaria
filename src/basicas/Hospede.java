/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basicas;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;

/**
 *
 * @author lauriavictor
 */

@Entity
public class Hospede extends Pessoa {
    
    public Hospede() {
        
    }
    
    public Hospede(Integer codigo, Calendar dataUltimaAtualizacao, Calendar dataNasc, String nome,
                                                               String sexo, String cpf) {
        super(codigo, dataUltimaAtualizacao, dataNasc, nome, sexo, cpf);
    }
    
    public Hospede(Calendar dataNasc, String nome, String sexo, String cpf) {
        super(dataNasc, nome, sexo, cpf);
    } 
    
    private String email;
    private String telefone;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
