/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

/**
 *
 * @author User
 */
public class TratarThreads implements Runnable{
    
    @Override
    public void run(){
        
        while(true){
            String threadsSof = VeririficarThreads();
            
            if(threadsSof != null){
                
                VeririficarThreads();
            }
        }
    }
    private String VeririficarThreads(){
        
        ProcurarThreads thr = new ProcurarThreads();
        Threads_Entities thrE = new Threads_Entities();        
        thr.run();
        thrE.run();
        return VeririficarThreads();
    }
}
