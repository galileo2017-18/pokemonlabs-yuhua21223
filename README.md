# PokemonLabs

<h2>Trainer.java</h2>
Now that we have created Pokemon objects, we need to create some Pokemon Trainers. Use the template for the Trainer class and implement the variables and methods specified in the comments.

Feel free to modify the test file to thoroughly test all your methods.

<h2>DragonPokemon.java</h2>
You will write a DragonPokemon class that is a subclass of the Pokemon superclass. Here are the things you should include in the DragonPokemon class:

<ul>
  <li>It should be a subclass of the Pokemon superclass.
  <li>It should have instance variables for storing Pokemon types (note that Pokemon can have up to two types).
  <li>It should have multiple constructors depending on if a type is given when the object is instantiated.
  <li>It should have a method that prints out the Pokemon's types
  <li>Dragon-type Pokemon are powerful so you need to override their attack method to deal 200 damage instead of 50.
  <li>All Dragon-type Pokemon can use an attack called Dragon Rage. Write a new method called dragonRage that allows them to use the superclass's attack method to deal damage eight times (for a total of 400 damage) using Dragon Rage, but does not override/overload the attack method. The hit points of the other Pokemon should be printed out each time it does 50 damage. Use a for loop in this method.
  <li>All variables and methods in this subclass should be set to either public or private.
</ul>
