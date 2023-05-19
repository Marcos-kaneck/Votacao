/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.votacao;

import controler.Controler;
import model.Modelo_VIEW;
import view.View;
/**
 *
 * @author User
 */
public class Votacao {

    public static void main(String[] args) {

        Modelo_VIEW mod = new Modelo_VIEW();
        View view = new View();
        
        Controler cont = new Controler(mod, view);
        cont.Iniciar();
        view.setVisible(true);
    }
}
