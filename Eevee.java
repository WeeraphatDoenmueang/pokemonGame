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
public final class Eevee extends Pokeman {
    float step;
  
  public Eevee(String name, float weight, float stepLength)
  {
    super(name, weight, stepLength, 2.0F, new String[] { "Natural,Eevee" },new String[] {"Eevee"});
  }
  
  public void walk()
  {
    this.step += 2.0F;
  }
}
