import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Console;
import java.util.Set;
import java.util.TreeSet;
import java.io.IOException;
// ^^^ Java packages (io) bundle related functionality

public class UserInput {

    Console console = System.console();

     // collect some user info
     String firstName = console.readLine("What's your first name? ");
     String lastName = console.readLine("What's your last name? ");
     String age = console.readLine("Now that I'm being nosey, how old are you? ");
     int parsedInt = Integer.parseInt(age);

     if ( firstName.equals("Jef") || firstName.equalsIgnoreCase("Jeff") ) {
         console.printf("Jef(f)s are not allowed, sorry about your luck. ");
         System.exit(0); // how you stop a program from running
     }

     // int userAge = 12;
     if (parsedInt < 13) {
         console.printf("You're not old enough. Beat it.");
         System.exit(0);
     }
     console.printf("Nice to meet you %s %s, age: %s. %n", firstName, lastName, age);

    try {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("How much money can I borrow in US legal tender?");
        String str = br.readLine();
        System.out.println(str);
    } catch(IOException e) {
        e.printStackTrace();
    }

}
