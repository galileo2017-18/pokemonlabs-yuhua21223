public class DragonPokemon extends Pokemon
{
    private String type1;
    private String type2;
    
    public DragonPokemon(String name, String owner, int hp) {
        super(name, owner, hp);
    }
    
    public DragonPokemon(String name, String owner, int hp, String type1) {
        super(name, owner, hp);
        this.type1 = type1;
    }
    
    public DragonPokemon(String name, String owner, int hp, String type1, String type2) {
        super(name, owner, hp);
        this.type1 = type1;
        this.type2 = type2;
    }
    
    public void printTypes() {
        if (type1 != null && type2 != null){
            System.out.println(type1 +", "+ type2);
        }
        else if (type1 != null){
            System.out.println(type1);
        }
        else if (type2 != null) {
            System.out.println(type2);
        }
        else {
            System.out.println("No types specified");
        }
    }
    
    public void attack (Pokemon other) {
        other.decrease_hp(200);
    }
    
    public void dragonRage(Pokemon other) {
        for(int i = 0; i<8; i++) {
            super.attack(other);
        }
    }
}


