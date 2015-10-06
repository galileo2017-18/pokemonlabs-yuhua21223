public class PokemonTestFile
{
    public static void main(String[] args)
    {
        Pokemon ashs_pikachu = new Pokemon("Pikachu", "none", 300);
        Pokemon mistys_togepi = new Pokemon("Togepi", "none", 245);
        System.out.println(mistys_togepi.getOwner());
  
        Trainer ash = new Trainer("Ash");
        Trainer misty = new Trainer("Misty");
        System.out.println(Trainer.totalTrainer); // should be 2
  
        ash.addPokemon(ashs_pikachu);
        misty.addPokemon(mistys_togepi);

        System.out.println(ash.getNumPokemon()); // should be 1
        System.out.println(misty.getNumPokemon()); // should be 1

        System.out.println(ash.getPokemon(0).getName()); // should be Pikachu
        System.out.println(misty.getPokemon(0).getName()); // should be Togepi

        System.out.println(ashs_pikachu.getOwner()); // should be Ash
        System.out.println(mistys_togepi.getOwner()); // should be Misty

        ash.earnBadge();
        System.out.println(ash.getBadges()); // should be 1

        ash.addMoney(100);
        System.out.println(ash.getMoney()); // should be 100
  
        ash.loseMoney(50);
        System.out.println(ash.getMoney()); // should be 50
  
        ash.changeName("Pokemon Master");
        System.out.println(ash.getName()); // should be Pokemon Master
  
        System.out.println(ashs_pikachu.getHitPts());
        ashs_pikachu.increase_hp(150);
        System.out.println(ashs_pikachu.getHitPts());
  
        System.out.println(Pokemon.totalPokemon);
  
        System.out.println(mistys_togepi.getHitPts());
        ashs_pikachu.attack(mistys_togepi);
        System.out.println(mistys_togepi.getHitPts());
    }
}