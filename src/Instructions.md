<!-- _class: lead -->

# Java Project - Hangman

---

## Brief

Develop a simple hangmanUtils game using Java![Instructions.md](Instructions.md)

We want you to focus on demonstrating your understanding of the four pillars **OOP** in this project.

Break it down into a number of classes each with their **own role**.

We want you to get the classes to **interact** with each other!

Some examples of classes you could have:

- A class responsible for storing your words with a method to randomly select a word.
- A class responsible for displaying the results of the guess.
- A class responsible for interacting with the player e.g. capture input, print messages.
- A class responsible for connecting these classes together and running the game.

  <br/>

**Good Luck!**

---

## Hangman rules

We want your program to have this core functionality:

- The program randomly selects a word.
- The program displays the word using the underscore character "\_".
    - With the word "ELEPHANT" the game would display "\_ \_ \_ \_ \_ \_ \_ \_".
    - A underscore for each letter separated with a space.
- The player is prompted to enter a letter as a guess. The program needs to capture their guess.
    - If the letter is in the word the program should recognize this.
    - If the letter is not in the word the player loses a life.
    - The program should store the guesses.
- After a guess the program should print out the following:
    - The word with blanks / correct guesses re-displayed e.g E _ E _ \_ \_ \_ \_
    - The letters guessed so far e.g Letters guessed: E G
    - The amount of lives left e.g Lives: 8
- The game continues with the player guessing more letters until the player correctly guesses the word or they lose all their lives.

---

## Extension

Traditionally hangmanUtils is played with a pencil and paper, with a hangmanUtils figure drawn to indicate how many lives have been lost.
The base is drawn for wrong answer, the upright post for another, the beam for another and so on.

When the hangmanUtils is complete the player has lost. It’s possible to draw a hangmanUtils using ASCII characters - see below.

<br/>
<div  style="display: flex; justify-content: space-around;">

```
AFTER 1 INCORRECT GUESSES







_______
```

```
AFTER 2 INCORRECT GUESSES

   |
   |
   |
   |
   |
   |
___|___
```

```
END OF GAME NO GUESSES LEFT
   _______
   |/     |
   |     (_)
   |     \|/
   |      |
   |     / \
   |
___|___
```

</div>

<br/>

Instead of just displaying the number of lives left have a go at displaying the hangmanUtils gradually getting drawn.

This doesn’t have to be complex, don’t try to be too clever here!

---

## Notes

Here are some general points to consider:

- Letter casing? Is "a" the same as "A"?
- What happens if the player guesses a letter they have already guessed?
- What happens if the player guesses a word instead of a letter?
- What happens if the player guesses a number instead of a letter?
- How many times can you play the game?
- Number of lives is up to you depending on the level you want to play at 😉

---