//To find Armstrong Number between two given number.

import java.util.*;

public class Armstrong{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        findAmstrong(num1,num2);
    }
    public static void findAmstrong(int num1,int num2){
        for(int i=num1; i<num2; i++){
            int temp=i;
            int count=0;
            while(temp!=0){
                temp=temp/10;
                count++;
            }

            int temp1=i;
            int sum=0;
            while(temp1!=0){
                int digit=temp1%10;
                sum+=Math.pow(digit,count);
                temp1=temp1/10;
            }

            if(sum==i){
                System.out.print(i+" ");
            }
        }
    }
}