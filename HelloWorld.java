import java.util.Arrays;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Console;
import java.util.Set;
import java.util.TreeSet;
import java.io.IOException;
// ^^^ Java packages (io) bundle related functionality

public class HelloWorld {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("How much money can I borrow in US legal tender?");
            String str = br.readLine();
            System.out.println(str);
        } catch(IOException e) {
            e.printStackTrace();
        }


    }
}
