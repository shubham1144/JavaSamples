/**
 * Created by samyak on 7/26/16.
 */
import org.springframework.util.*;
/**
 * java program to find the frequency of occurance of character in a string using a external library
 */
public class CharacterOccuranceFreq {

public static void main(String args[]){

    String name = "Shubham";
    char[] nameCharacters = name.toCharArray();

    for(int i=0; i<name.length(); i++){
        int count = StringUtils.countOccurrencesOf(name, String.valueOf(nameCharacters[i]));
        System.out.println("the count frequency of " + String.valueOf(nameCharacters[i]) + " in the string is : " + count);
    }


}

}
