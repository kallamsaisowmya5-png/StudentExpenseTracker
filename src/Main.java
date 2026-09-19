import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> expenseNames = new ArrayList<>();
        ArrayList<Integer> amounts = new ArrayList<>();
        int choice = 0;
        while (choice != 4) {
            System.out.println("\n===== STUDENT EXPENSE TRACKER =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expenses");
            System.out.println("3. Show Total");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = sc.nextInt();
            if (choice == 1) {
                sc.nextLine();

                System.out.println("Enter expense name:");
                String expenseName = sc.nextLine();

                System.out.println("Enter amount:");
                int amount = sc.nextInt();

                if (amount <= 0) {
                    System.out.println("Invalid amount. Amount must be greater than 0.");
                } else {
                    expenseNames.add(expenseName);
                    amounts.add(amount);

                    System.out.println("Expense added successfully!");
                    System.out.println("Expense: " + expenseName + " - Rs" + amount);
                }

            } else if (choice == 2) {
                System.out.println("\n===== YOUR EXPENSES =====");

                if (expenseNames.isEmpty()) {
                    System.out.println("No expenses added yet.");
                } else {
                    for (int i = 0; i < expenseNames.size(); i++) {
                        System.out.println(
                                (i + 1) + ". " +
                                        expenseNames.get(i) + " - Rs" +
                                        amounts.get(i)
                        );
                    }
                }

            } else if (choice == 3) {
                int total = 0;

                for (int amount : amounts) {
                    total = total + amount;
                }

                System.out.println("Total Expenses: Rs" + total);

            } else if (choice == 4) {
                System.out.println("Thank you for using Student Expense Tracker!");

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        sc.close();
    }
}