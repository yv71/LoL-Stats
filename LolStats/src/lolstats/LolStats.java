/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lolstats;

import javax.swing.JLabel;

/**
 *
 * @author Beelzed
 */
public class LolStats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnages perso = new Personnages();
        Personnage t = new Personnage("Renekton");
        for(Personnage p : perso.getPersonnages()){
            System.out.println(p);
            t = p;
        }
        
        AffichageOne test = new AffichageOne();
        JLabel label = test.getImage();
        JLabel d = new JLabel(t.getSquareIcon());
        label = d;
        test.setVisible(true);
    }
    
}
