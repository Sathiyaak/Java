//Input currency in rupees and output in USD.
 import java.util.*;

 public class ConvertRupees{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount to be converted to USD: ");
        double rupees=scan.nextDouble();
        double ExchangeRate=0.0120118; //as of date 4/oct/2023 ,may vary
        System.out.println("The Equivalent to Indian rupees in USD is: "+rupees*ExchangeRate);
    }
 }