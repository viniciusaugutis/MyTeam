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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Aluno
 */

@Entity @Table(name="sumula")
public class Sumula implements Serializable {
    
    public Sumula(){
        
    }
     
    public Sumula(Arbitro arbitro, Time time1, Time time2, int golTime1, int golTime2) {
        this.arbitro = arbitro;
        this.time1 = time1;
        this.time2 = time2;
        this.golTime1 = golTime1;
        this.golTime2 = golTime2;
    }
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int codigo;
    
    @ManyToOne
    @JoinColumn(name = "arbitro_id")
    private Arbitro arbitro;
    
    @ManyToOne
    @JoinColumn(name = "time1_id")
    private Time time1;
    
    @ManyToOne
    @JoinColumn(name = "time2_id")
    private Time time2;
    
    @Column(name = "golTime1")
    private int golTime1;
    
    @Column(name = "golTime2")
    private int golTime2;

   
}
