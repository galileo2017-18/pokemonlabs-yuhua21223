public class Trainer
{
  //create a class variable for the number of Trainers
  static int totalTrainer = 0;

  //create several instance variables for storing the following:
  //the number of Pokemon caught
  int numPokemon;
  
  //the trainer's name
  String trainerName;
  
  //the amount of money the trainer has
  int money;
  
  //the number of gym badges the trainer has
  int numGymBadges;
  
  //create an instance variable for storing the Pokemon the trainer has on hand (you'll want to use an array for this); keep in mind a trainer can have a max of 6 Pokemon on hand
  Pokemon[] party = new Pokemon[6];
  
  
  public Trainer(String name)
  {
    //this is a constructor
    //this method sets the trainer name and updates the number of trainers
    this.trainerName = name;
    this.numPokemon = 0;
    this.money = 0;
    this.numGymBadges = 0;
    Trainer.totalTrainer += 1;
  }
  
  public Trainer(String name, int money) {
        this.name = name;
    this.numPokemon = 0;
    this.money = money;
    this.numGymBadges = 0;
    Trainer.totalTrainer += 1;
  }
  
  void addPokemon(Pokemon p)
  {
    //if the trainer has less than the max number of Pokemon on hand, add the Pokemon to the variable that keeps track of the Pokemon he or she has and change the owner of the Pokemon to the trainer's name
    //if the trainer has the max number of Pokemon, print a message saying you cannot add the Pokemon to the trainer
    if (this.numPokemon < 6) {
      this.party[this.numPokemon] = p;
      this.numPokemon += 1;
      p.owner = this.trainerName;
    }
    else if (this.numPokemon >= 6) {
      System.out.println("You already have 6 Pokemon! Cannot add Pokemon to trainer.");
    }
  }
  
  Pokemon getPokemon(int n)
  {
    //method for returning the trainer's Pokemon at index n of the Pokemon array
    return party[n];
  }
  
  //write methods for returning each of the instance variables (one method per instance variable)
  int getNumPokemon() {
    return this.numPokemon;
  }
  
  
  //write a method for changing the trainer's name
  void changeName(String name) {
    this.trainerName = name;
  }
  
  //write methods for adding money and losing money
  
  //write a method for earning a new badge
  
  //challenge: write a method for having trainers trade Pokemon
  
}