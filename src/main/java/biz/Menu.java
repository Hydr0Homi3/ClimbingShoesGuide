package biz;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    private ShoeService shoeService = new ShoeService();

    private Scanner scanner = new Scanner(System.in);

    public void run() {


        boolean exit = false;
        while (!exit) {
            System.out.println("Climbing shoe size guide - Menu.");
            System.out.println("Please choose an option:");
            System.out.println("1. Find me a shoe");
            System.out.println("2. Check 8a.pl for a shoe");
            System.out.println("3. Check polarsport.pl for a shoe");
            System.out.println("4. Show all shoes");
            System.out.println("5. Exit");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.println("Enter your foot volume (High, Medium, Low): ");
                        String footVolume = scanner.nextLine();
                        System.out.println("Enter your foot type (Classic, Square, Centre): ");
                        String footType = scanner.nextLine();
                        shoeService.findAShoe(footVolume, footType);
                        System.out.println("Here are all shoes that will fit your expectations.");
                    }
                    case 2 -> {
                        System.out.println("Enter the brand name (La Sportiva / Scarpa): ");
                        String brandName = scanner.nextLine();
                        System.out.println("Enter the model name (Instinct VSR / Theory): ");
                        String model = scanner.nextLine();
                        System.out.println("Enter the size you're looking for: ");
                        double size = scanner.nextDouble();
                        shoeService.checkShoeOn8A(brandName, model, size);
                        System.out.println("Here are all shoes that will fit your expectations.");
                    }
                    case 3 -> {
                        System.out.println("Enter the brand name (La Sportiva / Scarpa): ");
                        String brandName = scanner.nextLine();
                        System.out.println("Enter the model name (Instinct VSR / Theory): ");
                        String model = scanner.nextLine();
                        System.out.println("Enter the size you're looking for: ");
                        double size = scanner.nextDouble();
                        shoeService.checkShoesOnPolarsport(brandName, model, size);
                        System.out.println("Here are all shoes that will fit your expectations.");
                    }
                    case 4 -> {
                        shoeService.showAllShoes();
                        System.out.println("All tasks shown successfully.");
                    }
                    case 5 -> {
                        exit = true;
                        System.out.println("Exiting program...");
                    }
                    default -> System.out.println("Invalid choice.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("Invalid task number. Please enter a valid task number.");
                scanner.nextLine();
            }
        }
    }
}

