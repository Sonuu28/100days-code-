import java.util.Scanner;
class equal_number{
public static void main(String[]args){

 Scanner sc=new Scanner(System.in);

 System.out.println("enter first number");
 int num1=sc.nextInt();
System.out.println("enter second number");
 int num2=sc.nextInt();
System.out.println("enter third number");
 int num3=sc.nextInt();
  
  if(num1==num2 && num2==num3 && num3==num1)
  System.out.println("number is equal");

  else
  System.out.println("number is not equal");
}
}


  