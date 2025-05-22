import java.io.*;
import java.util.*;
import java.util.regex.*;

public class isValidRegex {
    public static boolean isRegex(String a){
        try{
            Pattern.compile(a);
            return true;
        }
        catch(PatternSyntaxException e){
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.nextLine();
        for(int i=0;i<n;i++){      
            String a=s.nextLine();
            System.out.println(isRegex(a)?"Valid":"Invalid");
        }       
    }
}
