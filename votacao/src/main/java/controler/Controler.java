/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controler;

import entities.ElementosWeb;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Modelo_VIEW;

import view.View;

/**
 *
 * @author User
 */
public class Controler implements ActionListener {

    private Modelo_VIEW modeloView;
    private View view;

    public Controler() {

    }

    public Controler(Modelo_VIEW modeloView, View view) {

        this.modeloView = modeloView;
        this.view = view;

        view.iniciarProjeto.addActionListener(this);
    }

    public void Iniciar() {

        view.setTitle("Segue no insta dev_marcola");
        
    }

    public void actionPerformed(ActionEvent e) {
        
        try {
        modeloView.setQuantiaVotos(Integer.parseInt(view.quantiaVotos.getText()));
        
            modeloView.thredsModelo();
        } catch (InterruptedException ex) {
            Logger.getLogger(Controler.class.getName()).log(Level.SEVERE,"Moio o pe do macaco", ex);
        }catch(ThreadDeath td){
            System.out.println("Thread Morreu!");
        }
    }
}
