//To find out whether the given String is Palindrome or not.


import java.util.*;
public class Palindrome{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word=scan.next();
        
        if(IsPalindrome(word)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
    }
    public static boolean IsPalindrome(String word){
        for(int i=0;i<word.length()/2;i++){
            for(int j=word.length()-1;j>i;j--){
                if(word.charAt(i)==word.charAt(j)){
                    return true;
                }else{
                    return false;
                }
            }
        }
        return true;
    }
}