import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListSandbox {

    /**
     * Lists are basically the arrays of the Java world.
     * Ok, so I know that's not right but arrays are really
     * only practical if you know for certain their size.
     * Adding/removing items from an array requires copying
     * that array plus/minus the changes you want made.
     *
     * Lists, however, are dynamic. Hence, they're the arrays
     * of the Java world (relative to JavaScript ;))
     * @param args
     */

    // Note the varargs (variable arguments) allowing 0 to many
    // to be passed to the function, denoted by the elipses (...)
    public void createListAndPrintToConsole(String... args) {
        List<String> personsList = new ArrayList<>();

        if (args.length > 0) {
            for (String person : args) {
                personsList.add(person);
            }
        }

        System.out.printf("Here's the list of folks you added: %s%n", personsList.toString() );
    }


}
