//To calculate Fibonacci Series up to n numbers.

import java.util.*;

public class Fibonacci{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num=scan.nextInt();
        int a=-1;
        int b=1;
        int sum=0;
        for(int i=0;i<=5;i++){
            sum=a+b;
            System.out.print(sum+" ");
            a=b;
            b=sum;
            sum=0;
        }

    }
}