public class Trainer
{
  //create a class variable for the number of Trainers
  static int totalTrainer = 0;
  //create several instance variables for storing the following:
  //the number of Pokemon caught
  int numOfPokemon = 0;
  //the trainer's name
  String name;
  //the amount of money the trainer has
  int money = 0;
  //the number of gym badges the trainer has
  int badges = 0;
  //create an instance variable for storing the Pokemon the trainer has on hand (you'll want to use an array for this); keep in mind a trainer can have a max of 6 Pokemon on hand
  Pokemon[] party = new Pokemon[6];
  
  public Trainer(String name)
  {
    //this is a constructor
    //this method sets the trainer name and updates the number of trainers
    this.name = name;
    Trainer.totalTrainer += 1;
  }
  
  void addPokemon(Pokemon p)
  {
    //if the trainer has less than the max number of Pokemon on hand, add the Pokemon to the variable that keeps track of the Pokemon he or she has and change the owner of the Pokemon to the trainer's name
    if (numOfPokemon < 6) {
        party[numOfPokemon] = p;
        p.owner = this.name;
        numOfPokemon += 1;
    }
    //if the trainer has the max number of Pokemon, print a message saying you cannot add the Pokemon to the trainer
    else {
        System.out.println("cannot add Pokemon to Trainer");
    }
  }
  
  Pokemon getPokemon(int n)
  {
    return party[n]; //method for returning the trainer's Pokemon at index n of the Pokemon array
  }
  
  //write methods for returning each of the instance variables (one method per instance variable)
  int getNumPokemon() {
      return this.numOfPokemon;
  }
  
  String getName() {
      return this.name;
  }
  
  int getMoney() {
      return this.money;
  }
  
  int getBadges() {
      return this.badges;
  }
  
  //write a method for changing the trainer's name
  void changeName(String newName) {
      this.name = newName;
  }  
  
  //write methods for adding money and losing money
  void addMoney(int amount) {
      this.money += amount;
  }
  
  void loseMoney(int amount) {
      this.money -= amount;
      if (this.money < 0) {
          this.money = 0;
      }
  }
  
  //write a method for earning a new badge
  void earnBadge() {
      this.badges += 1;
  }
  
  //challenge: write a method for having trainers trade Pokemon
  void trade(Trainer other, int ourN, int theirN) {
      Pokemon temp = this.party[ourN];
      this.party[ourN] = other.party[theirN];
      other.party[theirN] = temp;
      this.party[ourN].owner = this.name;
      other.party[theirN].owner = other.name;
  }
}

