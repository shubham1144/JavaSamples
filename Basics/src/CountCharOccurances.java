/**
 * Created by Shubham on 9/2/16.
 */

import java.util.HashMap;
import java.util.Map;

/**
 * Sample program to count the number of occurances of a character in a string
 */
public class CountCharOccurances {
    public static void main(String args[]){
     characterCount("shubhamChodankar");
    }

    //function to find the number of occurances of characters in the input string
    public static void characterCount(String inputString){
        //Step 1: Convert the given string into char array
        char[] charArray = inputString.toCharArray();

        //Step 2: Create a hashmap which will hold character and the count of characters
        //We use a wrapper as char is a primitive data type
        Map<Character, Integer> hashMap = new HashMap<>();
        //Step 3: Create a HashMap to maintain key-value pairs of character and count of characters
        for(char c : charArray){
            /*For each character in the charArray generated from the string  validate against the hashmap*/
             if(hashMap.containsKey(c)){
                  //Updates the character count by 1
                  hashMap.put(c, hashMap.get(c) +1);
             }
             //the character is not yet present in the hashmap
             else
             {
                 //Adds the character in the hashmap
                 hashMap.put(c, 1);
             }
        }
        //print the hashmap
        System.out.println("Output having count of characters is as follows : " + hashMap);

    }
}
