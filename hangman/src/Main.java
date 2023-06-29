import java.util.Scanner;

public class Main {
    // basically where everything is iterated
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // ask user for word to guess
        System.out.println("What word would you like to use?");
        // change case to lowercase to ensure any case can be accepted as correct
        String secretWord = sc.nextLine().toLowerCase();
        int tries = 0;
        int MAX_TRIES = 4;
        String hangImage = "";
        StringBuilder unknownWord = new StringBuilder();
        // loop to create StringBuilder of asterisks same length as word provided
        for (int i = 0; i < secretWord.length(); i++) {
            unknownWord.append("*");
        }
        // loop to create line based on the length of word provided (only for aesthetic purposes)
        StringBuilder line = new StringBuilder();
        int extraLines = 6;
        for (int i=0; i<(secretWord.length()+extraLines); i++) {
            line.append("_");
        }
        // makes code continuously run as long as the # of tries is less than 4
        do {
            hanger(tries, hangImage);
            System.out.println(unknownWord);
            System.out.println("Wrong attempts: "+ tries + "/4");
            System.out.print("Guess a letter: ");
            char guess = sc.next().charAt(0);
            guess = Character.toLowerCase(guess);
            attempts(secretWord, guess, unknownWord);
            StringBuilder reference = new StringBuilder(secretWord);
            String referenceString = String.valueOf(guess);
            // use .indexOf method to check if the character guessed is not present in the word provided
            // if not present, the code returns -1, increases the tries variable by 1, and prints "wrong"
            if ((reference.indexOf(referenceString)) == -1) {
                tries += 1;
                System.out.print("wrong");
            }

            // if there are no "*" left in the original StringBuilder of "*", that means the player guessed all
            // letters correctly and won
            if ((unknownWord.indexOf("*")) == -1) {
                System.out.print("You guessed the word! \n" + line + "\n" +"|*|" + secretWord + "|*|");
                break;
            }
        } while (tries<MAX_TRIES);

        if (tries == MAX_TRIES) {
            hangImage = """ 
                           -------------
                           |           |
                           |         -----
                           |        |     |
                           |        |_____|
                           |           |
                           |          /|\\
                           |           |
                           |          / \\
                           |
                    -----------------""";
            System.out.println(hangImage);
            System.out.println("GAME OVER");
        }
    }
    //check if guess is correct and replace asterisk with letter if correct
        static StringBuilder attempts(String secretWord, char guess, StringBuilder unknownWord) {
            for (int i = 0; i < secretWord.length(); i++) {
                if (secretWord.charAt(i) == guess) {
                    unknownWord.setCharAt(i, guess);
                }
            }
        return unknownWord;
        }
        //create each instance of hangman image for each number of tries (use switch cases for this)
        static void hanger(int tries, String hangImage) {
        switch (tries) {
            case 0:
                hangImage = """ 
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
                            -----------------""";
                System.out.println(hangImage);
                break;

            case 1:
                hangImage = """ 
                                   -------------
                                   |           |
                                   |         -----
                                   |        |     |
                                   |        |_____|
                                   |          
                                   |          
                                   |          
                                   |          
                                   |
                            -----------------""";
                System.out.println(hangImage);
                break;

            case 2:
                hangImage = """ 
                                   -------------
                                   |           |
                                   |         -----
                                   |        |     |
                                   |        |_____|
                                   |           |
                                   |           |
                                   |           |
                                   |          
                                   |
                            -----------------""";
                System.out.println(hangImage);
                break;

            case 3:
                hangImage = """ 
                                   -------------
                                   |           |
                                   |         -----
                                   |        |     |
                                   |        |_____|
                                   |           |
                                   |           |
                                   |           |
                                   |          / \\
                                   |
                            -----------------""";
                System.out.println(hangImage);
                break;
            }
            }
    }
