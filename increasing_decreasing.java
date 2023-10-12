import java.util.Scanner;
class increasing_decreasing{
public static void main(String[]args){

 Scanner sc = new Scanner(System.in);
System.out.println("enter a number");
int a=sc.nextInt();
System.out.println("enter a number");
int b=sc.nextInt();
System.out.println("enter a number");
int c=sc.nextInt();

if(a<b && b<c && c>a)
System.out.println("is it in increasing order");
else
System.out.println("it is in decreasing order");

}
}
