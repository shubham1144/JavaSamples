package package2;

import package1.Interface1;

/**
 * Created by Shubham on 9/12/16.
 */

//* A sample class in second package.
// Need to verify whether i will be able to access the intereface in any package with public access modifier

public class PackageTwoClass implements Interface1{
    @Override
    public void methodOne() {

    }

    @Override
    public void methodTwo() {

    }
}

/**
 * As per my observation, i am able to access the i am able to access a public interface in any package in the application.
 */
