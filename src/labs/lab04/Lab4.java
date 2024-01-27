package labs.lab04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        ArrayList<Integer> randomNumbers = generateArray(10);
        System.out.println(randomNumbers);

        while (true) {
            System.out.println("=====MENU======");
            System.out.println("1. Print all numbers");
            System.out.println("2. Print maximum value");
            System.out.println("3. Print minimum value");
            System.out.println("4. Search number");

            System.out.println("Enter your choice: ");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println(randomNumbers);
                    break;
                case 2:
                    int max = randomNumbers.get(0);

                    for (int i = 1; i < randomNumbers.size(); i++) {
                        if (randomNumbers.get(i) > max) {
                            max = randomNumbers.get(i);
                        }
                    }
                    System.out.printf("Max value is: %d\n", max);
                    break;
                case 3:
                    int min = randomNumbers.get(0);

                    for (int i = 1; i < randomNumbers.size(); i++) {
                        if (randomNumbers.get(i) < min) {
                            min = randomNumbers.get(i);
                        }
                    }
                    System.out.printf("Min value is: %d\n", min);
                    break;
                case 4:
                    System.out.println("Input number: ");
                    int numberToSearch = scanner.nextInt();
                    if (randomNumbers.contains(numberToSearch)) {
                        System.out.printf("Number %d is exist in list with index %d\n", numberToSearch, randomNumbers.indexOf(numberToSearch));
                    } else {
                        System.out.printf("Number %d is not existing in list\n", numberToSearch);
                    }
                    break;
                case 0:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Please input the correct option");
            }
        }


    }

    public static ArrayList<Integer> generateArray(int size) {
        ArrayList<Integer> myList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int randomNumber = new SecureRandom().nextInt(1000);
            myList.add(randomNumber);
        }
        return myList;
    }


}
