import java.util.*;
// this is the main class
public class StringManipulator {
    /*
        what goes into main method may include:
        (1) logics that deal with user interaction
        (2) utlization of the required methods
        (3) error checking of user input
    */

    public static void main(String[] args) {
        Boolean run = true;
        while(run == true){
            System.out.println("Enter the string to be manipulated: ");
            String userString = System.console().readLine();
            if(validateString(userString) == true){
                System.out.println("Enter your command(quit, print reverse, replace all, replace single, remove)");
                String process = System.console().readLine();
                String correctedProcess = process.toLowerCase();
                if(correctedProcess.equals("quit")){
                    run = false;
                }
                else if(correctedProcess.equals("print reverse")){
                    printReverse(userString);
                }
                else if(correctedProcess.equals("replace all")){
                    System.out.println("Enter the character to replace: ");
                    String aOldString = System.console().readLine();
                    if(userString.contains(aOldString)){
                        if(validChar(aOldString)){
                            char aOldChar = aOldString.charAt(0);
                            System.out.println("Enter the new character: ");
                            String aNewString = System.console().readLine();
                            if(validChar(aNewString)){
                                char aNewChar = aNewString.charAt(0);
                                System.out.println("Your new string is " + replaceAll(userString, aOldChar, aNewChar));
                            }
                        }
                    }
                    else{
                        System.out.println("Input does not contain given character");
                    }
                }
                else if(correctedProcess.equals("replace single")){
                    System.out.println("Enter the character to replace");
                    String sOldString = System.console().readLine();
                    if(userString.contains(sOldString)){
                        if(validChar(sOldString)){
                            char sOldChar = sOldString.charAt(0);
                            System.out.println("Enter the new character: ");
                            String sNewString = System.console().readLine();
                            if(validChar(sNewString)){
                                char sNewChar = sNewString.charAt(0);
                                System.out.println("Which " + sOldChar + " would you like to replace?");
                                String sOldInt = System.console().readLine();
                                if(validInt(sOldInt)){
                                    int sNewInt = Integer.parseInt(sOldInt);
                                    int sFinalInt = validateOccurance(userString, sOldChar, sNewInt);
                                    System.out.println("Your new string is " + replaceSingle(userString, sFinalInt, sNewChar));
                                }
                            }
                        }
                        else{
                            System.out.println("Character not in input");
                        }
                    }
                }
                else if(correctedProcess.equals("remove")){
                    System.out.println("Enter the character to remove: ");
                    String rString = System.console().readLine();
                    if(userString.contains(rString)){
                        if(validChar(rString)){
                            char rChar = rString.charAt(0);
                            System.out.println("Your new string is " + remove(userString, rChar));
                        }
                    }
                }
                else{
                    System.out.println("Please input valid command");
                }
    }
    }
    }
    // this method checks if any given input string is empty
    // if empty, alert users who goes wrong and return false
    // otherwise return true
    /* e.g.1, str: godawgo
             char: ""
             print: Error - There is no input
             return: false
       e.g.2, str: ""
             char: s
             print: Error - There is no input
             return: false
    */
    public static boolean validateString(String str) {
        // you will remove this line
        if(str.equals("") || str.equals(null)){
            System.out.println("Error - There is no input");
            return false;
        }
        else {
            return true;
        }
    }

    // this method checks if the given character c is contained by the string str
    // if c is not contained by str, alert users what goes wrong and return false
    // otherwise return true
    /* e.g.1, str: godawgo
             char: o
             return: true
       e.g.2, str: godawgo
             char: s
             print: Error - The string does not contain the given character
             return: false
    */
    public static boolean validateStringContainsChar(String str, char c) {
        // you will remove this line
        for(i = 0; i < str.length(); i++){
            if(str.charAt(i)){
                return true;
            }
            else{
                return false;
            }
        }
    }

    // this method takes a string and print it reversely
    public static void printReverse(String str) {
        // you will remove this line
        String revString = "";
        for(int i = str.length() - 1; i >= 0; i--){
            revString = revString + str.charAt(i);
        }
        System.out.println(revString);
    }

    // this method replace oldChar with newChar for any occurance of oldChar
    // you should assume the validity of all parameters
    /* e.g.1, str: godawgo
             oldChar: o
             newChar: t
             return: gtdawgt
    */
    public static String replaceAll(String str, char oldChar, char newChar) {
        // you will remove this line
            for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == oldChar){
                    str = str.substring(0,i) + newChar + str.substring(i + 1);
            }
        }
        return str;
    }



    // this method checks whether the give occurance of c in str is valid
    // you should assume that c is contained by str - this can be guaranteed by validateChar
    // if c does not have an number (e.g., 3rd) of occurance, return -1
    // otherwise, return the index of c at the number (e.g., 3rd) of occurance
    /* e.g.1, str: godawgo
             char: o
             number: 2
             return: 6
       e.g.2, str: godawgo
             char: o
             number: 3
             return: -1
    */
    public static int validateOccurance(String str, char c, int number) {
        // you will remove this line    
        int occurences = 0;
        for(int i = 0; i < str.length(); i++){
                if(str.charAt(i) == c){
                    occurences += 1;
                }
                return str.indexOf(i);
        }
    }

    // this method replace the character at index i with newChar
    // this method may take advantage of the validateOccurance method 
    // all parameters should be assumed valid
    /* e.g.1, str: godawgo
             i: 2
             newChar: s
             return: gosawgo
    */
    public static String replaceSingle(String str, int i, char newChar) {
        // you will remove this line
        str = str.substring(0,i) + newChar + str.substring(i + 1);
        return str;
    }

    // this method removes character c at any occurance
    // all parameters should be assumed valid
    /* e.g.1, str: godawgo
             char: o
             return: gdawg
    */
    public static String remove(String str, char c) {
        // you will remove this line
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == c){
                str = str.replace(String.valueOf(c), "");
                }
            }
    return str;
}

    /*
        You are welcome to add more methods below
    */
    public static Boolean validChar(String arg){
        String input = arg;
        if(input.length() == 1){
            return true;
        }
        else{
            System.out.println("Please enter valid character");
            return false;
        }
    }
    public static Boolean validInt(String arg){
        try{
            Integer.parseInt(arg);
            return true;
        }
        catch(Exception e) {
            System.out.println("Please enter valid integer");
            return false;
        }

    }

}