import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=s.nextInt();
        String a=Integer.toString(i);
        if(a.equals(Integer.toString(i))){
            System.out.println("Good job");
        }else{
            System.out.println("Wrong answer");
        }
        
    }
}
