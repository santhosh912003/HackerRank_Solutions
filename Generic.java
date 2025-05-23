import java.io.*;
import java.util.*;

class Print{
    public static <T> void printarray(T[] array){
        for(T elements:array){
            System.out.println(elements);
        }
    }
}
public class Generic {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Integer[] arr1={1,2,3};
        String[] arr2={"Hello","World"};
        Print.printarray(arr1);
        Print.printarray(arr2);
    }
}
