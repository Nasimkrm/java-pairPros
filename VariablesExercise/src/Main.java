//Importing the Scanner class from the java.util package
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Run variables task
//        variablesTask();

        // Run conditionals task
        conditionalsTask();

    }

    public static void conditionalsTask() {
        //TASK 1
        //Separated the nested if statement so the full logic is run
        int x = 3, y= 5;
        if (x >= 0) {
            System.out.println("X is positive");
        } else {
            System.out.println("x is negative");
        }
        if ( y < x) {
            System.out.println("y is less than x");
        }
        else {
            System.out.println("y is greater than x");
        }


        //TASK2
        //Changed = to == to check the statement inside brackets
        int x2 = 7;
        if (x2 == 0) {
            System.out.println("x2 is zero");
        } else {
            System.out.println("x2 is not zero");
        }

        //Task3
        //Expanded our logic
        int x3 = 15, y3 = 24;
        if ( x3 % 2 == 0 && y3 % 2 == 0){
            System.out.println("x and y are even numbers");
        } else if(x3 % 2 == 0){
            System.out.println("x3 is even");
        } else if(y3 % 2 == 0){
            System.out.println("y3 is even");
        } else {
            System.out.println("x3 and y3 are odd");
        }








        
    }

    public static void variablesTask() {
        //TASK 1

        //Create and concatenate strings
        String firstName1 = "George", lastName1 = "Parker";
        String name = firstName1 + " " + lastName1;
        System.out.println(name);

        //TASK 2

        //Create and manipulate integers
        int num1, num2;
        num1 = 10;
        num2 = 15;
        System.out.println(num1+num2);
        double result = (double)num1 / (double)num2;
        System.out.println(result);
        int num3 = 8;
        System.out.println(num3++); // prints 8, then increments 8 to 9
        System.out.println(num3); // prints 9
        System.out.println(++num3); // increments 9 to 10, then prints 10

        //TASK 3

        //Read and manipulate user input from terminal
        Scanner in = new Scanner(System.in);

        System.out.println("Please enter your first name: ");
        String firstName3 = in.nextLine();

        System.out.println("Please enter your last name: ");
        String lastName3 = in.nextLine();

        System.out.println("Hi " + firstName3 + " " + lastName3 + "!");

        System.out.println("Enter a number: ");
        int number1 = in.nextInt();

        System.out.println("Enter another number: ");
        int number2 = in.nextInt();

        System.out.println("The sum is: " + (number1 + number2));
    }
}
