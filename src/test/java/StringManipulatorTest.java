/*
// this is the testing class
// DO NOT MODIFY THIS CLASS AND ITS METHODS
*/
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

public class StringManipulatorTest {
    // test replaceAll
    @Test public void testReplaceAll() {
        String str = "catch that banana";
        char oldC = 'a', newC = 'e';
    	assertThat("\nThis is the test on your replaceAll method.\nThe original string is: " + str 
            + "\nWhen " + oldC + " gets replaced by " + newC, 
            StringManipulator.replaceAll(str, oldC, newC), 
            is(RightSolution.replaceAll(str, oldC, newC)));    
    }

    @Test public void testReplaceAll2() {
        String str = "catch that banana";
        char oldC = 'c', newC = 'd';
        assertThat("\nThis is the test on your replaceAll method.\nThe original string is: " + str
            + "\nWhen " + oldC + " gets replaced by " + newC, 
            StringManipulator.replaceAll(str, oldC, newC), 
            is(RightSolution.replaceAll(str, oldC, newC))); 
    }

    // test validateOccurance
    @Test public void testValidateOccurance() {
        String str = "catch that banana";
        char c = 'a';
        int number = 5;
        assertThat("\nThis is the test on your validateOccurance method.\nThe original string is: " + str
            + "\nThe index of No. " + number + " occurance of character " + c, 
            StringManipulator.validateOccurance(str, c, number), 
            is(RightSolution.validateOccurance(str, c, number))); 
    }

    @Test public void testValidateOccurance2() {
        String str = "catch that banana";
        char c = 'a';
        int number = 6;
        assertThat("\nThis is the test on your validateOccurance method.\nThe original string is: " + str
            + "\nThe index of No. " + number + " occurance of character " + c, 
            StringManipulator.validateOccurance(str, c, number), 
            is(RightSolution.validateOccurance(str, c, number))); 
    }

    @Test public void testValidateOccurance3() {
        String str = "good morning";
        char c = 'o';
        int number = 3;
        assertThat("\nThis is the test on your validateOccurance method.\nThe original string is: " + str
            + "\nThe index of No. " + number + " occurance of character " + c, 
            StringManipulator.validateOccurance(str, c, number), 
            is(RightSolution.validateOccurance(str, c, number))); 
    }

    // // test repliace single
    // @Test public void testReplaceSingle() {
    //     String str = "good morning";
    //     int i = 3;
    //     char newChar = 'p';
    //     assertThat("\nThis is the test on your replaceSingle method.\nThe original string is: " + str
    //         + "\nWhen the character at index " + i + " gets replaced by " + newChar, 
    //         StringManipulator.replaceSingle(str, i, newChar), 
    //         is(RightSolution.replaceSingle(str, i, newChar))); 
    // }

    // test repliace single
    @Test public void testReplaceSingle() {
        String str = "good morning";
        int i = 3;
        char newChar = 'p';
        assertThat("\nThis is the test on your replaceSingle method.\nYou failed to pass the test.\nHint: You may forget to update the target string to return, as it is still empty.\nFor instance, the original string is: " + str
            + "\nWhen the character at index " + i + " gets replaced by " + newChar, 
            StringManipulator.replaceSingle(str, i, newChar), 
            is(RightSolution.replaceSingle(str, i, newChar))); 
    }

    @Test public void testReplaceSingle2() {
        String str = "good morning";
        int i = 11;
        char newChar = 'd';
        assertThat("\nThis is the test on your replaceSingle method.\nThe original string is: " + str
            + "\nWhen the character at index " + i + " gets replaced by " + newChar, 
            StringManipulator.replaceSingle(str, i, newChar), 
            is(RightSolution.replaceSingle(str, i, newChar))); 
    }

    // test remove
    @Test public void testRemove() {
        String str = "good morning";
        char c = 'o';
        assertThat("\nThis is the test on your remove method.\nThe original string is: " + str
            + "\nWhen the character " + c + " gets removed", 
            StringManipulator.remove(str, c), 
            is(RightSolution.remove(str, c))); 

    }
}
