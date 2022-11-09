import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.math.BigInteger;

public class Prime {
    static boolean isNotPrime(int number) {
        return (number % number) != 0;

    }


    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        bufferedReader.close();
        boolean result;
        BigInteger a = new BigInteger(n);
        result = a.isProbablePrime(1);
        if (result){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }

    }
}
