/**
 * Created by Shubham on 9/2/16.
 */
import java.util.Arrays;
import java.util.List;
/**
 * Sample application to understand the working of Arrays.asList() in java
 */
public class ArraysAsList {
    //Main function for the program to start from
    public static void main(String[] argv){
        //Let us create a array of strings below
        String[] stringArray = new String[]{"aval1", "aval2", "aval3"};
        //Let us assign the array of strings to a list
        List list1 = Arrays.asList(stringArray);
        //The values in array 'stringArray' are now linked to values in List 'list1'
        //Let us now print the list inorder to understand what we achieved by the above code
        System.out.println("The values contained inside list are as follows : " + list1);
    }
}
