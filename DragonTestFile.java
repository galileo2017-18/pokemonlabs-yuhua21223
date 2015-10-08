public class DragonTestFile
{
    public static void main(String[] args)
    {
        DragonPokemon bagon = new DragonPokemon("Bagon", "none", 400);
        DragonPokemon dratini = new DragonPokemon("Dratini", "none", 500, "Dragon");
        DragonPokemon latios = new DragonPokemon("Latios", "none", 600, "Dragon", "Flying");
        Pokemon ashs_pikachu = new Pokemon("Pikachu", "Ash", 300);
        bagon.printTypes();
        dratini.printTypes();
        latios.printTypes();

        ashs_pikachu.attack(latios);
        System.out.println(latios.getHitPts());
        latios.attack(ashs_pikachu);
        System.out.println(ashs_pikachu.getHitPts());
        latios.dragonRage(dratini);
    }
}