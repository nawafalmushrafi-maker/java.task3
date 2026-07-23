package idea.project.java.task3;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductInventorySystem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<String> productNames = new ArrayList<>();
        List<Double> productPrices = new ArrayList<>();
        List<Integer> productQuantities = new ArrayList<>();
        int productCount = 10;
        for (int i = 0; i < productCount; i++) {
            IO.println("Product Name: ");
            String productName = input.nextLine();

            IO.println("Product Price: ");
            double productPrice = input.nextDouble();

            IO.println("Product Quantity: ");
            int productQuantity = input.nextInt();

            input.nextLine();
            productNames.add(productName);
            productPrices.add(productPrice);
            productQuantities.add(productQuantity);
            System.out.println();
        }

        double totalValue = calculateTotalValue(productPrices, productQuantities);
        String mostExpensiveProduct = findMostExpensiveProduct(productNames, productPrices);
        displayReport(productNames, productPrices, productQuantities, totalValue, mostExpensiveProduct);
        input.close();
    }
    public static double calculateTotalValue(List<Double> productPrices, List<Integer> productQuantities) {
        double totalValue = 0;
        for (int i = 0; i < productPrices.size(); i++) {
            totalValue = totalValue + (productPrices.get(i) * productQuantities.get(i));
        }

        return totalValue;
    }
    public static String checkStockStatus(int quantity) {
        if (quantity > 10) {
            return "High Stock";
        } else if (quantity >= 1) {
            return "Available";
        } else {
            return "Out of Stock";
        }
    }
    public static int countAvailableProducts(List<Integer> productQuantities) {
        int availableCount = 0;
        for (int quantity : productQuantities) {
            if (quantity > 0) {
                availableCount++;
            }
        }

        return availableCount;
    }
    public static int countOutOfStockProducts(List<Integer> productQuantities) {
        int outOfStockCount = 0;
        for (int quantity : productQuantities) {
            if (quantity == 0) {
                outOfStockCount++;
            }
        }

        return outOfStockCount;
    }
    public static String findMostExpensiveProduct(List<String> productNames, List<Double> productPrices) {
        double highestPrice = productPrices.get(0);
        String mostExpensiveProduct = productNames.get(0);
        for (int i = 1; i < productPrices.size(); i++) {
            if (productPrices.get(i) > highestPrice) {
                highestPrice = productPrices.get(i);
                mostExpensiveProduct = productNames.get(i);
            }
        }

        return mostExpensiveProduct;
    }
    public static void displayReport(List<String> productNames, List<Double> productPrices,
                                     List<Integer> productQuantities, double totalValue,
                                     String mostExpensiveProduct) {

        IO.println(" Product Inventory Report ");

        for (int i = 0; i < productNames.size(); i++) {
            System.out.println("Product " + (i + 1));
            System.out.println("Name: " + productNames.get(i));
            System.out.println("Price: " + productPrices.get(i));
            System.out.println("Quantity: " + productQuantities.get(i));
            System.out.println("Stock Status: " + checkStockStatus(productQuantities.get(i)));
            System.out.println("-----------------------------");
        }
        int availableProducts = countAvailableProducts(productQuantities);
        int outOfStockProducts = countOutOfStockProducts(productQuantities);
        System.out.println("Total Inventory Value: " + totalValue);
        System.out.println("Number of Available Products: " + availableProducts);
        System.out.println("Number of Out-of-Stock Products: " + outOfStockProducts);
        System.out.println("Most Expensive Product: " + mostExpensiveProduct);
    }
}


