/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
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
public class Time implements Serializable {
    
    public Time(){
        
    }
     
    public Time(String nome, int pontos, int golsPro, int golsContra) {
        this.nome = nome;
        this.pontos = pontos;
        this.golsPro = golsPro;
        this.golsContra = golsContra;
    }
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "pontos")
    private int pontos;
    
    @Column(name = "gols_pro")
    private int golsPro;
    
    @Column(name = "gols_contra")
    private int golsContra;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the pontos
     */
    public int getPontos() {
        return pontos;
    }

    /**
     * @param pontos the pontos to set
     */
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    /**
     * @return the golsPro
     */
    public int getGolsPro() {
        return golsPro;
    }

    /**
     * @param golsPro the golsPro to set
     */
    public void setGolsPro(int golsPro) {
        this.golsPro = golsPro;
    }

    /**
     * @return the golsContra
     */
    public int getGolsContra() {
        return golsContra;
    }

    /**
     * @param golsContra the golsContra to set
     */
    public void setGolsContra(int golsContra) {
        this.golsContra = golsContra;
    }

   
}
