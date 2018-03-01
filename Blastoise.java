
package pokemongame;

public final class Blastoise extends Pokeman {
    float step;
  
  public Blastoise(String name, float weight, float stepLength)
  {
    super(name, weight, stepLength, 2.0F, new String[] { "Water,Blastoise" },new String[] {"Blastoise"});
  }
  
  public void walk()
  {
    this.step += 3.0F;
  }
}