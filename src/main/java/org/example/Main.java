package org.example;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static void main(String[] args) {
        logger.info("execution started");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator");
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.println("Choose an operation:");
        System.out.println("1. Add (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.print("Enter your choice (1-4): ");
        int choice = scanner.nextInt();

        double result = 0;
        boolean validOperation = true;

        switch (choice) {
            case 1:
                logger.info("START OP: Add");
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case 2:
                logger.info("START OP: substraction");
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case 3:
                logger.info("START OP: mul");
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case 4:
                if (num2 != 0) {
                    logger.info("START OP: div");
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    logger.info("START OP: div");
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                logger.warn("Invalid input");
                validOperation = false;
                System.out.println("Invalid choice. Please choose a valid operation.");
        }

        if (validOperation) {
            System.out.println("Thank you for using the Basic Calculator.");
        }
        scanner.close();
    }
}
