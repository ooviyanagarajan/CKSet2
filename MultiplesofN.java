
import java.util.*;
public class MultiplesofN {
    public static void main(String[]args){
     int N,factor;
     System.out.println("Enter a number: ");
     Scanner sc=new Scanner(System.in);
     N=sc.nextInt();
     for(int i=1;i<=5;i++){
         factor=N*i;
     System.out.print(factor+" ");  
     }
     
     
    }
    
}
