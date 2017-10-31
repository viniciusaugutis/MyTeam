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
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */

@Entity @Table(name="time")
public class Time {
    
    public Time(String nome, int pontos, int golsPro, int golsContra) {
        this.nome = nome;
        this.pontos = pontos;
        this.golsPro = golsPro;
        this.golsContra = golsContra;
    }
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "pontos")
    private int pontos;
    
    @Column(name = "gols_pro")
    private int golsPro;
    
    @Column(name = "gols_contra")
    private int golsContra;

   
}
