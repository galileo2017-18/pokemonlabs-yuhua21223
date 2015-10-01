public class Trainer
{
  //create a class variable for the number of Trainers

  //create several instance variables for storing the following:
  //the number of Pokemon caught
  //the trainer's name
  //the amount of money the trainer has
  //the number of gym badges the trainer has
  
  //create an instance variable for storing the Pokemon the trainer has on hand (you'll want to use an array for this); keep in mind a trainer can have a max of 6 Pokemon on hand
  
  public Trainer(String name)
  {
    //this is a constructor
    //this method sets the trainer name and updates the number of trainers
  }
  
  void addPokemon(Pokemon p)
  {
    //if the trainer has less than the max number of Pokemon on hand, add the Pokemon to the variable that keeps track of the Pokemon he or she has and change the owner of the Pokemon to the trainer's name
    //if the trainer has the max number of Pokemon, print a message saying you cannot add the Pokemon to the trainer
  }
  
  Pokemon getPokemon(int n)
  {
    //method for returning the trainer's Pokemon at index n of the Pokemon array
  }
  
  //write methods for returning each of the instance variables (one method per instance variable)
  
  //write a method for changing the trainer's name
  
  //write methods for adding money and losing money
  
  //write a method for earning a new badge
  
  //challenge: write a method for having trainers trade Pokemon
  
}