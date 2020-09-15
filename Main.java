import java.util.Scanner;

/**
 * Calculates how much discount the customer gets
 * @author Rose
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input
    Scanner input = new Scanner(System.in);

    // ask how much the customer spent
    System.out.println("Please enter the amount the customer spent");
    int customerSpend = input.nextInt();

    //check to see how much discount they get depending on how much they spent
    if (0.01 <= customerSpend && customerSpend <= 40.00) {
      double discount = customerSpend * 0.10;
      System.out.println("They will receive 10% off.");
      System.out.println("They will save $" + discount);
      double total = customerSpend - discount;
      System.out.println("The new total is $" + total);
    } else if (40.01 <= customerSpend && customerSpend <= 80.00) {
      double discount = customerSpend * 0.20;
      System.out.println("They will receive 20% off.");
      System.out.println("They will save $" + discount);
      double total = customerSpend - discount;
      System.out.println("The new total is $" + total);
    } else if (80.01 <= customerSpend && customerSpend <= 120.00) {
      double discount = customerSpend * 0.30;
      System.out.println("They will receive 30% off.");
      System.out.println("They will save $" + discount);
      double total = customerSpend - discount;
      System.out.println("The new total is $" + total);
    } else if (120.00 < customerSpend ) {
      double discount = customerSpend * 0.40;
      System.out.println("They will receive 40% off.");
      System.out.println("They will save $" + discount);
      double total = customerSpend - discount;
      System.out.println("The new total is $" + total);
    }
      
  }
}
