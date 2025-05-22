import java.io.*;
import java.util.*;
import java.util.regex.*;
class IsRegex{
    public static final String expression="^[a-zA-Z][a-zA-Z0-9_]{7,29}$";
}
public class IsRegexValid {
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=Integer.parseInt(s.nextLine());
       
       for(int i=0;i<n;i++){
        String a=s.nextLine();
        if(Pattern.matches(IsRegex.expression,a)){
            System.out.println("Valid");
        }else{
            System.out.println("Invalid");
        }
       }
       
    }
}
