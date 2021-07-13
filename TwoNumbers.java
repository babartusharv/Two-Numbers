import java.util.Scanner;
import java.lang.Math;

public class TwoNumbers
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		  Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
         int a;
         int b;
         int n;
         int min;
         int max;
        for(int i=0;i<t;i++){
            a=sc.nextInt();
            b=sc.nextInt();
            n=sc.nextInt();
            
                   if(n%2!=0){
                    a=a*2;    }
                  
          
            
                max=Math.max(a,b);
                min=Math.min(a,b);
               int ans=max/min;
            System.out.println(ans);
        }
           

    }
}