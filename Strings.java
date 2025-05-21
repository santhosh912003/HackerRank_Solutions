import java.io.*;
import java.util.*;

public class Strings {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String word1=s.nextLine();
        String word2=s.nextLine();
        int sum=word1.length()+word2.length();
        System.out.println(sum);
        System.out.println(word1.compareTo(word2)>0?"Yes" :"No");
        String cap1=word1.substring(0,1).toUpperCase()+word1.substring(1);
        String cap2=word2.substring(0,1).toUpperCase()+word2.substring(1);
        System.out.println(cap1+" "+cap2);
    }
}
