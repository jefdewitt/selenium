import java.util.Arrays;
import java.io.Console;
import java.util.Set;
import java.util.TreeSet;
// ^^^ Java packages (io) bundle related functionality

public class HelloWorld {

    public static void main(String[] args) {
        System.out.println("HelloWorld");

        Console console = System.console();

        /**

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

        */

        String itemCount = console.readLine("How many items do you want me to hold? ");
        int parsedItemCount = Integer.parseInt(itemCount);
        String[] friends = {"Michael" , "Jason", "Emily"};

        Encapsulator container = new Encapsulator();
        ArraySandbox arrayTinkerer = new ArraySandbox();
        Bird bird = new Bird();
        Bee bee = new Bee();
        ListSandbox listMachine = new ListSandbox();
        MapSandbox mapMachine = new MapSandbox();

        try {
            container.fill(parsedItemCount );

            while (container.countItems()) {
                console.printf("Hey, here's an item! %n");
            }

            if (container.isEmpty()) {
                console.printf("All items counted! %n");
            }
        } catch (IllegalArgumentException exception) {
            console.printf("Yikes! That's too many items to hold onto! %n");
            console.printf("The error was %s", exception);
        }

        // container.showEnhancedForLoop("fariba");
        // container.matchingLetters('e');
        System.out.printf("The unsorted array is: %s%n", Arrays.toString(friends));
        arrayTinkerer.arraySort(friends);
        arrayTinkerer.arraySortByLengthAndReversed(friends);
        bird.fly();
        bee.fly();
        listMachine.createListAndPrintToConsole("Jef", "Fariba", "Bella");
        System.out.printf("Here's the Map contents: %s%n", mapMachine.createMapAndPrintToConsole());


        /**
         * What Treehouse refers to as 'Systemizer'
         * It just shows you info about the system you're running JVM on
         */
        System.out.printf("This is the classpath:  %s %n",
            System.getProperty("java.class.path"));
        Set<String> propNames = new TreeSet<String>(System.getProperties().stringPropertyNames());
        for (String propertyName : propNames) {
            System.out.printf("%s is %s %n",
                    propertyName,
                    System.getProperty(propertyName));
        }
    }
}
