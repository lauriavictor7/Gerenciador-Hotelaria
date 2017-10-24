/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dados;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author lauriavictor
 */
public abstract class DAOFactory {
    
    private static final EntityManagerFactory factory;
    
    static {
        factory = Persistence.createEntityManagerFactory("persistencia");
    }
    
    public static DAOHospede getDAOHospede() {
        DAOHospede dH = new DAOHospede(factory);
        return dH;
    }
    
    public static DAOServico getDAOServico() {
        DAOServico dS = new DAOServico(factory);
        return dS;
    }
    
    public static DAOEstado getDAOEstado() {
        DAOEstado dE = new DAOEstado(factory);
        return dE;
    }
    
    public static DAOQuarto getDAOQuarto() {
        DAOQuarto dQ = new DAOQuarto(factory);
        return dQ;
    }
    
    public static DAOFuncionario getDAOFuncionario() {
        DAOFuncionario dF = new DAOFuncionario(factory);
        return dF;
    }
    
    public static DAOReserva getDAOReserva() {
        DAOReserva dR = new DAOReserva(factory);
        return dR;
    }
    
    public static DAOOcupacao getDAOOcupacao() {
        DAOOcupacao dO = new DAOOcupacao(factory);
        return dO;
    }
    
    public static DAOEndereco getDAOEndereco() {
        DAOEndereco dEND = new DAOEndereco(factory);
        return dEND;
    }
}
