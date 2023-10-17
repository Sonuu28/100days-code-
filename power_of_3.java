import java.util.*;
class power_of_3{
public static void main(String []args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("please enter a number");
  int n = sc.nextInt();
   
   for(int i=0; i<=n; i++)
    {
       int a=1;
      for(int j=1; j<=i; j++)
       {
           a=a*3;
        }
          System.out.println(a);
     }
  }
}
        
 
