/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Hospede;
import dados.DadosHospede;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class NegocioHospede {
    
    private void validarCadastrarHospede(Hospede h) throws Exception {
        if(h.getCpf().trim().length() < 14) {
            throw new Exception("Por favor, informar o CPF.");
        }
        
        if(h.getCpf().equals("   .   .   -  ")) {
            throw new Exception("Por favor, informar o CPF");
        }
        
        if(h.getNome().trim().equals("")) {
            throw new Exception("Por favor, informar o NOME.");
        }
        
        if(h.getDataNasc().trim().length() < 10) {
            throw new Exception("Por favor, informar DATA DE NASCIMENTO.");
        }
    }
    
    private void validarAtualizarHospede(Hospede h) throws Exception {
        if(h.getNome().trim().equals("")) {
            throw new Exception("Por favor, informar o NOME.");
        }
        
        if(h.getDataNasc().trim().length() < 10) {
            throw new Exception("Por favor, informar DATA DE NASCIMENTO.");
        }
    }
    
    private void validarRemoverHospede(Hospede h) throws Exception {
        if(h.getCpf().trim().length() < 14) {
            throw new Exception("Por favor, informar o CPF.");
        }
        
        if(h.getCpf().equals("   .   .   -  ")) {
            throw new Exception("Hósspede não encontrado!");
        }
        
        if(h.getCpf() == null) {
            throw new Exception("Hóspede não encotrado!");
        }
    }
    
    private void validarPesquisarHospede(String cpf) throws Exception {
        Hospede h = new Hospede();
        
        if(h.getCpf().equals("   .   .   -  ")) {
            throw new Exception("Hósspede não encontrado!");
        }
        
        if(h.getCpf() == null) {
            throw new Exception("Hóspede não encotrado!");
        }        
    }
    
    private final DadosHospede iDH;
    
    public NegocioHospede () {
        this.iDH = new DadosHospede();
    }

    public void cadastrarHospede(Hospede h) throws Exception {
        validarCadastrarHospede(h);
        iDH.cadastrarHospede(h);
    }

    public void atualizarHospede(Hospede h) throws Exception {
        validarAtualizarHospede(h);
        iDH.atualizarHospede(h);
    }

    public void removerHosptede(Hospede h) throws Exception {
        validarRemoverHospede(h);
        iDH.removerHosptede(h);
    }

    public List<Hospede> listarHospede(Hospede filtro) throws Exception {
        return iDH.listarHospede(filtro);
    }

    public Hospede pesquisarHospede(String cpf) throws Exception {
        validarPesquisarHospede(cpf);
        return iDH.pesquisarHospede(cpf);
    }

    public Hospede detalhesHospede(Hospede h) throws Exception {
        return iDH.detalhesHospede(h);
    }
    
}
