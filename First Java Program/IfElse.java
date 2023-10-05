//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.*;

public class IfElse{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        if(num1*num2<100){
            System.out.println("Hi");
        }else if(num1%5==0){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }
    }
}