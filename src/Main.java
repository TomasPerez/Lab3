import java.util.Scanner;

import static java.lang.Math.pow;


/**
 * Created by DELL on 7/12/2017.
 */
public class Main {

    public static void main(String[] args) {
        int input;
        int m;
        String answer = " ";

        Scanner scan = new Scanner(System.in);

        System.out.println("Hello There User! ");
        System.out.println("Please follow these short instructions: ");

        System.out.print("Please enter a number ");
        input = scan.nextInt();

        do {
            for (m = 1; m <= input; m++) {
                System.out.println(m + "\t" + pow(m, 2) + "\t" + pow(m, 3));
            }
            System.out.println("Would you like to Continue?(y/n): ");
            answer = scan.nextLine();
        } while (answer.equals("y"));
    }

    }