package idea.project.java.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> bookNames = new ArrayList<>();
        List<String> authorNames = new ArrayList<>();
        List<Boolean> availabilityStatus = new ArrayList<>();

        bookNames.add("Java Basics");
        authorNames.add("Mohammad ali");
        availabilityStatus.add(true);

        bookNames.add("Python Guide");
        authorNames.add("Fatma Ahmed");
        availabilityStatus.add(true);

        bookNames.add("Database Systems");
        authorNames.add("Hassan Saleem");
        availabilityStatus.add(false);

        bookNames.add("Web Development");
        authorNames.add("Ali Mohammed");
        availabilityStatus.add(true);

        bookNames.add("Cyber Security");
        authorNames.add("Omar Khalid");
        availabilityStatus.add(false);

        bookNames.add("Networking Fundamentals");
        authorNames.add("Fatma Said");
        availabilityStatus.add(true);

        bookNames.add("Data Structures");
        authorNames.add("Ahmed Nasser");
        availabilityStatus.add(true);

        bookNames.add("Operating Systems");
        authorNames.add("Mariam Ali");
        availabilityStatus.add(false);

        bookNames.add("Software Engineering");
        authorNames.add("Yousef Hamad");
        availabilityStatus.add(true);

        bookNames.add("Artificial Intelligence");
        authorNames.add("Huda Rashid");
        availabilityStatus.add(true);


        int choice;


        do {
            IO.println("\n===== Library Management System =====");
            IO.println("1. Display all books");
            IO.println("2. Search for a book");
            IO.println("3. Borrow a book");
            IO.println("4. Return a book");
            IO.println("5. Display library report");
            IO.println("6. Exit the program");
            IO.println("Enter your choice: ");

            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 1:
                    displayBooks(bookNames, authorNames, availabilityStatus);
                    break;
                case 2:
                    IO.println("Enter book name to search: ");
                    String searchName = input.nextLine();
                    searchBook(bookNames, searchName);
                    break;
                case 3:
                    IO.println("Enter book name to borrow: ");
                    String borrowName = input.nextLine();
                    borrowBook(bookNames, availabilityStatus, borrowName);
                    break;
                case 4:
                    IO.println("Enter book name to return: ");
                    String returnName = input.nextLine();
                    returnBook(bookNames, availabilityStatus, returnName);
                    break;
                case 5:
                    displayReport(bookNames, availabilityStatus);
                    break;
                case 6:
                    IO.println("Exiting the program...");
                    break;
                default:
                    IO.println("Invalid choice. Please try again.");
            }

        } while (choice != 6);
        input.close();
    }
    public static void displayBooks(List<String> bookNames, List<String> authorNames, List<Boolean> availabilityStatus) {

        IO.println("\n===== Book List =====");
        for (int i = 0; i < bookNames.size(); i++) {
            IO.println("Book " + (i + 1));
            IO.println("Book Name: " + bookNames.get(i));
            IO.println("Author Name: " + authorNames.get(i));

            if (availabilityStatus.get(i)) {
                IO.println("Status: Available");
            } else {
                IO.println("Status: Unavailable");
            }

        }
    }

    public static void searchBook(List<String> bookNames, String bookName) {
        boolean found = false;
        for (String name : bookNames) {
            if (name.equalsIgnoreCase(bookName)) {
                found = true;
                break;
            }
        }
        if (found) {
            IO.println("The book exists in the library.");
        } else {
            IO.println("The book does not exist in the library.");
        }
    }
    public static void borrowBook(List<String> bookNames, List<Boolean> availabilityStatus, String bookName) {

        for (int i = 0; i < bookNames.size(); i++) {
            if (bookNames.get(i).equalsIgnoreCase(bookName)) {
                if (availabilityStatus.get(i)) {
                    availabilityStatus.set(i, false);
                    IO.println("Book borrowed successfully.");
                } else {
                    IO.println("This book is already unavailable.");
                }

                return;
            }
        }

        IO.println("Book not found.");
    }
    public static void returnBook(List<String> bookNames, List<Boolean> availabilityStatus,
                                  String bookName) {

        for (int i = 0; i < bookNames.size(); i++) {
            if (bookNames.get(i).equalsIgnoreCase(bookName)) {
                availabilityStatus.set(i, true);
                IO.println("Book returned successfully.");
                return;
            }
        }
        IO.println("Book not found.");
    }
    public static int countAvailableBooks(List<Boolean> availabilityStatus) {
        int availableCount = 0;

        for (boolean status : availabilityStatus) {
            if (status) {
                availableCount++;
            }
        }

        return availableCount;
    }
    public static int countUnavailableBooks(List<Boolean> availabilityStatus) {
        int unavailableCount = 0;
        for (boolean status : availabilityStatus) {
            if (!status) {
                unavailableCount++;
            }
        }
        return unavailableCount;
    }
    public static void displayReport(List<String> bookNames, List<Boolean> availabilityStatus) {
        int totalBooks = bookNames.size();
        int availableBooks = countAvailableBooks(availabilityStatus);
        int unavailableBooks = countUnavailableBooks(availabilityStatus);
        System.out.println("\n===== Library Report =====");
        System.out.println("Total Number of Books: " + totalBooks);
        System.out.println("Available Books Count: " + availableBooks);
        System.out.println("Unavailable Books Count: " + unavailableBooks);
    }
}
