import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.text.DecimalFormat;

public class CurrencyConverterMain {
  private static Scanner scanner;
  private static Map<String, Double> conversionRates;
  private static DecimalFormat decimalFormat = new DecimalFormat("#.##");
  
  public static void main(String[] args) {
    scanner = new Scanner(System.in);
    initialConversion();
    run();
  }

  public static void run() {
    do {
      System.out.println("--------------------------------");
      System.out.println("      Currency Converter        ");
      System.out.println("--------------------------------");
      System.out.println("");
      System.out.println("");
      System.out.println("Enter Inital Currency Abbreviation from the list below:");
      System.out.println("");
      System.out.println("");
      converterMenu();
      System.out.println("Enter END to exit:");
      String choice = scanner.next().toUpperCase();

      if (choice.equals("END")) {
      System.out.println("Exiting Currency Converter...");
      break;
    }

    if(!conversionRates.containsKey(choice)) {
      System.out.println("Incorrect input, please input a currency abbreviation to continue or END to exit the program:");
      continue;
}
      System.out.println("Enter the amount:");
      double amount = scanner.nextDouble();

      System.out.println("Enter the abbreviated currency needing to convert into:");
      String choice2 = scanner.next().toUpperCase();

      double convertedAmt = currencyConversion(amount, choice, choice2);
      System.out.println(amount + " " + choice + " converts into " + decimalFormat.format(convertedAmt) + " " + choice2);
      System.out.println("");
      System.out.println("");
      System.out.println("");
  } while (true);
}
  private static void initialConversion() {
    conversionRates = new HashMap<>();

        // Conversion rates for: USD
        conversionRates.put("USD", 1.0);
        conversionRates.put("EUR", 0.891);
        conversionRates.put("JPY", 141.376);
        conversionRates.put("GBP", 0.780);
        conversionRates.put("CAD", 1.315);
        conversionRates.put("AUD", 1.481);
        conversionRates.put("CHF", 0.868);
        conversionRates.put("INR", 81.798);
        conversionRates.put("MXN", 16.816);
        conversionRates.put("RUB", 90.662);

        // Conversion rates for: EUR
        conversionRates.put("EUR", 1.0);
        conversionRates.put("USD", 1.107);
        conversionRates.put("JPY", 156.614);
        conversionRates.put("GBP", 0.863);
        conversionRates.put("CAD", 1.457);
        conversionRates.put("AUD", 1.639);
        conversionRates.put("CHF", 0.962);
        conversionRates.put("INR", 90.591);
        conversionRates.put("MXN", 18.648);
        conversionRates.put("RUB", 100.103);


         // Conversion rates for: JPY
        conversionRates.put("JPY", 1.0);
        conversionRates.put("EUR", 0.006);
        conversionRates.put("USD", 0.007);
        conversionRates.put("GBP", 0.005);
        conversionRates.put("CAD", 0.009);
        conversionRates.put("AUD", 0.010);
        conversionRates.put("CHF", 0.006);
        conversionRates.put("INR", 0.578);
        conversionRates.put("MXN", 0.119);
        conversionRates.put("RUB", 0.639);

        // Conversion rates for: GBP
        conversionRates.put("GBP", 1.0);
        conversionRates.put("EUR", 1.159);
        conversionRates.put("JPY", 181.369);
        conversionRates.put("USD", 1.283);
        conversionRates.put("CAD", 1.690);
        conversionRates.put("AUD", 1.901);
        conversionRates.put("CHF", 1.115);
        conversionRates.put("INR", 105.0);
        conversionRates.put("MXN", 21.617);
        conversionRates.put("RUB", 116.039);
    
        // Conversion rates for: CAD
        conversionRates.put("CAD", 1.0);
        conversionRates.put("EUR", 0.686);
        conversionRates.put("JPY", 107.353);
        conversionRates.put("GBP", 0.591);
        conversionRates.put("USD", 0.759);
        conversionRates.put("AUD", 1.124);
        conversionRates.put("CHF", 0.660);
        conversionRates.put("INR", 62.149);
        conversionRates.put("MXN", 12.793);
        conversionRates.put("RUB", 68.692);
    
        //Conversion rates for: AUD
        conversionRates.put("AUD", 1.0);
        conversionRates.put("EUR", 0.610);
        conversionRates.put("JPY", 95.556);
        conversionRates.put("GBP", 0.526);
        conversionRates.put("CAD", 0.889);
        conversionRates.put("USD", 0.676);
        conversionRates.put("CHF", 0.587);
        conversionRates.put("INR", 55.347);
        conversionRates.put("MXN", 11.389);
        conversionRates.put("RUB", 61.155);

        //Conversion rates for: CHF
        conversionRates.put("CHF", 1.0);
        conversionRates.put("EUR", 1.039);
        conversionRates.put("JPY", 162.602);
        conversionRates.put("GBP", 0.896);
        conversionRates.put("CAD", 1.514);
        conversionRates.put("AUD", 1.702);
        conversionRates.put("USD", 1.150);
        conversionRates.put("INR", 94.145);
        conversionRates.put("MXN", 19.371);
        conversionRates.put("RUB", 104.054);

        //Conversion rates for: INR
        conversionRates.put("INR", 1.0);
        conversionRates.put("EUR", 0.011);
        conversionRates.put("JPY", 1.727);
        conversionRates.put("GBP", 0.009);
        conversionRates.put("CAD", 0.016);
        conversionRates.put("AUD", 0.018);
        conversionRates.put("CHF", 0.010);
        conversionRates.put("USD", 0.01);
        conversionRates.put("MXN", 0.205);
        conversionRates.put("RUB", 1.105);

        //Conversion rates for: MXN
        conversionRates.put("MXN", 1.0);
        conversionRates.put("EUR", 0.053);
        conversionRates.put("JPY", 8.392);
        conversionRates.put("GBP", 0.046);
        conversionRates.put("CAD", 0.078);
        conversionRates.put("AUD", 0.087);
        conversionRates.put("CHF", 0.05);
        conversionRates.put("INR", 4.857);
        conversionRates.put("USD", 0.05);
        conversionRates.put("RUB", 5.370);

        //Conversion rates for: RUB
        conversionRates.put("RUB", 1.0);
        conversionRates.put("EUR", 0.009);
        conversionRates.put("JPY", 1.563);
        conversionRates.put("GBP", 0.008);
        conversionRates.put("CAD", 0.014);
        conversionRates.put("AUD", 0.01);
        conversionRates.put("CHF", 0.01);
        conversionRates.put("INR", 0.904);
        conversionRates.put("MXN", 0.186);
        conversionRates.put("USD", 0.011);

  }

  private static double currencyConversion(double amount, String first, String second) {
    double firstconversion = conversionRates.get(first);
    double secondconversion = conversionRates.get(second);

    return amount * (secondconversion / firstconversion);
  }
  public static void converterMenu() {
  
      System.out.println("(USD): American Dollar");
      System.out.println("(EUR): Euro");
      System.out.println("(JPY): Japanese Yen");
      System.out.println("(GBP): Pound sterling");
      System.out.println("(CAD): Canadian Dollar ");
      System.out.println("(AUD): Australian Dollar");
      System.out.println("(CHF): Swiss franc");
      System.out.println("(INR): Indian Ruppe");
      System.out.println("(MXN): Mexican Peso ");
      System.out.println("(RUB): Russian Ruble");
      System.out.println("");
  }
}