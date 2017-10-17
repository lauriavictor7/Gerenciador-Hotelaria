/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Servico;
import dados.DadosServico;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class NegocioServico {
    
    private void validarCadastrarServico(Servico s) throws Exception {
        if (s.getCod() <= 0) {
            throw new Exception("Por favor, informar um CÓDIGO DE SERVIÇO válido.");
        }

        if (s.getDesc().length() > 20) {
            throw new Exception("Por favor, DESCREVA o Serviço com menos de VINTE(20) caracteres.");
        }

        if (s.getDesc().equals("")) {
            throw new Exception("Por favor, DESCREVA o serviço.");
        }

        if (s.getDesc() == null) {
            throw new Exception("Por favor, DESCREVA o serviço.");
        }

        if (s.getValor() <= 0) {
            throw new Exception("Por favor, informe um VALOR válido para o cerviço.");
        }        
    }
    
    private void validarAtualizarServico(Servico s) throws Exception {
        if (s.getDesc().length() > 20) {
            throw new Exception("Por favor, DESCREVA o Serviço com menos de VINTE(20) caracteres.");
        }

        if (s.getDesc().equals("")) {
            throw new Exception("Por favor, DESCREVA o serviço.");
        }

        if (s.getDesc() == null) {
            throw new Exception("Por favor, DESCREVA o serviço.");
        }

        if (s.getValor() <= 0) {
            throw new Exception("Por favor, informe um VALOR válido para o cerviço.");
        }        
    }
    
    private void validarRemoverServico(Servico s) throws Exception {
        if (s.getCod() <= 0) {
            throw new Exception("Por favor, informar um CÓDIGO DE SERVIÇO válido.");
        }        
    }
    
     private void validarPesquisarServico(Servico s) throws Exception {
        if (s.getCod() <= 0) {
            throw new Exception("Por favor, informar um CÓDIGO DE SERVIÇO válido.");
        }        
    }
     
    private final DadosServico iDS;
    
    public NegocioServico () {
        this.iDS = new DadosServico();
    }
    
    public void cadastrarServico(Servico s) throws Exception {
        validarCadastrarServico(s);
        iDS.cadastrarServico(s);
    }
    
    public void atualizarServico(Servico s) throws Exception {
        validarAtualizarServico(s);
        iDS.atualizarServico(s);
    }
    
    public void removerServico(Servico s) throws Exception {
        validarRemoverServico(s);
        iDS.removerServico(s);
    }
    
    public List<Servico> listarServico(Servico filtro) throws Exception {
        return iDS.listarServico(filtro);
    }
    
    public Servico pesquisarServico(Servico s) throws Exception {
        validarPesquisarServico(s);
        return iDS.pesquisarServico(s);
    }    
}
