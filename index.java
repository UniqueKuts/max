import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Order {
    private String itemName;
    private int quantity;

    public Order(String itemName, int quantity) {
        this.itemName = itemName;
        this.quantity = quantity;
    }

    // Getters and setters
}

class Comment {
    private String comment;

    public Comment(String comment) {
        this.comment = comment;
    }

    // Getter and setter
}

class Rating {
    private int rating;

    public Rating(int rating) {
        this.rating = rating;
    }

    // Getter and setter
}

public class DiagnosticsCenter {
    private static List<Order> orders = new ArrayList<>();
    private static List<Comment> comments = new ArrayList<>();
    private static List<Rating> ratings = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Place an order");
            System.out.println("2. Leave a comment");
            System.out.println("3. Rate our service");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    placeOrder(scanner);
                    break;
                case 2:
                    leaveComment(scanner);
                    break;
                case 3:
                    rateService(scanner);
                    break;
                case 4:
                    System.out.println("Thank you for visiting Maxon Healthcare Diagnostics Center!");
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
    }

    private static void placeOrder(Scanner scanner) {
        System.out.print("Enter item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Order order = new Order(itemName, quantity);
        orders.add(order);
        System.out.println("Order placed successfully!");
    }

    private static void leaveComment(Scanner scanner) {
        System.out.print("Enter your comment: ");
        String commentText = scanner.nextLine();

        Comment comment = new Comment(commentText);
        comments.add(comment);
        System.out.println("Thank you for your comment!");
    }

    private static void rateService(Scanner scanner) {
        System.out.print("Enter your rating (1-5): ");
        int ratingValue = scanner.nextInt();

        if (ratingValue < 1 || ratingValue > 5) {
            System.out.println("Invalid rating. Please enter a number between 1 and 5.");
            return;
        }

        Rating rating = new Rating(ratingValue);
        ratings.add(rating);
        System.out.println("Thank you for your rating!");
    }
}
