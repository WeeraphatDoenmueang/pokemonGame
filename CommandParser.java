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
      System.out.println("What do you want to do?(catch/remove/list/move/feed/quit/evo)");
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
      case "evo":
        evolutionPokemon();
      }
    }
  }
  
  private void addPokemon(String pokemonType)
  {
    this.scan.nextLine();
    System.out.print("Name:");
    String name = this.scan.nextLine();
    float weight = (float)Math.random() * 100.0F;
    float stepLength = (float)Math.random() * 5.0F;
    if (pokemonType.equals("Lapras"))
    {
      Lapras lapras = new Lapras(name, weight, stepLength);
      this.pokeFarm.addPokemon(lapras);
    }
    if (pokemonType.equals("Eevee"))
    {
      Eevee eevee = new Eevee(name, weight, stepLength);
      this.pokeFarm.addPokemon(eevee);
    }
    if (pokemonType.equals("Squirtle"))
    {
      Squirtle squirtle = new Squirtle(name, weight, stepLength);
      this.pokeFarm.addPokemon(squirtle);
    }
  }
  private void evolutionAddPokemon(String pokemonType)
  {
    System.out.print("Name:");
    String name = this.scan.nextLine();
    float weight = (float)Math.random() * 100.0F;
    float stepLength = (float)Math.random() * 5.0F;
    if(pokemonType.equals("Wartortle"))
    {
      Wartortle wartortle = new Wartortle(name, weight*2F, stepLength*2F);
      this.pokeFarm.addPokemon(wartortle);
    }
    if(pokemonType.equals("Blastoise"))
    {
      Blastoise blastoise = new Blastoise(name, weight*3F, stepLength*3F);
      this.pokeFarm.addPokemon(blastoise);
    }
    if (pokemonType.equals("Vaporeon"))
    {
      Vaporeon vaporeon = new Vaporeon(name, weight, stepLength);
      this.pokeFarm.addPokemon(vaporeon);
    }
  }
  private void evolutionPokemon(){
    this.scan.nextLine();
    System.out.print("Pokemon you want to evolution slot:");
    int index = this.scan.nextInt();
    this.scan.nextLine();
    System.out.print("What is this pokemon(Eevee/Squirtle/Wartortle):");
    String pokemonType = this.scan.nextLine();
    if(pokemonType.equals("Eevee")){
        evolutionAddPokemon("Vaporeon"); 
        removeEvoPokemon(index);
    }
    if(pokemonType.equals("Squirtle")){
        evolutionAddPokemon("Wartortle"); 
        removeEvoPokemon(index);
    }
    if(pokemonType.equals("Wartortle")){
        evolutionAddPokemon("Blastoise");
        removeEvoPokemon(index);
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
  private void removeEvoPokemon(int index)
  {
    this.pokeFarm.removePokemon(index);
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
    this.scan.nextLine();   
    System.out.print("Pokemon(Lapras/Eevee/Squirtle):");
    String pokemonType = this.scan.nextLine();
    System.out.println("Choose Ball(pokeball/greatball/ultraball)");
    String ball = this.scan.next();
    if (ball.equals("pokeball")){
        float mood = (float)Math.random();
        float catchRate = mood*0.8F;
        if((catchRate)>0.5){
            System.out.println("Success("+catchRate+")");
            addPokemon(pokemonType);
        }
        else{
            System.out.println("Fail("+catchRate+")");
        }
    }
    if (ball.equals("greatball")){
        float mood = (float)Math.random();
        float catchRate = mood*0.9F;
        if((catchRate)>0.5){
            System.out.println("Success("+catchRate+")");
            addPokemon(pokemonType);
        }
        else{
            System.out.println("Fail("+catchRate+")");
        }
    }
    if (ball.equals("ultraball")){
         float mood = (float)Math.random();
         float catchRate = mood*1.0F;
        if((catchRate)>0.5){
            System.out.println("Success("+catchRate+")");
            addPokemon(pokemonType);
        }
        else{
            System.out.println("Fail("+catchRate+")");
        }
        }
    }}
