import java.util.Scanner;
class largest_number{
public static void main(String[]args){

 Scanner sc = new Scanner(System.in);
 System.out.println("enter four nubers");
 int a=sc.nextInt();
 int b=sc.nextInt();
 int c=sc.nextInt();
 int d=sc.nextInt();

 if(a>b && a>c && a>d)
  System.out.println("largest number is-->a");
if(b>a && b>c && b>d)
  System.out.println("largest number is-->b");
if(c>a && c>b && c>d)
  System.out.println("largest number is-->c");
if(d>a && d>b && d>c)
  System.out.println("largest number is-->d");

  }
}

