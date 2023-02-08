/**
* Gives a greeting and an extra line of code.
*
* @author  Keiden B
* @version 1.0
* @since   2023-02-07
*/

public final class HelloWorld {
    /**
    * Neccessary to prevent HideUtilityClass Error.
    *
    *
    * @exception IllegalStateException Utility class
    * @see IllegalStateException
    */
    private HelloWorld() {
        throw new IllegalStateException("Utility class");
    }

    /**
    * Main lines of code.
    *
    * @param args a placeholder value when making the main function
    */
    public static void main(String[] args) {
        System.out.println("Hey there, Bucko.");
        System.out.println("This town ain't big 'nough fer the two o' us.");
    }
}
