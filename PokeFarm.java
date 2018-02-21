/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;
import java.util.ArrayList;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Fook
 */
public class PokeFarm {
    private ArrayList<Pokeman> pokemons;
  
  public PokeFarm()
  {
    this.pokemons = new ArrayList();
  }
  
  public void addPokemon(Pokeman pokemon)
  {
    this.pokemons.add(pokemon);
  }
  
  public void removePokemon(int index)
  {
    this.pokemons.remove(index);
  }
  
  public void list()
  {
    for (Pokeman pokemon : this.pokemons) {
      pokemon.print();
    }
  }
  
  public void feed(String pokeName)
  {
    if (pokeName.equals("all")) {
      for (Pokeman pokemon : this.pokemons) {
        pokemon.eat();
      }
    } else {
      for (Pokeman pokemon : this.pokemons) {
        if (pokemon.getName().equals(pokeName))
        {
          pokemon.eat();
          break;
        }
      }
    }
  }
  
  public void walk()
  {
    for (Pokeman pokemon : this.pokemons) {
      pokemon.walk();
    }
  }
}