/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import basicas.Reserva;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public interface IDadosReserva {
    
    void cadastrarReserva(Reserva r) throws Exception;
    void atualizarReserva(Reserva r) throws Exception;
    void removerReserva(Reserva r) throws Exception;
    List<Reserva> listarReserva(Reserva filtro) throws Exception;
    Reserva pesquisarReserva(int cod) throws Exception;
}
