/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import model.Modelo_VIEW;

/**
 *
 * @author User
 */
public class ProcurarThreads implements Runnable {
    
    public ProcurarThreads(){
        
    }
    
    public void run(){
        
        while(true){
            
            int verificar = verificarQuantiaVotos();            
            if(verificar !=0){
                verificarQuantiaVotos();
            }
        }
    }
    
    private int verificarQuantiaVotos(){
        
        Modelo_VIEW vw = new Modelo_VIEW();
                
        return vw.valoresVotos();
    }
}
