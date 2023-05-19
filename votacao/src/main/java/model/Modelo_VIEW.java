/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mycompany.votacao.Votacao;
import entities.ElementosWeb;
import java.time.Duration;
import threads.TratarThreads;



/**
 *
 * @author User
 */
public class Modelo_VIEW {
    
    
    private int quantiaVotos;

    public int getQuantiaVotos() {
        return quantiaVotos;
    }

    
    public void setQuantiaVotos(int quantiaVotos) {
        this.quantiaVotos = quantiaVotos;
    }
    public void iniciarMod(){
        
        Votacao vot = new Votacao();
        String[] args = null;        
        vot.main(args);
        
    }
    public int valoresVotos(){
        return quantiaVotos;
    }
    
    public void thredsModelo() throws InterruptedException{
        ElementosWeb web = new ElementosWeb();
        
        for (int i = 0; i < this.quantiaVotos; i++) {
            web.votacaoPagina();
            Thread thread1 = new Thread(new TratarThreads());
            thread1.start();
            Thread.sleep(Duration.ofMinutes(1));
        }
    }
}
