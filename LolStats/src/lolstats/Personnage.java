/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lolstats;

import javax.swing.ImageIcon;

/**
 *
 * @author Beelzed
 */
public class Personnage {
    private String nom;
    private ImageIcon SquareIcon ;

    public Personnage(String nom) {
        this.nom = nom;
        String[] parts = nom.split(" ");
        if (parts.length==1){
            this.SquareIcon = new ImageIcon(Personnage.class.getResource("SquaresIcons/File_"+ this.nom + "Square.png"));
        }
        else {
            this.SquareIcon = new ImageIcon(Personnage.class.getResource("SquaresIcons/File_"+ parts[0]+"_"+parts[1]+ "Square.png"));
        }
        
    }

    public String getNom() {
        return nom;
    }

    public ImageIcon getSquareIcon() {
        return SquareIcon;
    }
    
    public String toString(){
        return this.getNom();
    }
    
}
