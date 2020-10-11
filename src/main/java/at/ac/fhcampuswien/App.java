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
                System.out.println();
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
        Scanner scanner = new Scanner(System.in);

        char c;
        int h;
        int spaceToPrint;
        int halfHeight;
        int asciiToPrint = 1;
        int asciiNr = 0;
        boolean middleReached = false;

        System.out.print("h: ");
        h = scanner.nextInt();
        System.out.print("c: ");
        c = scanner.next().charAt(0);

        halfHeight = (h - 1) / 2;
        spaceToPrint = halfHeight;

        if(h % 2 != 0){
            for (int i = 0; i <= halfHeight; i++){

                for (int j = 0; j < spaceToPrint; j++){
                    System.out.print(" ");
                }
                for (int k = 0; k < asciiToPrint; k++){
                    System.out.print((char) (c - asciiNr));
                    if ((c - asciiNr) == c) {
                        middleReached = true;
                    }
                    if(middleReached){
                        asciiNr += 1;
                    }
                    else{
                        asciiNr -= 1;
                    }
                }
                asciiToPrint += 2;
                spaceToPrint -= 1;
                asciiNr = (asciiToPrint - 1) / 2;
                middleReached = false;
                System.out.println();
            }
            asciiToPrint -= 4;
            spaceToPrint += 2;
            asciiNr = (asciiToPrint - 1) / 2;

            for(int l = 0; l < halfHeight; l++){
                for (int j = 0; j < spaceToPrint; j++){
                    System.out.print(" ");
                }
                for (int k = 0; k < asciiToPrint; k++){
                    System.out.print((char) (c - asciiNr));
                    if ((c - asciiNr) == c) {
                        middleReached = true;
                    }
                    if(middleReached){
                        asciiNr += 1;
                    }
                    else{
                        asciiNr -= 1;
                    }
                }
                asciiToPrint -= 2;
                spaceToPrint += 1;
                asciiNr = (asciiToPrint - 1) / 2;
                middleReached = false;
                System.out.println();
            }
        }
        else{
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    public void marks(){

        Scanner scanner = new Scanner(System.in);
        int grade;
        int gradeSum = 0;
        int count = 0;
        int negativeGradeCount = 0;
        float average;

        do {
            System.out.print("Mark " + (count + 1) + ": ");
            grade = scanner.nextInt();

            if (grade < 0 || grade > 5){
                System.out.println("Invalid mark!");
            }
            if(grade == 5){
                negativeGradeCount++;
            }
            if (grade > 0 && grade <= 5) {
                gradeSum = gradeSum + grade;
                count++;
            }
        }
        while(grade != 0);

        if (gradeSum == 0 || count == 0){
            average = 0;
        }
        else{
            average = (float) gradeSum / count;
        }

        String output = String.format("Average: " + "%.2f", average);
        System.out.println(output);
        System.out.println("Negative marks: " + negativeGradeCount);
    }

    //todo Task 6
    public void happyNumbers(){

        Scanner scanner = new Scanner(System.in);
        int number;
        int dezOne;
        int dezTen;
        int dezHundred;
        int quadSum;
        boolean happyOrSad = false;


        System.out.print("n: ");
        number = scanner.nextInt();


        while(!happyOrSad) {
            dezOne = number % 10;
            dezTen = ((number % 100) - dezOne) /10;
            dezHundred = ((number % 1000) - (dezOne + dezTen)) / 100;
            quadSum = (dezOne * dezOne) + (dezTen * dezTen) + (dezHundred * dezHundred);
            number = quadSum;
            if (number == 1 || number == 4){
              happyOrSad = true;
            }
        }
        if (number == 1){
            System.out.println("Happy number!");
        }
        else{
           System.out.println("Sad number!");
       }
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