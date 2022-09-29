package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    Scanner sc = new Scanner(System.in);

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.print("0123456789012345678901" + System.lineSeparator() +
                "         __" + System.lineSeparator() +
                " _(\\    |@@|" + System.lineSeparator() +
                "(__/\\__ \\--/ __" + System.lineSeparator() +
                "   \\___|----|  |   __" + System.lineSeparator() +
                "       \\ }{ /\\ )_ / _\\" + System.lineSeparator() +
                "       /\\__/\\ \\__O (__" + System.lineSeparator() +
                "      (--/\\--)    \\__/" + System.lineSeparator() +
                "      _)(  )(_" + System.lineSeparator() +
                "     `---''---`" + System.lineSeparator());
    }

    //todo Task 3
    public void sumOfLiterals(){
        int l1 = 'Z';
        int l2 = 0xFace;
        int l3 = 012;
        int l4 = (int) 80L;
        int l5 = (int) 44e-1f;
        int l6 = (int) 5.5f;
        int l7 = (int) 8.88e1;
        int l8 = (int) 99.9;

        System.out.println(l1 + l2 + l3 + l4 + l5 + l6 + l7 + l8);
    }

    //todo Task 4
    public void addTwoNumbers(){
        int inputNumber1 = sc.nextInt();
        int inputNumber2 = sc.nextInt();
        int sum = inputNumber1 + inputNumber2;
        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        System.out.println("Before Swap:");
        System.out.print("x: ");
        int number1 = sc.nextInt();
        System.out.print("y: ");
        int number2 = sc.nextInt();
        System.out.println("After Swap:");
        System.out.println("x: " + number2);
        System.out.println("y: " + number1);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        System.out.print("n1: ");
        int inputNumber1 = sc.nextInt();
        System.out.print("n2: ");
        int inputNumber2 = sc.nextInt();

        if (inputNumber1 > inputNumber2) {
            System.out.println("n1 > n2");
        } else if (inputNumber2 > inputNumber1) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        System.out.print("Enter annual Revenue: ");
        int annualRevenue = sc.nextInt();
        if (annualRevenue < 0 || annualRevenue >= 100000) {
            System.out.println("Invalid Revenue");
        } else if (annualRevenue >= 0 && annualRevenue < 20000) {
            System.out.println("Poor Sales Revenue");
        } else if (annualRevenue >= 20000 && annualRevenue < 50000) {
            System.out.println("Average Sales Revenue");
        } else if (annualRevenue >= 50000 && annualRevenue < 80000) {
            System.out.println("Good Sales Revenue");
        } else if (annualRevenue >= 80000 && annualRevenue < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        System.out.print("Enter CommissionClass: ");
        int classInput = sc.nextInt();
        if (classInput == 1 || classInput == 2 || classInput == 3 || classInput == 4) {

            switch (classInput) {
                case 1:
                    System.out.println("Your Commission Rate was set to 0.01");
                    break;
                case 2:
                    System.out.println("Your Commission Rate was set to 0.02");
                    break;
                case 3:
                    System.out.println("Your Commission Rate was set to 0.03");
                    break;
                case 4:
                    System.out.println("Your Commission Rate was set to 0.04");
                    break;

            }
        } else {
            System.out.println("Your Commission Rate was set to 0.0");
        }
    }

    //todo Task 9
    public void leapyear(){
        System.out.print("Year: ");
        int yearInput = sc.nextInt();
        if ((yearInput % 4 == 0) && (yearInput % 100 == 0) && ((yearInput % 400 == 0) )) {
            System.out.println("Leapyear");
        }
        else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        System.out.print("Number: ");
        int number = sc.nextInt();

        if (number < 10) {
            System.out.println(number);
        } else if (number > 999) {
            System.out.println("Error! The number has more than 3 digits!");
        }
        else {


            int digitLast = number%10;
            int numberWithoutDigitLast = number/10;
            int digitMiddle = numberWithoutDigitLast%10;
            int lastNumber = numberWithoutDigitLast /10;

            System.out.println(String.valueOf(digitLast) + digitMiddle + lastNumber);

        }

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}