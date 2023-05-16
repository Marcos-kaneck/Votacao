/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threads;

import controler.Controler;
import java.awt.event.ActionEvent;
import org.openqa.selenium.WebElement;

/**
 *
 * @author User
 */
public class Threads_Entities implements Runnable {  
   
    public Threads_Entities(WebElement web){
        
    }
    @Override
    public void run() {
        while (true) {
            
            int[] valores = new int[checkMenssage()];
            for(int i = 0 ; i < valores.length;i++) {
                checkMenssage();
            }
        }
    }

    private int checkMenssage() {
        
        Controler cont = new Controler();
        ActionEvent e = null;
        
        cont.actionPerformed(e);
        return checkMenssage();

    }
}
