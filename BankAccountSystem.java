package idea.project.java.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccountSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Integer> accountNumbers = new ArrayList<>();
        List<String> customerNames = new ArrayList<>();
        List<Double> balances = new ArrayList<>();
        accountNumbers.add(1001);
        customerNames.add("Nawaf");
        balances.add(500.0);
        accountNumbers.add(1002);
        customerNames.add("Mohammed");
        balances.add(1200.0);
        accountNumbers.add(1003);
        customerNames.add("Ali");
        balances.add(300.0);
        accountNumbers.add(1004);
        customerNames.add("Saleem");
        balances.add(2500.0);
        accountNumbers.add(1005);
        customerNames.add("Fatma");
        balances.add(900.0);
        accountNumbers.add(1006);
        customerNames.add("Sami");
        balances.add(1500.0);
        accountNumbers.add(1007);
        customerNames.add("Khaled");
        balances.add(700.0);
        accountNumbers.add(1008);
        customerNames.add("Yousef");
        balances.add(3200.0);
        accountNumbers.add(1009);
        customerNames.add("Alaa");
        balances.add(100.0);
        accountNumbers.add(1010);
        customerNames.add("John ");
        balances.add(1800.0);
        int choice = 0;
        while (choice != 6) {
            IO.println("\n Bank Account System ");
            IO.println("1. Display all accounts");
            IO.println("2. Deposit money");
            IO.println("3. Withdraw money");
            IO.println("4. Check account balance");
            IO.println("5. Display account statistics");
            IO.println("6. Exit");
            IO.println("Choose: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    displayAccounts(accountNumbers, customerNames, balances);
                    break;
                case 2:
                    IO.println("Enter account number: ");
                    int depositAccount = input.nextInt();

                    IO.println("Enter deposit amount: ");
                    double depositAmount = input.nextDouble();

                    depositMoney(accountNumbers, balances, depositAccount, depositAmount);
                    break;
                case 3:
                    IO.println("Enter account number: ");
                    int withdrawAccount = input.nextInt();

                    IO.println("Enter withdrawal amount: ");
                    double withdrawAmount = input.nextDouble();

                    withdrawMoney(accountNumbers, balances, withdrawAccount, withdrawAmount);
                    break;
                case 4:
                    IO.println("Enter account number: ");
                    int balanceAccount = input.nextInt();

                    checkBalance(accountNumbers, balances, balanceAccount);
                    break;
                case 5:
                    calculateStatistics(balances);
                    break;
                case 6:
                    IO.println("Program closed.");
                    break;
                default:
                    IO.println("Invalid choice. Please try again.");
            }
        }
        input.close();
    }
    public static void displayAccounts(List<Integer> accountNumbers, List<String> customerNames,
                                       List<Double> balances) {

        System.out.println("\n===== Account List =====");
        for (int i = 0; i < accountNumbers.size(); i++) {
            System.out.println("Account Number: " + accountNumbers.get(i));
            System.out.println("Customer Name: " + customerNames.get(i));
            System.out.println("Balance: " + balances.get(i));
            System.out.println("-------------------------");
        }
    }
    public static void depositMoney(List<Integer> accountNumbers, List<Double> balances, int accountNumber, double amount) {
        for (int i = 0; i < accountNumbers.size(); i++) {
            if (accountNumbers.get(i) == accountNumber) {
                balances.set(i, balances.get(i) + amount);
                System.out.println("Deposit successful.");
                System.out.println("New Balance: " + balances.get(i));
                return;
            }
        }
        System.out.println("Account not found.");
    }
    public static void withdrawMoney(List<Integer> accountNumbers, List<Double> balances, int accountNumber, double amount) {
        for (int i = 0; i < accountNumbers.size(); i++) {
            if (accountNumbers.get(i) == accountNumber) {
                if (balances.get(i) >= amount) {
                    balances.set(i, balances.get(i) - amount);
                    System.out.println("Withdrawal successful.");
                    System.out.println("New Balance: " + balances.get(i));
                } else {
                    System.out.println("Not enough balance.");
                }
                return;
            }
        }
        System.out.println("Account not found.");
    }
    public static void checkBalance(List<Integer> accountNumbers, List<Double> balances, int accountNumber) {
        for (int i = 0; i < accountNumbers.size(); i++) {
            if (accountNumbers.get(i) == accountNumber) {
                System.out.println("Current Balance: " + balances.get(i));
                return;
            }
        }
        System.out.println("Account not found.");
    }
    public static void calculateStatistics(List<Double> balances) {
        double totalMoney = 0;
        double highestBalance = balances.get(0);
        double lowestBalance = balances.get(0);
        int aboveAmountCount = 0;
        double specificAmount = 1000;
        for (double balance : balances) {
            totalMoney = totalMoney + balance;
            if (balance > highestBalance) {
                highestBalance = balance;
            }
            if (balance < lowestBalance) {
                lowestBalance = balance;
            }

            if (balance > specificAmount) {
                aboveAmountCount++;
            }
        }
        System.out.println("\n===== Account Statistics =====");
        System.out.println("Total Money in All Accounts: " + totalMoney);
        System.out.println("Highest Account Balance: " + highestBalance);
        System.out.println("Lowest Account Balance: " + lowestBalance);
        System.out.println("Accounts Above " + specificAmount + ": " + aboveAmountCount);
    }
}

