/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Quarto;
import dados.DadosQuarto;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class NegocioQuarto {
    
    private void validarCadastrarQuarto(Quarto q) throws Exception {
        if (q.getNum()< 0) {
            throw new Exception("Por Favor, informe um número de quarto maior que ZERO.");
        }

        if (q.getDescricao().length() > 20) {
            throw new Exception("Por Favor, descreva o quarto com menos de VINTE caracteres.");
        }

        if ((q.getPreco() < 0) || (q.getPreco() < 20))  {
            throw new Exception("Por Favor, informe um VALOR válido.");
        }

        if (q.getAndar() < 0) {
            throw new Exception("Por Favor, Informe o ANDAR.");
        }        
    }
    
    private void validarAtualizarQuarto(Quarto q) throws Exception {
        if (q.getNum()<= 0) {
            throw new Exception("Por Favor, informe um número de quarto maior que ZERO.");
        }

        if (q.getDescricao().length() > 20) {
            throw new Exception("Por Favor, descreva o quarto com menos de VINTE caracteres.");
        }

        if ((q.getPreco() < 0) || (q.getPreco() < 20))  {
            throw new Exception("Por Favor, informe um VALOR válido.");
        }

        if (q.getAndar() < 0) {
            throw new Exception("Por Favor, Informe o ANDAR.");
        } 
    }
    
    private void validarRemoverQuarto(Quarto q) throws Exception {
        if (q.getNum()< 0) {
            throw new Exception("Por Favor, informe um número de quarto maior que ZERO.");
        }        
    }
    
    private final DadosQuarto iDQ;
    
    public NegocioQuarto () {
        this.iDQ = new DadosQuarto();
    }
    
    public void cadastrarQuarto(Quarto q) throws Exception {
        validarCadastrarQuarto(q);
        iDQ.cadastrarQuarto(q);
    }
    
    public void atualizarQuarto(Quarto q) throws Exception {
        validarAtualizarQuarto(q);
        iDQ.atualizarQuarto(q);
    }
    
    public void removerQuarto(Quarto q) throws Exception {
        validarRemoverQuarto(q);
        iDQ.removerQuarto(q);
    }
    
    public List<Quarto> listarQuarto(Quarto filtro) throws Exception {
        return iDQ.listarQuarto(filtro);
    }
}
