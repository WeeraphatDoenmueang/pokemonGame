/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;

/**
 *
 * @author Fook
 */
public class PokemonGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    PokeFarm farm = new PokeFarm();
    CommandParser commandP = new CommandParser(farm);
    commandP.Run();// TODO code application logic here
    }
    
}
