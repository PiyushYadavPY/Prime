package greatest;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n,count=0;
       System.out.print("Enter any number");
       Scanner sc= new Scanner(System.in);
       n=sc.nextInt();
       for(int i=1;i<=n;i++)
       {
    	   if(n%i==0){
    		   count++;
    		   
    	   }
    	   
       }
       if (count==2)
    	   System.out.print("Prime Number");
       else
    	   System.out.print("Non Prime Number");
	}

}
