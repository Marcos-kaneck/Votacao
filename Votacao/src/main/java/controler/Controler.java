/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import entities.ElementosWeb;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Modelo_VIEW;
import org.openqa.selenium.WebElement;
import threads.Threads_Entities;
import view.View;

/**
 *
 * @author User
 */
public class Controler implements ActionListener{
    
    
    private Modelo_VIEW modeloView;
    private View view;
    
    public Controler(){
        
    }
    public Controler(Modelo_VIEW modeloView, View view){
        
        this.modeloView = modeloView;
        this.view = view;
        
        view.iniciarBotCem.addActionListener(this);
    }
    public void Iniciar(){
        
        view.setTitle("Segue no insta dev_marcola");
        view.setLocation(null);
    }
    public void actionPerformed(ActionEvent e){
        
        for (int i = 0; i < modeloView.cemVezes(); i++) {
            ElementosWeb web = new ElementosWeb();
            Thread thread1 = new Thread(new Threads_Entities((WebElement) web));
            thread1.start();
        }
        
    }
}
