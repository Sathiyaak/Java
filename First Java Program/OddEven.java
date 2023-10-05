
//Write a program to print whether a number is even or odd, also take input from the user.
import java.util.*;
public class OddEven{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println(IsOdd(num));
    }
    public static String IsOdd(int num){
        if(num%2==0){
            return "The number is Even";
        }else{
            return "The number is Odd";
        }
    }
}