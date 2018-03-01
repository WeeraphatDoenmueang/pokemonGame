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
public class Pokeman {
  private String name;
  private float weight;
  private float stepLength;
  private int step;
  private float gainingWeightStep;
  private String[] types;
  String[] pokemonType;
  
  public Pokeman(String name, float weight, float stepLength, float gainingWeightStep, String[] types, String[] pokemonType)
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
  
  public void walk()
  {
    this.step += 1;
  }
  
  public String getName()
  {
    return this.name;
  }
  
  public void eat()
  {
    this.weight -= this.gainingWeightStep;
  }
  public String[] viewType()
  {
    return this.pokemonType;
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
      System.out.printf("       Weight: %.2f\n", new Object[] { Float.valueOf(this.weight) });
      System.out.printf("  Step length: %.2f\n", new Object[] { Float.valueOf(this.stepLength) });
      System.out.printf("   Today Step: %.2f\n", new Object[] { Float.valueOf(this.step) });
      System.out.println("------------------------------------------");
    }
  }
}
