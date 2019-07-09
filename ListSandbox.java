import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ListSandbox {

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
