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
public class Oddinterval {
    public static void main(String[]args){
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(int i=n1+1;i<n2;i++){
            if(i%2!=0){
                System.out.print(i+" ");
               
            }
        }
        
    }
}
