import java.io.*;
import java.util.*;
import java.math.*;
public class JavaBigInteger {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        BigInteger a=s.nextBigInteger();
        BigInteger b=s.nextBigInteger();
        BigInteger sum1=a.add(b);
        BigInteger sum2=a.multiply(b);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
