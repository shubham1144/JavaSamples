/**
 * Created by Shubham on 9/2/16.
 */

/**
 * Program to understand how arrays works in java
 */
public class ArrayExample {
    public static void main(String[] argv){
        System.out.println("The program is executing successfully...");
        //Below statement to demonstrate compiler error when array is not initialized
        //int[] anArray;
        int[] anArray = new int[20];
        try{
            //Below line illustartes the arrayoutofbound exception (Runtime exception) thrown
            System.out.println("The array declared consists of the following elements at location 0 : " + anArray[21]);

        }catch(Exception ex){
            System.out.println("Error occured due to : " + ex);
        }
    }
}
