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
public class PrimeorNot {
    public static void main(String[]args){
        int p;
       boolean prime=true;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number: ");
        p=sc.nextInt();
        for(int i=2;i<p;i++){
            if(p%i==0){
             prime=false;
            }
        }
        if(prime==true){
              System.out.println(p + "is prime");
        } else{
                 System.out.println(p + "is not prime");
        }
    }
}
