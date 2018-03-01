/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame;
import java.io.PrintStream;
/**
 *
 * @author Fook
 */
public class Pokemon {
  private String name;
  private float weight;
  private float stepLength;
  private int step;
  private float gainingWeightStep;
  private String[] types;
  String[] pokemonType;
  
  public Pokemon(String name, float weight, float stepLength, float gainingWeightStep, String[] types,String[] pokemonType)
  {
    this.name = name;
    this.weight = weight;
    this.stepLength = stepLength;
    this.gainingWeightStep = gainingWeightStep;
    this.step = 0;
    if (types == null) {
      this.types = new String[] { "normal" };
    } else {
      this.types = types;
    }
  }
   public String[] viewType()
  {
    return this.pokemonType;
  }
  public void walk()
  {
    this.step += 1;
  }
  
  public void eat()
  {
    this.weight += this.gainingWeightStep;
  }
  
  public void print()
  {
    System.out.println("Pokemon name: " + this.name);
    System.out.print("        Type: ");
    for (String type : this.types)
    {
      System.out.print(type + ",");
      if (this.step > 5) {
        this.weight -= 0.2F*5;
      }
      System.out.println();
      System.out.println("      Weight: " + this.weight);
      System.out.println(" Step length: " + this.stepLength);
      System.out.println("  Today Step: " + this.step);
      System.out.println("------------------------------------------");
    }
  }
}
