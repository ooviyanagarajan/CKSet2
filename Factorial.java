

import java.util.Scanner;

public class Factorial {
     public static void main(String[]args){
     int N,factor=1;
     System.out.println("Enter a number: ");
     Scanner sc=new Scanner(System.in);
     N=sc.nextInt();
     for(int i=1;i<=N;i++){
         factor=factor*i;
    
     } 
      System.out.print(factor+" ");  
    }
    
}
