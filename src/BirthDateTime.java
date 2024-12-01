import java.util.Scanner;

public class BirthDateTime {

    public static void main (String[] args) {
        Scanner pipe = new Scanner(System.in);

        int year = SafeInput.getRangedInt(pipe, "Enter your birth year", 1950, 2015);

        int month = SafeInput.getRangedInt(pipe, "Enter your birth month", 1, 12);


        int daysInMonth = switch (month) {
            case 4, 6, 9, 11 -> 30;
            case 2 -> {


                if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
                    yield 29;

                } else {
                    yield 28;
                }
            }


            default -> 31;
        };

        int day = SafeInput.getRangedInt(pipe, "Enter your date of birth",1, daysInMonth);

        int hour = SafeInput.getRangedInt(pipe, "Enter the hour you were born",1,24);

        int minute = SafeInput.getRangedInt(pipe, "Enter what minute you were born",1,59);

        System.out.printf("Your birth date and time is: %d-%02d-%02d %02d:%02d%n",
                year, month, day, hour, minute);

        pipe.close();
        }


    }

