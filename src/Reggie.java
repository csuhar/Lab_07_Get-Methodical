import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reggie {

        public static void main (String[] args) {
            Scanner pipe = new Scanner(System.in);

            String SSN = SafeInput.getRegExString(pipe, "Enter your SSN (XXX-XX-XXXX)", "^^\\d{3}-\\d{2}-\\d{4}$");

            String M = SafeInput.getRegExString(pipe, "Enter your UC Student M number (M#####)", "^(M|m)\\d{5}$");

            String menuChoice = SafeInput.getRegExString(pipe, "Enter your menu choice  (O/S/V/Q)", "^[OoSsVvQq]$v");

            System.out.println("This is your social, thanks!: " + SSN);
            System.out.println("This is your Cinci M number: " + M);
            System.out.println("This is your menu choice: " + menuChoice);


        }

}
