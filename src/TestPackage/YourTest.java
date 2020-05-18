package TestPackage;

import Settings.UserNameAndPassword;
import org.junit.Before;

public class YourTest {

    /*
        Given before class

              Do not change the before class
    */

    @Before
    public void beforeClass(){

        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        userNameAndPassword.addUserToList();

    }

    /*

    YOUR CODE IS STARTING HERE

    Test the UserNameAndPassword class setUsername method

    Check all the possible options.

    NOTE :  For each possibility you need to create a different @Test method

     */

}
