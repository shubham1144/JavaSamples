/**
 * Created by shubham on 7/26/16.
 */

/**
 * Java program to find two maximum numbers in a array
 */
public class TwoMaxNumbers {

    public static void main(String args[]) {

        System.out.println("Executing function to find two highest numbers in a array");
        int[] numbers = {1,2,3,5333,89,56};
        FindTwoHighestNumbers(numbers);

    }

    /**
     * function to find highest numbers by traversing the array
     */
    private static void FindTwoHighestNumbers(int[] nums) {

        int maxOne = 0;
        int maxTwo = 0;

        for (int n : nums) {
            if (maxOne < n) {
                maxTwo = maxOne;
                maxOne = n;
            } else if (maxTwo < n) {
                maxTwo = n;
            }
        }

        System.out.println("The highest number is : " + maxOne);
        System.out.println("The second highest number is : " + maxTwo);

    }
}
