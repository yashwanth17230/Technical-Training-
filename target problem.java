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
