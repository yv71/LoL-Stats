/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lolstats;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 *
 * @author Beelzed
 */
public class Personnages {
    
    private ArrayList<Personnage> Personnages;
    
    public Personnages() {
        this.Personnages = new ArrayList<Personnage>();
        this.ajoutePerso();
    }
    
    public Personnage getPersonnage(String nom){
        Personnage d = null;
        for(Personnage p : this.Personnages){
            if (p.getNom() == nom){
                d = p;
            }
        }
        return d;
    }
    
    public void ajoutePerso(){
        Personnages.add(new Personnage("Aatrox"));
        Personnages.add(new Personnage("Ahri"));
        Personnages.add(new Personnage("Akali"));
        Personnages.add(new Personnage("Alistar"));
        Personnages.add(new Personnage("Amumu"));
        Personnages.add(new Personnage("Anivia"));
        Personnages.add(new Personnage("Annie"));
        Personnages.add(new Personnage("Ashe"));
        Personnages.add(new Personnage("Aurelion Sol"));
        Personnages.add(new Personnage("Azir"));
        Personnages.add(new Personnage("Bard"));
        Personnages.add(new Personnage("Blitzcrank"));
        Personnages.add(new Personnage("Brand"));
        Personnages.add(new Personnage("Braum"));
        Personnages.add(new Personnage("Caitlyn"));
        Personnages.add(new Personnage("Camille"));
        Personnages.add(new Personnage("Cassiopeia"));
        Personnages.add(new Personnage("Cho'Gath"));
        Personnages.add(new Personnage("Corki"));
        Personnages.add(new Personnage("Darius"));
        Personnages.add(new Personnage("Diana"));
        Personnages.add(new Personnage("Dr. Mundo"));
        Personnages.add(new Personnage("Draven"));
        Personnages.add(new Personnage("Ekko"));
        Personnages.add(new Personnage("Elise"));
        Personnages.add(new Personnage("Evelynn"));
        Personnages.add(new Personnage("Ezreal"));
        Personnages.add(new Personnage("Fiddlesticks"));
        Personnages.add(new Personnage("Fiora"));
        Personnages.add(new Personnage("Fizz"));
        Personnages.add(new Personnage("Galio"));
        Personnages.add(new Personnage("Gangplank"));
        Personnages.add(new Personnage("Garen"));
        Personnages.add(new Personnage("Gnar"));
        Personnages.add(new Personnage("Gragas"));
        Personnages.add(new Personnage("Graves"));
        Personnages.add(new Personnage("Hecarim"));
        Personnages.add(new Personnage("Heimerdinger"));
        Personnages.add(new Personnage("Illaoi"));
        Personnages.add(new Personnage("Irelia"));
        Personnages.add(new Personnage("Ivern"));
        Personnages.add(new Personnage("Janna"));
        Personnages.add(new Personnage("Jarvan IV"));
        Personnages.add(new Personnage("Jax"));
        Personnages.add(new Personnage("Jayce"));
        Personnages.add(new Personnage("Jhin"));
        Personnages.add(new Personnage("Jinx"));
        Personnages.add(new Personnage("Kai'Sa"));
        Personnages.add(new Personnage("Kalista"));
        Personnages.add(new Personnage("Karma"));
        Personnages.add(new Personnage("Karthus"));
        Personnages.add(new Personnage("Kassadin"));
        Personnages.add(new Personnage("Katarina"));
        Personnages.add(new Personnage("Kayle"));
        Personnages.add(new Personnage("Kayn"));
        Personnages.add(new Personnage("Kennen"));
        Personnages.add(new Personnage("Kha'Zix"));
        Personnages.add(new Personnage("Kindred"));
        Personnages.add(new Personnage("Kled"));
        Personnages.add(new Personnage("Kog'Maw"));
        Personnages.add(new Personnage("LeBlanc"));
        Personnages.add(new Personnage("Lee Sin"));
        Personnages.add(new Personnage("Leona"));
        Personnages.add(new Personnage("Lissandra"));
        Personnages.add(new Personnage("Lulu"));
        Personnages.add(new Personnage("Lux"));
        Personnages.add(new Personnage("Malphite"));
        Personnages.add(new Personnage("Malzahar"));
        Personnages.add(new Personnage("Maokai"));
        Personnages.add(new Personnage("Master Yi"));
        Personnages.add(new Personnage("Miss Fortune"));
        Personnages.add(new Personnage("Mordekaiser"));
        Personnages.add(new Personnage("Morgana"));
        Personnages.add(new Personnage("Nami"));
        Personnages.add(new Personnage("Nasus"));
        Personnages.add(new Personnage("Nautilus"));
        Personnages.add(new Personnage("Nidalee"));
        Personnages.add(new Personnage("Nocturne"));
        Personnages.add(new Personnage("Nunu"));
        Personnages.add(new Personnage("Olaf"));
        Personnages.add(new Personnage("Orianna"));
        Personnages.add(new Personnage("Ornn"));
        Personnages.add(new Personnage("Pantheon"));
        Personnages.add(new Personnage("Poppy"));
        Personnages.add(new Personnage("Pyke"));
        Personnages.add(new Personnage("Quinn"));
        Personnages.add(new Personnage("Rakan"));
        Personnages.add(new Personnage("Rammus"));
        Personnages.add(new Personnage("Rek'Sai"));
        Personnages.add(new Personnage("Renekton"));
        Personnages.add(new Personnage("Rengar"));
        Personnages.add(new Personnage("Riven"));
        Personnages.add(new Personnage("Rumble"));
        Personnages.add(new Personnage("Ryze"));
        Personnages.add(new Personnage("Sejuani"));
        Personnages.add(new Personnage("Shaco"));
        Personnages.add(new Personnage("Shen"));
        Personnages.add(new Personnage("Shyvana"));
        Personnages.add(new Personnage("Singed"));
        Personnages.add(new Personnage("Sion"));
        Personnages.add(new Personnage("Sivir"));
        Personnages.add(new Personnage("Skarner"));
        Personnages.add(new Personnage("Sona"));
        Personnages.add(new Personnage("Soraka"));
        Personnages.add(new Personnage("Swain"));
        Personnages.add(new Personnage("Syndra"));
        Personnages.add(new Personnage("Tahm Kench"));
        Personnages.add(new Personnage("Taliyah"));
        Personnages.add(new Personnage("Talon"));
        Personnages.add(new Personnage("Taric"));
        Personnages.add(new Personnage("Teemo"));
        Personnages.add(new Personnage("Thresh"));
        Personnages.add(new Personnage("Tristana"));
        Personnages.add(new Personnage("Trundle"));
        Personnages.add(new Personnage("Tryndamere"));
        Personnages.add(new Personnage("Twisted Fate"));
        Personnages.add(new Personnage("Twitch"));
        Personnages.add(new Personnage("Udyr"));
        Personnages.add(new Personnage("Urgot"));
        Personnages.add(new Personnage("Varus"));
        Personnages.add(new Personnage("Vayne"));
        Personnages.add(new Personnage("Veigar"));
        Personnages.add(new Personnage("Vel'Koz"));
        Personnages.add(new Personnage("Vi"));
        Personnages.add(new Personnage("Viktor"));
        Personnages.add(new Personnage("Vladimir"));
        Personnages.add(new Personnage("Volibear"));
        Personnages.add(new Personnage("Warwick"));
        Personnages.add(new Personnage("Wukong"));
        Personnages.add(new Personnage("Xayah"));
        Personnages.add(new Personnage("Xerath"));
        Personnages.add(new Personnage("Xin Zhao"));
        Personnages.add(new Personnage("Yasuo"));
        Personnages.add(new Personnage("Yorick"));
        Personnages.add(new Personnage("Zac"));
        Personnages.add(new Personnage("Zed"));
        Personnages.add(new Personnage("Ziggs"));
        Personnages.add(new Personnage("Zilean"));
        Personnages.add(new Personnage("Zoe"));
        Personnages.add(new Personnage("Zyra"));
        
    }

    public ArrayList<Personnage> getPersonnages() {
        return Personnages;
    }
    
    
}
