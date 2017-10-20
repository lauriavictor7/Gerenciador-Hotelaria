/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Ocupacao;
import basicas.Reserva;
import dados.DadosReserva;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class NegocioReserva {
    
    private void validarCadastrarReserva(Reserva r) throws Exception {
        if(r.getHospede().getCpf().trim().length() < 14) {
            throw new Exception("Por favor, informe o CPF.");
        }
        
        if(r.getPeriodo() < 0) {
            throw new Exception("Por favor, informe o PERÍODO.");
        }
        
        if(r.getDt().equals("  /  /    ")) {
            throw new Exception("Por favor, informe a DATA.");
        }
        
        if(r.getListaQuarto().isEmpty()) {
            throw new Exception("Por favor, informe o QUARTO.");
        }
        
        Fachada f = new Fachada();
        Ocupacao o = new Ocupacao();
        
        o.setId(r.getOcupacao().getId());
        o = f.pesquisarOcupacao(o);
        
        if(o.getHospede().getCpf() == null) {
            throw new Exception("Ocupação não cadastrada!");
        }
    }
    
    private void validarAtualizarReserva(Reserva r) throws Exception {
        if(r.getPeriodo() < 0) {
            throw new Exception("Por favor, informe o PERÍODO.");
        }
        
        if(r.getDt().equals("  /  /    ")) {
            throw new Exception("Por favor, informe a DATA.");
        }
        
        if(r.getListaQuarto().isEmpty()) {
            throw new Exception("Por favor, informe o QUARTO.");
        }        
    }
    
    private void validarRemoverReserva(Reserva r) throws Exception {
        if (r.getId() <= 0) {
            throw new Exception("Reserva não encontrada.");
        }
    }
    
    private void validarPesquisarReserva(int cod) throws Exception {
        if (cod <= 0) {
            throw new Exception("Reserva não encontrada.");
        }
    }
    private final DadosReserva iDR;
    
    public NegocioReserva () {
        this.iDR = new DadosReserva();
    }
    
    public void cadastrarReserva(Reserva r) throws Exception {
        validarCadastrarReserva(r);
        iDR.cadastrarReserva(r);
    }
    
    public void atualizarReserva(Reserva r) throws Exception {
        validarAtualizarReserva(r);
        iDR.atualizarReserva(r);
    }
    
    public void removerReserva(Reserva r) throws Exception {
        validarRemoverReserva(r);
        iDR.removerReserva(r);
    }
    
    public List<Reserva> listarReserva(Reserva filtro) throws Exception {
        return iDR.listarReserva(filtro);
    }
    
    public Reserva pesquisarReserva(int cod) throws Exception {
        validarPesquisarReserva(cod);
        Reserva r = iDR.pesquisarReserva(cod);
        return r;
    }
}
