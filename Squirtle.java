
package pokemongame;

public final class Squirtle extends Pokeman {
    float step;
  
  public Squirtle(String name, float weight, float stepLength)
  {
    super(name, weight, stepLength, 2.0F, new String[] { "Water,Squirtle" },new String[] {"Squirtle"});
  }
  
  public void walk()
  {
    this.step += 3.0F;
  }
}