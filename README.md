# How to play
In the main click play, and you will be asked to enter a letter

If you guess correctly the hangman you will see a letter appear in the dashed word

If you enter incorrect or the same letters you've entered before the lives 
you have will decimate and a hangman will begin to form

If you enter something that is not a letter you will be asked again to enter a 
letter

Keep entering a letter and depending on your choices you will win or lose

# How it works
Firstly there will be uninstantiated variables for the **initialWord**, 
**hashedWord** and **letter**

The **initialWord** will use the static method _selectARandomWord()_ to select 
a random word from a sentence

The **hashedWord** will use the static method _convertWordToHash(String word)_ 
which will take in the parameter _initialWord_. The _convertWordToHash(String word)_
method will turn any lowercase letters to a dashes

There will also be a instantiated variable called **lives** (This is not final
in case someone wanted to change the amount of lives in the future) Which will
store the amount of lives thus amount of incorrect guesses a user will be able
to make

The user will then be given an initial message using the 
_user.initialMessage(hashedWord)_ method

Then there will be a doWhile loop so that whilst lives > 0 (no one has lost) and 
the initialWord is not entirely upperCased (no one has won) the same code blook 
will be repeated

The user will be asked to enter a letter. If the user enters a word or senetence 
only the first character will be stored as the letter
___
There will first be an if statement to check if the letter is actually a letter
(There is no else if a letter isnt entered as the first character then the
_askToEnterALetter()_) method will be repeated until a letter is entered)
___
There will be a _validInput(initialWord,letter)_ method that will check if 
the input is valid or not. A valid input will be a letter which is in the word 
and isn't already in the **lettersGuessed** ArrayList. If the letter is a 
validInput then
-> The letter will be added to the **lettersGuessed** ArrayList
-> The initial word will be changed so that the correctly guessed letter in the
initialWord is capitalised
-> The hashed word will update so that all the letters apart from the capitalised
word will be hashed
-> You will get a output message containing the changed hashedWord, the lettersGuessed 
ArrayList(which will contain the letter) and the lives(which will be unchanged)

Else if the ArrayList lettersGuessed contains the letter. Then you will be told
that 
-> "You have entered *letter* before". 
-> You will now lose a life
-> You will get a output message containing the unchanged hashedWord, the lettersGuessed
ArrayList(which will be unchanged) and the lives (which will be decimated by 1)
-> You will see an image of a hangman (from a hangman array the index of lives 
corresponds to the hangman used)

Else the letter is not inside
-> The letter will be added to the **lettersGuessed** ArrayList
-> You will now lose a life
-> You will get a output message containing the unchanged hashedWord, the lettersGuessed
ArrayList(which will be changed) and the lives (which will be decimated by 1)
-> You will see an image of a hangman (from a hangman array the index of lives
corresponds to the hangman used)

These steps will keep repeating until all the letters in initial word are 
capitalised or the number of lives falls to zero. 
If all the letters in initialWord are capitalised the results 
_winningMessage(initialWord)_ method will print a winning message
Else the results _losingMessage(initialWord.toUpperCase()_ will print a 
losing message
