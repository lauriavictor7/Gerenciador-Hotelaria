/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Ocupacao;
import dados.DadosOcupacao;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class NegocioOcupacao {
    
    private void validarCadastrarOcupacao(Ocupacao o) throws Exception {
        if (o.getHospede().getCpf() == null) {
            throw new Exception("Por favor, informe o CPF.");
        }
        
        if (o.getDtEntrada().equals("  /  /   ")) {
            throw new Exception("Por favor, informe DATA DE ENTRADA válida.");
        }
        
        if (o.getDtSaida().equals("  /  /   ")) {
            throw new Exception("Por favor, informe DATA DE SAÍDA válida.");
        }        

        if (o.getHrEntrada().equals("  :  ")) {
            throw new Exception("Por favor, informe HORA DE ENTRADA válida.");
        }

        if (o.getHrSaida().equals("  :  ")) {
            throw new Exception("Por favor, informe HORA DE SAÍDA válida.");
        }
        
        if (o.getQuarto().getNum() <= 0) {
            throw new Exception("Por favor, informe um QAURTO válido.");
        }
        
        if (o.getQuarto().getNum() == o.getQuarto().getNum()) {
            throw new Exception("Quarto já ocupado.");
        }

        if (o.getValorDiaria() <= 0) {
            throw new Exception("Por favor, informe um VALOR DE DIÁRIA válido.");
        }
    }
    
    private void validarAtualizarOcupacao(Ocupacao o) throws Exception {
         if (o.getDtEntrada().equals("  /  /   ")) {
            throw new Exception("Por favor, informe DATA DE ENTRADA válida.");
        }
        
        if (o.getDtSaida().equals("  /  /   ")) {
            throw new Exception("Por favor, informe DATA DE SAÍDA válida.");
        }        

        if (o.getHrEntrada().equals("  :  ")) {
            throw new Exception("Por favor, informe HORA DE ENTRADA válida.");
        }

        if (o.getHrSaida().equals("  :  ")) {
            throw new Exception("Por favor, informe HORA DE SAÍDA válida.");
        }
        
        if (o.getQuarto().getNum() <= 0) {
            throw new Exception("Por favor, informe um QAURTO válido.");
        }
    }
    
    private void validarRemoverOcupacao(Ocupacao o) throws Exception {
        if(o.getId() <= 0) {
            throw new Exception("Ocupacão não encontrada.");
        }
    }
    
     private void validarPesquisarOcupacao(Ocupacao o) throws Exception {
        if(o.getId() <= 0) {
            throw new Exception("Ocupacão não encontrada.");
        }
    } 
     
    private final DadosOcupacao iDO;
    
    public NegocioOcupacao () {
        this.iDO = new DadosOcupacao();
    }
    
    public void cadastrarOcupacao(Ocupacao o) throws Exception {
        validarCadastrarOcupacao(o);
        iDO.cadastrarOcupacao(o);
    }
    
    public void atualizarOcupacao(Ocupacao o) throws Exception {
        validarAtualizarOcupacao(o);
        iDO.atualizarOcupacao(o);
    }
    
    public void removerOcupacao(Ocupacao o) throws Exception {
        validarRemoverOcupacao(o);
        iDO.removerOcupacao(o);
    }
    
    public List<Ocupacao> listarOcupacao(Ocupacao filtro) throws Exception {
        return iDO.listarOcupacao(filtro);
    }
    
    public Ocupacao pesquisarOcupacao(Ocupacao o) throws Exception {
        validarPesquisarOcupacao(o);
        return iDO.pesquisarOcupacao(o);
    }
    
    public Ocupacao procurarServico(Ocupacao o) throws Exception {
        return iDO.procursarServico(o);
    }    
}
