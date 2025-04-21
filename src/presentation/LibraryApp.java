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
                case 2:
                    handleDVDsMenu();
                    break;
                case 3:
                    handleMagazinesMenu();
                    break;
                case 0:
                    isItemsMenuRunning = false;
                    break;
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

    private void handleMagazinesMenu() {
        boolean isMagazinesMenuRunning = true;
        while (isMagazinesMenuRunning) {
            System.out.println("\n===== MAGAZINES MENU =====");
            System.out.println("(1) Create New Magazine");
            System.out.println("(2) View All Magazines");
            System.out.println("(3) Update Magazine");
            System.out.println("(4) Remove Magazine");
            System.out.println("(0) Return to Back");
            System.out.print("Enter your choice (0-4): ");

            int choice = getMenuChoice(4);
            switch (choice) {
                case 1:
                    magazineController.create();
                    break;
                case 2:
                    magazineController.getAll();
                    break;
                case 3:
                    magazineController.update();
                    break;
                case 4:
                    magazineController.delete();
                    break;
                case 0:
                    isMagazinesMenuRunning = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }

    private void handleDVDsMenu() {
        boolean isDVDMenuRunning = true;
        while (isDVDMenuRunning) {
            System.out.println("\n===== DVD MENU =====");
            System.out.println("(1) Create New DVD");
            System.out.println("(2) View All DVDs");
            System.out.println("(3) Update DVD");
            System.out.println("(4) Remove DVD");
            System.out.println("(0) Return to Back");
            System.out.print("Enter your choice (0-4): ");

            int choice = getMenuChoice(4);
            switch (choice) {
                case 1:
                    dvdController.create();
                    break;
                case 2:
                    dvdController.getAll();
                    break;
                case 3:
                    dvdController.update();
                    break;
                case 4:
                    dvdController.delete();
                    break;
                case 0:
                    isDVDMenuRunning = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }

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
                case 1:
                    handleMembersMenu();
                    break;
                case 2:
                    handleLibrariansMenu();
                    break;
                case 3:
                    handleDirectorsMenu();
                    break;
                case 0:
                    isUsersMenuRunning = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }

    private void handleMembersMenu() {
        boolean isMembersMenuRunning = true;
        while (isMembersMenuRunning) {
            System.out.println("\n===== MEMBERS MENU =====");
            System.out.println("(1) Create New Member");
            System.out.println("(2) View All Members");
            System.out.println("(3) Update Member");
            System.out.println("(4) Remove Member");
            System.out.println("(0) Return to Back");
            System.out.print("Enter your choice (0-4): ");

            int choice = getMenuChoice(4);
            switch (choice) {
                case 1:
                    memberController.create();
                    break;
                case 2:
                    memberController.getAll();
                    break;
                case 3:
                    memberController.update();
                    break;
                case 4:
                    memberController.delete();
                    break;
                case 0:
                    isMembersMenuRunning = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }

    private void handleLibrariansMenu() {
        boolean isLibrariansMenuRunning = true;
        while (isLibrariansMenuRunning) {
            System.out.println("\n===== LIBRARIANS MENU =====");
            System.out.println("(1) Create New Librarian");
            System.out.println("(2) View All Librarians");
            System.out.println("(3) Update Librarian");
            System.out.println("(4) Remove Librarian");
            System.out.println("(0) Return to Back");
            System.out.print("Enter your choice (0-4): ");

            int choice = getMenuChoice(4);
            switch (choice) {
                case 1:
                    librarianController.create();
                    break;
                case 2:
                    librarianController.getAll();
                    break;
                case 3:
                    librarianController.update();
                    break;
                case 4:
                    librarianController.delete();
                    break;
                case 0:
                    isLibrariansMenuRunning = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }

    private void handleDirectorsMenu() {
        boolean isDirectorsMenuRunning = true;
        while (isDirectorsMenuRunning) {
            System.out.println("\n===== DIRECTORS MENU =====");
            System.out.println("(1) Create New Director");
            System.out.println("(2) View All Directors");
            System.out.println("(3) Update Director");
            System.out.println("(4) Remove Director");
            System.out.println("(0) Return to Back");
            System.out.print("Enter your choice (0-4): ");

            int choice = getMenuChoice(4);
            switch (choice) {
                case 1:
                    directorController.create();
                    break;
                case 2:
                    directorController.getAll();
                    break;
                case 3:
                    directorController.update();
                    break;
                case 4:
                    directorController.delete();
                    break;
                case 0:
                    isDirectorsMenuRunning = false;
                    break;
                default:
                    System.out.println("Please enter a valid choice");
            }
        }
    }
}
