package presentation;


import presentation.controllers.*;

import java.util.Scanner;


public class LibraryApp {
    private boolean isRunning = false;
    private final Scanner scanner;

    private final MemberController memberController;
    private final LibrarianController librarianController;
    private final DirectorController directorController;

    private final BookController bookController;
    private final MagazineController magazineController;
    private final DVDController dvdController;


    public LibraryApp() {
        scanner = new Scanner(System.in);

        memberController = new MemberController();
        librarianController = new LibrarianController();
        directorController = new DirectorController();
        bookController = new BookController();
        magazineController = new MagazineController();
        dvdController = new DVDController();
    }

    public void run() {
        isRunning = true;
        displayWelcomeMessage();

        while (isRunning) {
            displayMainMenu();
            int choice = getMenuChoice(4);
            switch (choice) {
                case 1:
                    handleItemsMenu();
                    break;
                case 2:
                    handleUsersMenu();
                    break;
                case 3:
                case 4:
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
        System.out.println("Thank you for using Lend Wise!");
    }

    private void displayWelcomeMessage() {
        System.out.println("======================================");
        System.out.println("  LEND WISE v1.0");
        System.out.println("======================================");
        System.out.println("Welcome to your library management system!");
        System.out.println();
    }
    private void displayMainMenu() {
        System.out.println("\n===== MAIN MENU =====");
        System.out.println("(1) Manage Items");
        System.out.println("(2) Manage Users");
        System.out.println("(3) Transactions");
        System.out.println("(4) Search");
        System.out.println("(0) Exit");
        System.out.print("Enter your choice (0-4): ");
    }
    private int getMenuChoice(int maxOption) {
        int choice = -1;
        try {
            choice = Integer.parseInt(scanner.nextLine());
            System.out.println("Your choice is: " + choice);
            if (choice < 0 || choice > maxOption) {
                System.out.println("Please enter a number between 0 and " + maxOption);
                return -1;
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a valid number");
        }
        return choice;
    }

    private void handleItemsMenu() {
        boolean isItemsMenuRunning = true;
        while (isItemsMenuRunning) {
            System.out.println("\n===== ITEMS MENU =====");
            System.out.println("(1) Book Management");
            System.out.println("(2) DVD Management");
            System.out.println("(3) Magazine Management");
            System.out.println("(0) Return to Main Menu");
            System.out.print("Enter your choice (0-3): ");

            int choice = getMenuChoice(3);
            switch (choice) {
                case 1:
                    handleBooksMenu();
                    break;
                case 2: //TODO: add related handle method
                case 3: //TODO: add related handle method
                    break;
                case 0:
                    isItemsMenuRunning = false;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }
    private void handleBooksMenu() {
        boolean isBooksMenuRunning = true;
        while (isBooksMenuRunning) {
            System.out.println("\n===== BOOKS MENU =====");
            System.out.println("(1) Create New Book");
            System.out.println("(2) View All Books");
            System.out.println("(3) Update Book");
            System.out.println("(4) Remove Book");
            System.out.println("(0) Return to Back");
            System.out.print("Enter your choice (0-4): ");

            int choice = getMenuChoice(4);
            switch (choice) {
                case 1:
                    bookController.create();
                    break;
                case 2:
                    bookController.getAll();
                    break;
                case 3:
                    bookController.update();
                    break;
                case 4:
                    bookController.delete();
                    break;
                case 0:
                    isBooksMenuRunning = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }
    private void handleMagazinesMenu() {} //TODO: Write body of method
    private void handleDVDsMenu() {} //TODO: Write body of method

    private void handleUsersMenu() {
        boolean isUsersMenuRunning = true;
        while (isUsersMenuRunning) {
            System.out.println("\n===== USERS MENU =====");
            System.out.println("(1) Member Management");
            System.out.println("(2) Librarian Management");
            System.out.println("(3) Director Management");
            System.out.println("(0) Return to Main Menu");
            System.out.print("Enter your choice (0-3): ");

            int choice = getMenuChoice(3);
            switch (choice) {
                case 1: //TODO: add related handle method
                case 2: //TODO: add related handle method
                case 3: //TODO: add related handle method
                    break;
                case 0:
                    isUsersMenuRunning = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }
    private void handleMembersMenu() {} //TODO: Write body of method
    private void handleLibrariansMenu() {} //TODO: Write body of method
    private void handleDirectorsMenu() {}//TODO: Write body of method
}
