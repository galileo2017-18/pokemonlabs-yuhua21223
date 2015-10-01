public class PokemonTestFile
{
    public static void main(String[] args)
    {
        Pokemon ashs_pikachu = new Pokemon("Pikachu", "Ash", 300);
        Pokemon mistys_togepi = new Pokemon("Togepi", "Misty", 245);
        System.out.println(mistys_togepi.getOwner());
        System.out.println(ashs_pikachu.getHitPts());
        ashs_pikachu.increase_hp(150);
        System.out.println(ashs_pikachu.getHitPts());
        System.out.println(Pokemon.totalPokemon);
        System.out.println(mistys_togepi.getHitPts());
        ashs_pikachu.attack(mistys_togepi);
        System.out.println(mistys_togepi.getHitPts());
    }
}