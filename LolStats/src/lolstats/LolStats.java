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
        test hello = new test (perso);
        hello.setVisible(true);
    }
    
}
