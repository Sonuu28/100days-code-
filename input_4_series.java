import java.util.*;
class input_4_series{
public static void main(String[]args)
{
  Scanner sc = new Scanner(System.in);
  System.out.println("please enter a number");
   int n = sc.nextInt();
    
    for(int i=0; i<=n; i++)
      {
        int a=1;
       for(int j=1; j<=i; j++)
        {
          a=a+4;
         }
          System.out.println(a);
        }
     }
}  
            