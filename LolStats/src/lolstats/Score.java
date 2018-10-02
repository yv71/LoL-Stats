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
public class Score {
    private int Kills;
    private int Deaths;
    private int Assists;

    public Score(int Kills, int Deaths, int Assist) {
        this.Kills = Kills;
        this.Deaths = Deaths;
        this.Assists = Assist;
    }
    
    public String toString(){
        return Kills+"/"+Deaths+"/"+Assists;
    }
    
    
}
