package bradyator;

import java.io.Console;

/**
 *
 * @author Brady Mathis <brady.mathis@csuglobal.edu>
 */
public class Bradyator {

    //Initialize strings to be used for user messages
    private static final String WELCOME_MESSAGE = "\nWelcome to the Bradyator.\nEnter a sentence to be processed (e.g. your first and last name),\nor enter “Exit” to terminate";
    private static final String TERMINATE_MESSAGE = "\nSee you later.\nThanks for using the Bradyator!";
    
    public static void main(String[] args) {
        
        //Try to get an object reference to the console for input
        Boolean haveConsole = true;
        Console userConsole = System.console();
        if (userConsole == null){
            System.out.println("No console available, sorry.");
            haveConsole = false;
        }
        
        //begin the infinite loop; terminated by user, only executes if the console is available
        while(haveConsole){
            System.out.println(WELCOME_MESSAGE);
                        
            //Prompt the user for input and test for validity
            String userInput = userConsole.readLine("Enter phrase: ");
                        
            if (userInput != null && !userInput.isEmpty()){
                
                //Valid input, now test for "Exit"
                if (userInput.equalsIgnoreCase("exit")){
                    //User has entered "Exit", terminate
                    break;
                }
                
                //user did not ask to exit, invoke the string method
                System.out.println("\nYour input has been Bradyated! \n-->[" + manipulateString(userInput) + "]<--\n");
            }
                
            
            
        }
        System.out.println(TERMINATE_MESSAGE);
    }

    private static String manipulateString(String userInput) {
        String returnString = "";
        
        // Split the string into an array of words
        String[] words = userInput.split(" ");
        if (words.length > 1){
            //There is more than one word
            String[] prefixes = new String[words.length];
            String[] suffixes = new String[words.length];
            int i = 0;
            
            // Iterate through each word
            for (String word : words){
                
                // Look for the position of a vowel and split the word
                // into substrings accordingly
                int vowelIndex = findVowelIndex(word);
                if (vowelIndex >= 0){
                    prefixes[i] = word.substring(0, vowelIndex);
                    suffixes[i] = word.substring(vowelIndex, word.length());
                }
                else{ // there is no vowel, just use the word
                    prefixes[i] = "";
                    suffixes[i] = word;
                }
                                
                i++;
            }
            
            // Iterate through the arrays and reasemble the string
            for (int j = 0; j < words.length; j++){
                // Shift so the values from prefixes are from the subsequent word
                // test to ensure that the final prefix and first suffix are joined
                if ( j == words.length - 1){
                    // This should be the final word, needs no trailing space.
                    returnString += prefixes[0] + suffixes[j];
                }
                else {
                    returnString += prefixes[j+1] + suffixes[j] + " ";
                }
            }
        }
        else { // There is only one word
            
            // just reverse the order of characters
            for (int i = userInput.length(); i > 0; i--){
                returnString += userInput.substring(i - 1, i);
            }
        }
            
        return returnString;
        
    }

    private static int findVowelIndex(String word) {
        
        //create a string of vowels to compare
        String vowels = "aeiou";
        
        // Loop through each character in the word and see if it is a vowel
        // Return the first index of a vowel found
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.toLowerCase().subSequence(i, i+1))){
                return i;
            }
        }
        // If no vowels were found, return -1
        return -1;
    }
    
}
