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
public class Amstrong {
    public static void main(String[]args){
       int n,rem,orig;
       int sum=0;
       int count=0;
       System.out.println("Enter n:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        
        orig=n;
        
        
         while(orig!=0){
        orig=orig/10;
        count++;  
       }
         
      orig=n;
        while(orig!=0){
            rem=orig%10;
            sum+=Math.pow(rem, count);
            orig/=10;
        }
        
        if(sum==n)
            System.out.println("Amstrong");          
        else
            System.out.println("No");
        
    }
}
  /*   public static void main(String[] args) {
        int number , originalNumber, remainder;
        int digits = 0;
            int result = 0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter n:");
        number=sc.nextInt();
          originalNumber = number;
         while (originalNumber != 0) {
                originalNumber /= 10;
                ++digits;
            }
            originalNumber = number;
            // result contains sum of nth power of its digits
            while (originalNumber != 0) {
                 remainder = originalNumber % 10;
                result += Math.pow(remainder, digits);
                originalNumber /= 10;
            }

        if(result == number)
            System.out.println(number + " is an Armstrong number.");
        else
            System.out.println(number + " is not an Armstrong number.");
    }

}
*/