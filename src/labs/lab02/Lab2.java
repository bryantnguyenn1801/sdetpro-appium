package labs.lab02;

import java.util.Scanner;

public class Lab2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your height (m): ");
        double height = scanner.nextDouble();
        System.out.println("Please input your weight (kg): ");
        double weight = scanner.nextDouble();

// Lab 2.1
        double bmi = bmiCaculator(weight, height);
        System.out.println("BMI is: " + bmi);
        returnBMIStatus(bmi);

// Lab 2.2
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        checkEvenOrOddNumber(number);

// Lab 2.3
        giveSuggestion(bmi, weight);
    }

    public static double bmiCaculator(Double w, Double h) {
        return w / (h * h);
    }

    public static void returnBMIStatus(Double bmiValue) {
        System.out.print("BMI status: ");
        if (bmiValue < 18.5) {
            System.out.println("Underweight");
        } else if (18.5 <= bmiValue && bmiValue <= 24.9) {
            System.out.println("Normal weight");

        } else if (25 <= bmiValue && bmiValue <= 29.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obesity");
        }
    }

    public static void checkEvenOrOddNumber(Integer number) {
        if ((number % 2) == 0) {
            System.out.println("It's an even number");
        } else {
            System.out.println("It's an odd number");
        }
    }

    public static void giveSuggestion(Double bmiNumber, Double currentWeight) {
        System.out.print("Suggestion for you: ");
        if (bmiNumber < 18.5) {
            double targetWeight = 18.5 * (currentWeight / bmiNumber);
            System.out.println("Increase your weight for better health! Your target is: " + targetWeight + "kg");
        } else if (bmiNumber > 24.9) {
            double targetWeight = 24.9 * (currentWeight / bmiNumber);
            System.out.println("Decrease your weight for better health! Your target is: " + targetWeight + "kg");
        } else {
            System.out.println("No suggestion, keep doing your work!");
        }
    }

}
