
package pokemongame;

public final class Wartortle extends Pokeman {
    float step;
  
  public Wartortle(String name, float weight, float stepLength)
  {
    super(name, weight, stepLength, 2.0F, new String[] { "Water,Wartortle" },new String[] {"Wartortle"});
  }
  
  public void walk()
  {
    this.step += 3.0F;
  }
}