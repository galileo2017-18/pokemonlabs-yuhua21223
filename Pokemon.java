public class Pokemon
{
    static int totalPokemon = 0;
    String name;
    String owner;
    int hp;
  
    public Pokemon(String name, String owner, int hit_pts)
    {
        this.name = name;
        this.owner = owner;
        this.hp = hit_pts;
        Pokemon.totalPokemon += 1;
    }
  
    public void increase_hp(int amount)
    {
        this.hp += amount;
    }
  
    public void decrease_hp(int amount)
    {
        this.hp -= amount;
        if (this.hp < 0)
        {
             this.hp = 0;
        }
    }
  
    public String getName()
    {
        return this.name;
    }
  
    public String getOwner()
    {
        return this.owner;
    }
  
    public int getHitPts()
    {
        return this.hp;
    }
  
    public void attack(Pokemon other)
    {
        System.out.println(this.getName() + "!");
        other.decrease_hp(50);
    }
}