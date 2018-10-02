/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lolstats;

import java.util.ArrayList;

/**
 *
 * @author yv066840
 */
public class Games {
    private ArrayList<Game> games;

    public Games() {
        games = new ArrayList<Game>();        
    }

    public ArrayList<Game> getGames() {
        return games;
    }
    
    public void addGame(Game g){
        games.add(g);
    }
    
    public void removeGame(Game g){
        games.remove(g);
    }    
    
   
}
