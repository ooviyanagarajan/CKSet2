
public class AmstrongInterval {
        public static void main(String[]args){
       int n1,n2,rem,orig;
       
       System.out.println("Enter intervals:");
        Scanner sc=new Scanner(System.in);
        n1=sc.nextInt();
        n2=sc.nextInt();
        for(int i=n1+1;i<n2;i++){
            int sum=0;
       int count=0;
         orig=i;   
         while(orig!=0){
        orig=orig/10;
        count++;  
       }
         
      orig=i;
        while(orig!=0){
            rem=orig%10;
            sum+=Math.pow(rem, count);
            orig/=10;
        }
        
        if(sum==i){
            System.out.print(i + " ");     }
            
        }
             
       }
}

    

