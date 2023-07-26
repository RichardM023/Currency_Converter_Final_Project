import java.util.Scanner;

public class CurrencyConverterBasic {
  private static Scanner scanner;
  
public static void main(String[] args) {
    scanner = new Scanner(System.in);
    run();
}
public static void run(){
    int choice;
    do {
    System.out.println("------------------------");
    System.out.println("   Currency Converter   ");
    System.out.println("------------------------");
    converterMenu();
    System.out.println("Enter choice from 1-10 to begin converting the currency:");
    System.out.println("Enter 11 to exit:");
    choice = scanner.nextInt();
      
    if (choice == 11) {
      System.out.println("Exiting Currency Converter...");
      break;
    }

    if(choice < 1 || choice > 10) {
      System.out.println("Incorrect choice. Please input a number from 1-10 to continue");
      continue;
    }
      System.out.println("Enter the amount:");
      double amount = scanner.nextDouble();

      Conversions.converter(choice, amount);
        
  }   while (true);
}
  
  public static void converterMenu() {
  
      System.out.println("1: American Dollar");
      System.out.println("2: Euro");
      System.out.println("3: Japanese Yen");
      System.out.println("4: Pound sterling");
      System.out.println("5: Canadian Dollar ");
      System.out.println("6: Australian Dollar");
      System.out.println("7: Swiss franc");
      System.out.println("8: Indian Ruppe");
      System.out.println("9: Mexican Peso ");
      System.out.println("10: Russian Ruble");
      System.out.println("");
  }
}
