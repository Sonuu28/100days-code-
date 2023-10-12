import java.util.Scanner;
class valid_triangle{
public static void main(String[]args){

  Scanner sc=new Scanner(System.in);
  System.out.println("enter three number");
  int a=sc.nextInt();
  int b=sc.nextInt();
  int c=sc.nextInt();

 if(a==60 && b==60 && c==60)
 System.out.println("it is a valid triangle");
 else
 System.out.println("it is not a valid triangle");
}
}
