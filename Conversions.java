import java.text.DecimalFormat;

class Conversions { 
  
  private static DecimalFormat decimalFormat = new DecimalFormat("#.##");
  
  public static void converter(int choice, double amount) {
    
  switch (choice) {
      case 1:
        usDollarConversion(amount);
        break;
      case 2:
        euroConversion(amount);
        break;
      case 3:
        yenConversion(amount);
        break;
      case 4:
        poundConversion(amount);
        break;
      case 5:
        canadianDollarConversion(amount);
        break;
      case 6:
        australianDollarConversion(amount);
        break;
      case 7:
        swissFrancConversion(amount);
        break;
      case 8:
        ruppeConversion(amount);
        break;
      case 9:
        pesoConversion(amount);
        break;
      case 10:
        rubleConversion(amount);
        break;
      default:
        System.out.println("Incorrect choice try again");
  }
}
  public static void usDollarConversion(double total){
    System.out.println(total + " American Dollar converts too:");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.891) + " Euro");
    System.out.println("");
    System.out.println(decimalFormat.format(total*141.376) + " Yen");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.780) + " Pound Sterling");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.315) + " Canadian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.481) + " Australian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.868) + " Swiss franc");
    System.out.println("");
    System.out.println(decimalFormat.format(total*81.798) + " Indian Ruppe");
    System.out.println("");
    System.out.println(decimalFormat.format(total*16.816) + " Mexican Peso");
    System.out.println("");
    System.out.println(decimalFormat.format(total*90.662) + " Russian Ruble");
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
  public static void euroConversion(double total) {
    System.out.println(total + " Euro converts too:");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.107) + " American Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*156.614) + " Yen");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.863) + " Pound Sterling");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.457) + " Canadian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.639) + " Australian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.962) + " Swiss Franc");
    System.out.println("");
    System.out.println(decimalFormat.format(total*90.591) + " Indian Ruppe");
    System.out.println("");
    System.out.println(decimalFormat.format(total*18.648) + " Mexican Peso");
    System.out.println("");
    System.out.println(decimalFormat.format(total*100.103) + " Russian Ruble");
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
  public static void yenConversion(double total) {
    System.out.println(total + " Japanese Yen converts too:");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.007) + " American Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.006) + " Euro");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.005) + " Pound Sterling");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.009) + " Canadian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.010) + " Australian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.006) + " Swiss franc");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.578) + " Indian Ruppe");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.119) + " Mexican Peso");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.639) + " Russian Ruble");
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
  public static void poundConversion(double total) {
    System.out.println(total + " British Pound Sterling converts too:");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.283) + " American Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.159) + " Euro");
    System.out.println("");
    System.out.println(decimalFormat.format(total*181.369) + " Yen");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.690) + " Canadian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.901) + " Australian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.115) + " Swiss franc");
    System.out.println("");
    System.out.println(decimalFormat.format(total*105.0) + " Indian Ruppe");
    System.out.println("");
    System.out.println(decimalFormat.format(total*21.617) + " Mexican Peso");
    System.out.println("");
    System.out.println(decimalFormat.format(total*116.039) + " Russian Ruble");
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
  public static void canadianDollarConversion(double total) {
    System.out.println(total + " Canadian Dollar converts too:");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.759) + " American Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.686) + " Euro");
    System.out.println("");
    System.out.println(decimalFormat.format(total*107.353) + " Yen");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.591) + " Pound Sterling");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.124) + " Australian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.660) + " Swiss franc");
    System.out.println("");
    System.out.println(decimalFormat.format(total*62.149) + " Indian Ruppe");
    System.out.println("");
    System.out.println(decimalFormat.format(total*12.793) + " Mexican Peso");
    System.out.println("");
    System.out.println(decimalFormat.format(total*68.692) + " Russian Ruble");
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
  public static void australianDollarConversion(double total){
    System.out.println(total + " Australian Dollar converts too:");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.676) + " American Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.610) + " Euro");
    System.out.println("");
    System.out.println(decimalFormat.format(total*95.556) + " Yen");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.526) + " Pound Sterling");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.889) + " Canadian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.587) + " Swiss franc");
    System.out.println("");
    System.out.println(decimalFormat.format(total*55.347) + " Indian Ruppe");
    System.out.println("");
    System.out.println(decimalFormat.format(total*11.389) + " Mexican Peso");
    System.out.println("");
    System.out.println(decimalFormat.format(total*61.155) + " Russian Ruble");
    System.out.println("");
    System.out.println("");
    System.out.println("");
  } 
  public static void swissFrancConversion(double total) {
    System.out.println(total + " Swiss Franc converts too:");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.150) + " American Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.039) + " Euro");
    System.out.println("");
    System.out.println(decimalFormat.format(total*162.602) + " Yen");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.896) + " Pound Sterling");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.514) + " Canadian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.702) + " Australian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*94.145) + " Indian Ruppe");
    System.out.println("");
    System.out.println(decimalFormat.format(total*19.371) + " Mexican Peso");
    System.out.println("");
    System.out.println(decimalFormat.format(total*104.054) + " Russian Ruble");
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
  public static void ruppeConversion(double total) {
    System.out.println(total + " Indian Ruppe converts too:");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.01) + " American Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.011) + " Euro");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.727) + " Yen");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.009) + " Pound Sterling");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.016) + " Canadian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.018) + " Australian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.010) + " Swiss franc");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.205) + " Mexican Peso");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.105) + " Russian Ruble");
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
  public static void pesoConversion(double total) {
    System.out.println(total + " Mexican Peso converts too:");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.05) + " American Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.053) + " Euro");
    System.out.println("");
    System.out.println(decimalFormat.format(total*8.392) + " Yen");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.046) + " Pound Sterling");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.078) + " Canadian Dollar");
    System.out.println("");
  System.out.println(decimalFormat.format(total*0.087) + " Australian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.05) + " Swiss franc");
    System.out.println("");
    System.out.println(decimalFormat.format(total*4.857) + " Indian Ruppe");
    System.out.println("");
    System.out.println(decimalFormat.format(total*5.370) + " Russian Ruble");
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
  public static void rubleConversion(double total) {
    System.out.println(total + " Russian Ruble converts too:");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.011) + " American Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.009) + " Euro");
    System.out.println("");
    System.out.println(decimalFormat.format(total*1.563) + " Yen");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.008) + " Pound Sterling");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.014) + " Canadian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.01) + " Australian Dollar");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.01) + " Swiss franc");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.904) + " Indian Ruppe");
    System.out.println("");
    System.out.println(decimalFormat.format(total*0.186) + " Mexican Peso");
    System.out.println("");
    System.out.println("");
    System.out.println("");
  }
}