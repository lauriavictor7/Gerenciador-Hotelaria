/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Funcionario;
import basicas.Hospede;
import dados.IDadosFuncionario;
import dados.IDadosHospede;
import java.util.List;

/**
 *
 * @author lauriavictor
 */
public class Fachada implements IDadosHospede, IDadosFuncionario {

    private final NegocioHospede nh;
    private final NegocioFuncionario nf;
    
    public Fachada () {
        this.nh = new NegocioHospede();
        this.nf = new NegocioFuncionario();
    }
    
    @Override
    public void cadastrarHospede(Hospede h) throws Exception {
        this.nh.cadastrarHospede(h);
    }

    @Override
    public void atualizarHospede(Hospede h) throws Exception {
        this.nh.atualizarHospede(h);
    }

    @Override
    public void removerHosptede(Hospede h) throws Exception {
        this.nh.removerHosptede(h);
    }    
    
    @Override
    public List<Hospede> listarHospede(Hospede filtro) throws Exception {
        return this.nh.listarHospede(filtro);
    }
    
    
    @Override
    public Hospede pesquisarHospede(String cpf) throws Exception {
        return this.nh.pesquisarHospede(cpf);
    }
    
    @Override
    public Hospede detalhesHospede(Hospede h) throws Exception {
        return this.nh.detalhesHospede(h);
    }

    @Override
    public void cadastrarFuncionario(Funcionario f) throws Exception {
        this.nf.cadastrarFuncionario(f);
    }

    @Override
    public void atualizarFuncionario(Funcionario f) throws Exception {
        this.nf.atualizarFuncionario(f);
    }

    @Override
    public void removerFuncionario(Funcionario f) throws Exception {
        this.nf.removerFuncionario(f);
    }

    @Override
    public List<Funcionario> listarFuncionario(Funcionario filtro) throws Exception {
        return this.nf.listarHospede(filtro);
    }   
}
