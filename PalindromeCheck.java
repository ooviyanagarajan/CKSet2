
import java.util.*;
public class PalindromeCheck {
    public static void main(String[]args){
        int n,sum=0,rem;
        System.out.println("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
         int orig=n;
        if(n<=1000){
            while(n>0 && n<=1000){
            rem=n%10;
            sum=sum*10;
            sum+=rem;
            n=n/10;
        }
             if(orig==sum){
        System.out.println("Palindrome");
        }else{
            System.out.println("Not a Palindrome");
        }
                
        }else{
            System.out.println("Please enter number less than or equal to 1000");
        }
        
       
    }
}
