import java.io.*;
import java.util.*;

public class Anagram {

    
        public static String isAnagram(String a,String b){
            a=a.toLowerCase();
            b=b.toLowerCase();
            if(a.length()!=b.length()){
                return "Not Anagrams";
            }
            char[] arr1=a.toCharArray();
            char[] arr2=b.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            return Arrays.equals(arr1, arr2)? "Anagrams":"Not Anagrams";          
            }
            
        
        public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        System.out.println(isAnagram(a,b));
        
    }
}
