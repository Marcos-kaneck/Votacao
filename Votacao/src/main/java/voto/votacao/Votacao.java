
package voto.votacao;

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
        view.setVisi(true);
    }
}
