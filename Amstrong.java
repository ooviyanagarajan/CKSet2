
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
  
