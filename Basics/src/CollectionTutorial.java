/**
 * Created by Shubham on 9/1/16.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Sample application to understand hw collections work in java
 */
public class CollectionTutorial {

    public static void main(String argv[]){
        System.out.println("The application is set up and running successfully");
        List<String> list = new ArrayList<>();
        //Inserting values in the list we created above
        list.add("value1");
        list.add("value2");
        System.out.println("The arraylist contains the following elements : " + list);
        //Trying to add a boolean to the arraylist

    }
}
