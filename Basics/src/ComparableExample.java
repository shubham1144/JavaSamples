/**
 * Created by Shubham on 8/29/16.
 */

/**
 * creating a sample application to understand the working of comparable in java
 */
public class ComparableExample implements Comparable<ComparableExample>{

    int deviceIdentity;
    String deviceName;

    //We need to implement the compareTo method whenever we use the comparable interface.
    @Override
    public int compareTo(ComparableExample anotherComparableExampleObject) {
        if(deviceIdentity < anotherComparableExampleObject.deviceIdentity){
            return -1;
        }
        else if(deviceIdentity >anotherComparableExampleObject.deviceIdentity){

        }
        return 0;
    }
    //A main function to understand the working of comparable in java
    public static void main(String args[]){
        System.out.println("Executing main function");
        ComparableExample object1 = new ComparableExample();
        object1.deviceIdentity = 1;
        //The value should be returned first, whenever sort by ascending is called as the
        // device name is second device, but the device identity is 1.
        object1.deviceName = "Tweaked Second";
        ComparableExample object2 = new ComparableExample();
        //object2.

    }
}
