/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */

@Entity @Table(name="cidade")
public class Cidade {
    
    public Cidade(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int codigo;
    
    @Column(name = "nome", length = 500)
    private String nome;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "cidade", targetEntity = Arbitro.class)
    private List<Arbitro> arbitros;

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
}
