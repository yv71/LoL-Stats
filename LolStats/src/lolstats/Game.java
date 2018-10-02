/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lolstats;

/**
 *
 * @author yv066840
 */
public class Game {
    
    private String pseudoJoueur;
    private String persoJoueur;
    private String persoAdv;
    private Score scoreJ;
    private Score scoreAdv;
    private boolean gagnee;

    public Game(String pseudoJoueur, String persoJoueur, String persoAdv, Score scoreJ, Score scoreAdv,boolean gagnee) {
        this.pseudoJoueur = pseudoJoueur;
        this.persoJoueur = persoJoueur;
        this.persoAdv = persoAdv;
        this.scoreJ = scoreJ;
        this.scoreAdv = scoreAdv;
        this.gagnee = gagnee;
    }
    
    public String toString(){
        String gg;
        if (gagnee){
            gg = "gagnee";
        }
        else {
            gg = "perdue";
        }
        return "Game " + gg + " de " + pseudoJoueur + " avec " + persoJoueur + " en " + scoreJ + " contre " + persoAdv + " en " + scoreAdv;
    }

    public String getPseudoJoueur() {
        return pseudoJoueur;
    }

    public String getPersoJoueur() {
        return persoJoueur;
    }

    public String getPersoAdv() {
        return persoAdv;
    }

    public Score getScoreJ() {
        return scoreJ;
    }

    public Score getScoreAdv() {
        return scoreAdv;
    }

    public boolean isGagnee() {
        return gagnee;
    }
    
    
    
    
}
