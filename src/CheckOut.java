import java.util.Scanner;

public class CheckOut {

    public static void main (String[] args) {
        Scanner pipe = new Scanner(System.in);
        double totalCost = 0.0;

        System.out.println("This is the 10$ store, hello there!");

        do {

            double itemPrice = SafeInput.getRangedDouble(pipe, "Enter the price of your item", 0.01, 10.0);

            totalCost += itemPrice;

        } while (SafeInput.getYNConfirm(pipe, "Do you have any other items?"));


        System.out.printf("The total cost of your item(s) is: $%.2f%n ", totalCost);

        pipe.close();
        }


    }


