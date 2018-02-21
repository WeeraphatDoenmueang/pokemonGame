/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;
import java.io.PrintStream;
import java.util.Scanner;
/**
 *
 * @author Fook
 */
public class CommandParser {
  private PokeFarm pokeFarm;
  private Scanner scan;
  private boolean isControl;
  
  public CommandParser(PokeFarm pokeFarm)
  {
    this.pokeFarm = pokeFarm;
    this.scan = new Scanner(System.in);
    this.isControl = false;
  }
  
  public void Run()
  {
    this.isControl = true;
    
    System.out.println("Welcome to PokeFarm");
    while (this.isControl)
    {
      System.out.println("What do you want to do?");
      String type = this.scan.next();
      switch (type)
      {
      case "quit": 
        this.isControl = false;
        System.out.println("            Thank you           ");
        break;
      case "catch":
        catchPokemon();
        break;
      case "remove": 
        removePokemon();
        break;
      case "list": 
        listPokemons();
        break;
      case "move": 
        walkPokemons();
        break;
      case "feed": 
        feedPokemons();
      }
    }
  }
  
  private void addPokemon()
  {
    this.scan.nextLine();
    
    System.out.print("Pokemon:");
    String pokemonType = this.scan.nextLine();
    System.out.print("Name:");
    String name = this.scan.nextLine();
    
    float weight = (float)Math.random() * 100.0F;
    float stepLength = (float)Math.random() * 5.0F;
    if (pokemonType.equals("Vaporeon"))
    {
      Vaporeon vaporeon = new Vaporeon(name, weight, stepLength);
      this.pokeFarm.addPokemon(vaporeon);
    }
    if (pokemonType.equals("Lapras"))
    {
      Lapras lapras = new Lapras(name, weight, stepLength);
      this.pokeFarm.addPokemon(lapras);
    }
  }
  
  private void listPokemons()
  {
    System.out.println("==========================================");
    System.out.println("Pokemon List");
    System.out.println("==========================================");
    this.pokeFarm.list();
    System.out.println("==========================================");
  }
  
  private void removePokemon()
  {
    System.out.print("index to remove : ");
    int index = this.scan.nextInt();
    this.pokeFarm.removePokemon(index);
  }
  
  private void feedPokemons()
  {
    System.out.print("Which pokemon do you want to feed? ");
    String name = this.scan.next();
    if (name.equals("all")) {
      this.pokeFarm.feed("all");
    }
  }
  
  private void walkPokemons()
  {
    System.out.println("Walk");
    this.pokeFarm.walk();
  }
  private void catchPokemon()
  {
    System.out.println("Choose Ball");
    String ball = this.scan.next();
    if (ball.equals("pokeball")){
        float rate = (float)Math.random();
        float catchRate = rate+0.8F;
        if((catchRate)>1){
            System.out.println("Success("+catchRate+")");
            addPokemon();
        }
        else{
            System.out.println("Fail("+catchRate+")");
        }
    }
    if (ball.equals("greatball")){
        float rate = (float)Math.random();
        float catchRate = rate+0.9F;
        if((catchRate)>1){
            System.out.println("Success("+catchRate+")");
            addPokemon();
        }
        else{
            System.out.println("Fail("+catchRate+")");
        }
    }
    if (ball.equals("ultraball")){
         float rate = (float)Math.random();
         float catchRate = rate+1.0F;
        if((catchRate)>1){
            System.out.println("Success("+catchRate+")");
            addPokemon();
        }
        else{
            System.out.println("Fail("+catchRate+")");
        }
        }
    }
}