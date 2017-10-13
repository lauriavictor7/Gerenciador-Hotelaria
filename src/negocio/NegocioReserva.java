/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Reserva;
import dados.DadosReserva;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class NegocioReserva {
    
    private final DadosReserva iDR;
    
    public NegocioReserva () {
        this.iDR = new DadosReserva();
    }
    
    public void cadastrarReserva(Reserva r) {
        throw new UnsupportedOperationException("");
    }
    
    public void atualizarReserva(Reserva r) {
        throw new UnsupportedOperationException("");
    }
    
    public void removerReserva(Reserva r) {
        throw new UnsupportedOperationException("");
    }
    
    public List<Reserva> listarReserva(Reserva filtro) {
        throw new UnsupportedOperationException("");
    }
    
    public Reserva pesquisarReserva(Reserva cod) {
        throw new UnsupportedOperationException("");
    }
}
