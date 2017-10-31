/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */

@Entity @Table(name="arbitro")
public class Arbitro {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "rua")
    private String rua;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "bairro")
    private int numero;

    @Column(name = "cep")
    private String cep;
    
    @ManyToOne
    @JoinColumn(name = "cidade_id")
    private Cidade cidade;
    

}
