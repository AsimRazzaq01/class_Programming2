//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     //   Declaring Variables:
     //   Variables store data and have a specific data type.
        int age = 25;
        double salary = 50000.0;
        String name = "John";

      //  Loop  Types:

      //  For Loop:
      //  A for loop repeats a block of code a specified number of times.
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }
      //  While Loop:
      //  A while loop continues executing a block of code as long as a condition is true.
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }
      //  Do-While Loop:
      //  A do-while loop executes the code block at least once before checking the condition.
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 3);

      //  Conditional Statements:


      //  If Statement:
      //  Conditional execution using the if statement.
        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }
     //   If-Else Statement:
     //   Conditional branching using if-else.
        int num = 7;
        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
     //   Nested If-Else:
     //   Multiple levels of conditional statements.
        int age = 18;
        if (age >= 18) {
            if (age < 21) {
                System.out.println("You're eligible but not for alcohol");
            } else {
                System.out.println("You're eligible for everything");
            }
        } else {
            System.out.println("You're not eligible");
        }

     //   Switch Case:
     //   Multi-choice decision using switch-case.
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
// ...
            default:
                System.out.println("Invalid day");
        }




    }
}