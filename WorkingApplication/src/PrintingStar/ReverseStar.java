package PrintingStar;
import java.io.*; 
 
public class ReverseStar
{ 
    
    public static void printStars(int n) 
    { 
        int i, j; 
  
        for(i=n; i>0; i--) 
        {  
            for(j=n; j>i; j--) 
            { 
                System.out.print("* "); 
            } 
            System.out.println(); 
        } 
   } 
  
    public static void main(String args[]) 
    { 
        int n = 5; 
        printStars(n); 
    } 
} 