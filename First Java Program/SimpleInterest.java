//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.*;

public class SimpleInterest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int principle = scan.nextInt();
        int rate= scan.nextInt();
        int time =scan.nextInt();
        System.out.println(CalculateSI(principle,rate,time));
    }

    public static float CalculateSI(int principle,int rate,int time){
        float Si=(principle*rate*time)/100;
        return Si;
    }
}