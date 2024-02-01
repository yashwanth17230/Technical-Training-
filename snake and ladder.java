import java.util.Random;
import java.util.Scanner;
import java.io.*;

public class Main
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Random rand=new Random();
        int p1=1,p2=2,s1=0,s2=0;
        while(true)
        {
          System.out.println("enter the player number:");
          int a=sc.nextInt();
          if(a==p1)
          {
            int dice=rand.nextInt(6)+1;
            System.out.println(dice);
            s1=s1+dice;
            //condition for ladder
            if(s1==9)
            s1=s1+20;
            else if(s1==23)
            s1=s1+20;
            else if(s1==45)
            s1+=30;
            else if(s1==52)
            s1+=30;
            else if(s1==66)
            s1+=30;
            
            //condition for snakes
            else if(s1==98)
            s1-=90;
            else if(s1==84)
            s1-=60;
            else if(s1==78)
            s1-=50;
            else if(s1==42)
            s1-=21;
            else if(s1==30)
            s1-=25;
            //to check the score
            
            else if(s1==100){
                System.out.println("winner");
                break;
            }
            else if(s1>100){
                s1=s1-dice;
            }
            System.out.println("player 1 Score"+s1);
            
          }
          else if(a==p2)
          {
            int dice=rand.nextInt(6)+1;
            System.out.println(dice);
            s2=s2+dice;
            //condition for ladder
            if(s2==9)
            s2=s2+20;
            else if(s2==23)
            s2=s2+20;
            else if(s2==45)
            s2+=30;
            else if(s2==52)
            s2+=30;
            else if(s2==66)
            s2+=30;
            
            //condition for snakes
            else if(s2==98)
            s2-=90;
            else if(s2==84)
            s2-=60;
            else if(s2==78)
            s2-=50;
            else if(s2==42)
            s2-=21;
            else if(s2==30)
            s2-=25;
            
           
            else if(s2==100){
                System.out.println("winner");
                break;
            }
            else if(s2>100){
                s2=s2-dice;
            }
             System.out.println("player 2 Score"+s2);
          }
        }
    }
}
