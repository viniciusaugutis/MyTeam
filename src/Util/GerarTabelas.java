package Util;


import Model.Cidade;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jeff
 */
public class GerarTabelas {
    public static void main(String[] args) {
        // Cria uma configuracao para a classe Produto
        AnnotationConfiguration cfg = new AnnotationConfiguration();
        cfg.addAnnotatedClass(Cidade.class);
        //..poderia adicionar outras classes...
        new SchemaExport(cfg).create(true, true);
    }
}