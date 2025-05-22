import java.io.*;
import java.util.*;

public class Palindrome {
    public static String isPalindrome(String a){
        int n=a.length();
        for(int i=0;i<n/2;i++){
            if(a.charAt(i)!=a.charAt(n-1-i)){
                return "No";
            }
            
        }
        return"Yes";
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        System.out.println(isPalindrome(a));               
    }
}
