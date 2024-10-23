import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        String firstName = "George", lastName = "Parker";
//        String name = firstName + " " + lastName;
//        System.out.println(name);

//        int num1, num2;
//        num1 = 10;
//        num2 = 15;
//        System.out.println(num1+num2);
//        double result = (double)num1 / (double)num2;
//        System.out.println(result);
//        int num3 = 8;
//        System.out.println(num3++); // prints 8, then increments 8 to 9
//        System.out.println(num3); // prints 9
//        System.out.println(++num3); // increments 9 to 10, then prints 10

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName = in.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName = in.nextLine();

        System.out.println("Hi " + firstName + " " + lastName + "!");

        System.out.println("Enter a number: ");
        int num1 = in.nextInt();

        System.out.println("Enter another number: ");
        int num2 = in.nextInt();

        System.out.println("The sum is: " + (num1 + num2));


    }
}
