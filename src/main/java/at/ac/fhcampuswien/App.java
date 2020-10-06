package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){

        Scanner scanner = new Scanner(System.in);
        float number;
        float bigNumber = 0;
        int count = 1;

        do{
            number = scanner.nextFloat();

            if(number > bigNumber){
                bigNumber = number;
            }

            System.out.print("Number " + count + ": ");
            count++;
        }
        while(number > 0);

        if(bigNumber <= 0){
            System.out.println("No number entered.");
        }
        else {
            String output = String.format("The largest number is " + "%.2f", bigNumber);
            System.out.println(output);
        }
    }

    //todo Task 2
    public void stairs(){

        Scanner scanner = new Scanner(System.in);
        int column;
        int row = 1;
        int number = 1;

        column = scanner.nextInt();
        System.out.print("n: ");

        if (column <= 0){
            System.out.println("Invalid number!");
        }
        else {
            for (int i = 0; column > i; i++) {
                for (int j = 0; row > j; j++) {
                    System.out.print(number + " ");
                    number++;
                }
                System.out.println("");
                row++;
            }
        }
    }

    //todo Task 3
    public void printPyramid(){

        int row = 6;
        int starCount = 1;

        for (int i = 0; row > i; i++){

            for (int j = 0; (row - i - 1) > j; j++){
                System.out.print(" ");
            }
            for (int k = 0; (starCount) > k; k++){
                System.out.print("*");
            }
            starCount += 2;
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}