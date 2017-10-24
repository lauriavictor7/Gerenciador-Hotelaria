/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import basicas.Endereco;
import basicas.Funcionario;
import basicas.Hospede;
import basicas.Ocupacao;
import basicas.Quarto;
import basicas.Reserva;
import basicas.Servico;
import basicas.Estado;
import dados.IDadosFuncionario;
import dados.IDadosHospede;
import dados.IDadosOcupacao;
import dados.IDadosQuarto;
import dados.IDadosReserva;
import dados.IDadosServico;
import java.util.List;
import dados.IDadosEstado;
import dados.IDadosEndereco;

/**
 *
 * @author lauriavictor
 */
public class Fachada implements IDadosHospede, IDadosFuncionario, IDadosReserva, IDadosQuarto, IDadosOcupacao , IDadosServico, IDadosEstado, IDadosEndereco  {

    private final NegocioHospede nh;
    private final NegocioFuncionario nf;
    private final NegocioReserva nr;
    private final NegocioQuarto nq;
    private final NegocioOcupacao no;
    private final NegocioServico ns;
    private final NegocioEstado ne;
    
    public Fachada () {
        this.nh = new NegocioHospede();
        this.nf = new NegocioFuncionario();
        this.nr = new NegocioReserva();
        this.nq = new NegocioQuarto();
        this.no = new NegocioOcupacao();
        this.ns = new NegocioServico();
        this.ne = new NegocioEstado();
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
    public void removerHospede(Hospede h) throws Exception {
        this.nh.removerHospede(h);
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

    @Override
    public void cadastrarReserva(Reserva r) throws Exception {
         this.nr.cadastrarReserva(r);
    }

    @Override
    public void atualizarReserva(Reserva r) throws Exception {
        this.nr.atualizarReserva(r);
    }

    @Override
    public void removerReserva(Reserva r) throws Exception {
        this.nr.removerReserva(r);
    }

    @Override
    public List<Reserva> listarReserva(Reserva filtro) throws Exception {
        return this.nr.listarReserva(filtro);
    }

    @Override
    public Reserva pesquisarReserva(int cod) throws Exception {
        return this.nr.pesquisarReserva(cod);
    }

    @Override
    public void cadastrarQuarto(Quarto q) throws Exception {
       this.nq.cadastrarQuarto(q);
    }

    @Override
    public void atualizarQuarto(Quarto q) throws Exception {
        this.nq.atualizarQuarto(q);
    }

    @Override
    public void removerQuarto(Quarto q) throws Exception {
        this.nq.removerQuarto(q);
    }

    @Override
    public List<Quarto> listarQuarto(Quarto filtro) throws Exception {
        return this.nq.listarQuarto(filtro);
    }

    @Override
    public void cadastrarOcupacao(Ocupacao o) throws Exception {
        this.no.cadastrarOcupacao(o);
    }

    @Override
    public void atualizarOcupacao(Ocupacao o) throws Exception {
        this.no.atualizarOcupacao(o);
    }

    @Override
    public void removerOcupacao(Ocupacao o) throws Exception {
        this.no.removerOcupacao(o);
    }

    @Override
    public List<Ocupacao> listarOcupacao(Ocupacao filtro) throws Exception {
        return this.no.listarOcupacao(filtro);
    }

    @Override
    public Ocupacao pesquisarOcupacao(Ocupacao o) throws Exception {
        return this.no.pesquisarOcupacao(o);
    }

    @Override
    public Ocupacao procursarServico(Ocupacao o) throws Exception {
        return this.no.procurarServico(o);
    }

    @Override
    public void cadastrarServico(Servico s) throws Exception {
        this.ns.cadastrarServico(s);
    }

    @Override
    public void atualizarServico(Servico s) throws Exception {
        this.ns.atualizarServico(s);
    }

    @Override
    public void removerServico(Servico s) throws Exception {
        this.ns.removerServico(s);
    }

    @Override
    public List<Servico> listarServico(Servico filtro) throws Exception {
        return this.ns.listarServico(filtro);
    }

    @Override
    public Servico pesquisarServico(Servico s) throws Exception {
        return this.ns.pesquisarServico(s);
    }

    @Override
    public void atualizarEstado(Estado e) throws Exception {
        this.ne.atualizarEstado(e);
    }

    @Override
    public List<Estado> listarEstado(Estado filtro) throws Exception {
        return this.ne.listarEstado(filtro);
    }

    @Override
    public void cadastrarEndereco(Endereco e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atualizarEndereco(Endereco e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removerEndereco(Endereco e) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
