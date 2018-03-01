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
public final class Vaporeon extends Pokeman {
    float step;
  
  public Vaporeon(String name, float weight, float stepLength)
  {
    super(name, weight, stepLength, 2.0F, new String[] { "Water,Vaporeon" },new String[] {"Vaporeon"});
  }
  
  public void walk()
  {
    this.step += 3.0F;
  }
}
