/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import org.hibernate.cfg.Configuration;
import org.hibernate.ejb.Ejb3Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author lauriavictor
 */
public class JPAUtil {
    
    private static Ejb3Configuration config = new Ejb3Configuration();
    
    public static void gerarTabelas() {
        config.configure("persistencia", null);
        Configuration hbmcfg = config.getHibernateConfiguration();
        SchemaExport schemaExport = new SchemaExport(hbmcfg);
        schemaExport.create(true, true);
        System.out.println("Tabelas criadas!");
    }
    
    public static void main(String[] args) {
        
        gerarTabelas();
    }
}
