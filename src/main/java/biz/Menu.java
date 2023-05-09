package biz;

import biz.model.Shoe;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private ShoeService shoeService = new ShoeService();
    private List<Shoe> shoes = shoeService.getShoes();
    private Scanner scanner = new Scanner(System.in);

    public void run() {


        boolean exit = false;
        while (!exit) {
            System.out.println("Climbing shoe size guide - Menu.");
            System.out.println("Please choose an option:");
            System.out.println("1. Add a new shoe");
            System.out.println("2. Delete a shoe");
            System.out.println("3. Show all shoes");
            System.out.println("4. Delete all shoes");
            System.out.println("5. Find me a shoe");
            System.out.println("6. Exit");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> {
                        System.out.println("Add a new shoe:");

                        System.out.println("New shoe added successfully.");
                    }
                    case 2 -> {
                        shoeService.showAllShoes();
                        System.out.println("Enter the shoe number to delete:");
                        int index = scanner.nextInt() - 1;
                        shoeService.deleteShoe(index);
                        System.out.println("Shoe deleted successfully.");
                    }
                    case 3 -> {
                        shoeService.showAllShoes();
                        System.out.println("All tasks shown successfully.");
                    }
                    case 4 -> {
                        shoeService.deleteAllShoes();
                        System.out.println("All shoes deleted successfully.");
                    }
                    case 5 -> {
                        System.out.println("Enter your foot volume (High, Medium, Low): ");
                        String footVolume = scanner.nextLine();
                        System.out.println("Enter your foot type (Classic, Square, Centre): ");
                        String footType = scanner.nextLine();
                        shoeService.findAShoe(footVolume, footType);
                        System.out.println("Here are all shoes that will fit your expectations.");
                    }
                    case 6 -> {
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

