<div align="center">

# Hangman Game


**A simple Hangman game implemented in Java.**


</div>

## Description

The **Hangman Game** is a classic word-guessing game where players try to guess a secret word by suggesting letters within a certain number of attempts. This implementation allows players to input their own secret word and provides an interactive command-line interface.

## Features

- Interactive Hangman game
- Customizable secret word
- Visual display of hangman's gallows
- Real-time feedback on correct and incorrect guesses
- Game over message with the hangman's final state

## Usage

1. Make sure you have Java installed on your machine.
2. Clone this repository or download the `Main.java` file.
3. Open a terminal or command prompt and navigate to the project directory.
4. Compile the Java file with the following command:

   ```shell
   javac Main.java

## Example
The number of times the image of the hangman was shown in the example was reduced in order to prevent redundancy while explaining the function of this program. In the full program, the computer will reprint the updated string image of the hangman every time you guess a word. Lastly, each extra space between the three lines representing the real-time unknown word, number of wrong attempts, and the letter you are guessing, represents a new output that occurs each time you guess a letter.
  
```shell
$ java Main
What word would you like to use? hangman
        -------------
        |           |
        |             
        |             
        |             
        |             
        |             
        |             
        |             
        |
-----------------
*******
Wrong attempts: 0/4
Guess a letter: a

*a***a*
Wrong attempts: 0/4
Guess a letter: e

*a***a*
Wrong attempts: 1/4
Guess a letter: g

*a*g*a*
Wrong attempts: 1/4
Guess a letter: h

ha*g*a*
Wrong attempts: 1/4
Guess a letter: n

hang*a*
Wrong attempts: 1/4
Guess a letter: m

hangma*
Wrong attempts: 1/4
Guess a letter: n

You guessed the word!
-------------
|*|hangman|*|
-------------
```





**Biruk Gizaw**
- [Profile](https://github.com/bgizaw "Biruk Gizaw")
- [Email](mailto:bgizaw8@gmail.com?subject=Hi! "Hi!")
