import java.util.*;
class sum_of_digit{
public static void main(String[]args){
    
    int sum=0;
   Scanner sc= new Scanner(System.in);
   System.out.println("please enter a number");
   int num=sc.nextInt();
  
    while(sum<=num)
    {
      sum=sum+num%10;
       num=num/10;
      System.out.println("sum of digits-->"+sum);
       sum++;
       
     }
  }
}

  
   