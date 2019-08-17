/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CodeKata_Set2;

/**
 *
 * @author crm systems
 */
import java.util.*;
public class PrimeIntervals {
    public static void main(String[]args){
        int n1,n2,i,j;
        
       boolean prime;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two intervals: ");
          n1=sc.nextInt();
        n2=sc.nextInt();
        for(j=n1+1;j<n2;j++){
            
            prime=true;
        for(i=2;i<j;i++){
            if(j%i==0){
             prime=false;
            }
        }
        if(prime==true){
           System.out.print(i+" ");
        }
    }
        
        
    }
}
