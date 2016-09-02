/**
 * Created by shubham on 8/3/16.
 */

/**
 * Set- Does not allow duplicate values to be stored
 * sample application to understand the working of set in collection framework
 * We have four implementation of set, namely as :
 * Sorted Set
 * Hash Set
 * LinkedHash Set
 * Tree Set
 */


/**
 * Difference between HashSet and TreeSet
 * HashSet gives a faster performance then TreeSet
 * Hashset does not maintain any order of the elements, while elements are sorted in ascending order in 'TreeSet'
 */

import java.util.*;

public class SetCollectionExample{


    public static void main(String args[]){

        Set hashSet = new HashSet();
        hashSet.add("Test1");
        hashSet.add("Test2");
        hashSet.add("Test3");
        hashSet.add("Test4");

        //Adding a duplicate element inorder to show, that duplicates are removed in Sets(HashSet in this case)
        hashSet.add("Test2");

        for(Object temp : hashSet){
            System.out.println("Element value is : " + temp);
        }

        /**
         * understanding how list works in the collection framework
         */
        List testList = new ArrayList();
    }

}
