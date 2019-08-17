
import java.util.*;
public class Exponential {
    public static void main(String[]args){
        int N,K;
        System.out.println("Enter base and Exponent");
        Scanner sc=new Scanner(System.in);
        N =sc.nextInt(); 
        K = sc.nextInt();
        System.out.println(Math.pow(N, K)); 

    }
}
