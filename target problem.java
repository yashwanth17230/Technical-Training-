//sum of two varibles and compare with target varible
import java.util.Scanner;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    
	    int n,i,t,j;
	    int x[]=new int[10];
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the no of elements");
	    n=sc.nextInt();
	    for(i=0;i<n;i++){
	         x[i]=sc.nextInt();
	    }
	    for( i=0;i<n;i++){
	         System.out.println(x[i]);
	    }
	    System.out.println("Enter the target elements");
	    t=sc.nextInt();
	    for(i=0;i<n;i++){
	        for(j=1;j<n;j++){
	            if(x[i]+x[j]==t)
	            {
	                System.out.println(i+","+j);
	            }
	            
	        }
	        
	    }
	}
}


/*import java.util.Scanner;
import java.io.*;
public class Main
{
	public static void main(String[] args) {
	    
	    int n,i,t,j;
	    int x[]=new int[10];
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the no of elements");
	    n=sc.nextInt();
	    for(i=0;i<n;i++){
	         x[i]=sc.nextInt();
	    }
	    for( i=0;i<n;i++){
	         System.out.println(x[i]);
	    }
	    System.out.println("Enter the target elements");
	    t=sc.nextInt();
	    int y[]=new int[10];
	    y=sumOfTwo(x,t);
	    for(int i=0;i<2;i++){
	        System.out.println(y[i]);
	    }
	    Main int[] sumOfTwo(int x[],int t)
	    {
	        int z[]=new int[2];
	        for(i=0;i<n;i++)
	        {
	            for(j=1;j<n;j++)
	            {
	                if(x[i]+x[j]==t)
	            {
	                z[0]=i;
	                z[1]=j;
	            }
	            
	        }
	        
	    }
	    return z;
	    }
	    
	}
}

*/
