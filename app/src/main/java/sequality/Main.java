package sequality;

public class Main {
  public static void main(String[] args) {
    // App
    System.out.println(new App().getGreeting());

    // Caluculate
    Calculate cal = new Calculate();
    System.out.println("Sum of 2 and 3 is " + cal.sum(2, 3) + ". Average is " + cal.ave(2, 3) + ".");
    System.out.println("Sum of 1 to 10 is " + cal.sumAll(1, 10) + ". Average is " + cal.ave(1, 10) + ".");
    System.out
        .println("Sum of odd of 1 to 10 is " + cal.sumOdd(1, 10) + ". Sum of even is " + cal.sumEven(1, 10) + ".");

  }
}
