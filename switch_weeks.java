import java.util.Scanner;
class switch_week{
public static void main(String[]args){

Scanner sc=new Scanner(System.in);
System.out.println("please enter first number");
int day1=sc.nextInt();
System.out.println("please enter second number");
int day2=sc.nextInt();
System.out.println("please enter third number");
int day3=sc.nextInt();
System.out.println("please enter fourth number");
int day4=sc.nextInt();
System.out.println("please enter fifth number");
int day5=sc.nextInt();
System.out.println("please enter sixth number");
int day6=sc.nextInt();
System.out.println("please enter seventh number");
int day7=sc.nextInt();

 switch(1)
{
  case 0:{
  System.out.println("sunday");
  break;}
  case 1:{
   System.out.println("monday");
  break;}
  case 2:{
  System.out.println("tuesday");
  break;}
  case 3:{
  System.out.println("wednesday");
  break;}
  case 4:{
  System.out.println("thursday");
  break;}
 case 5:{
  System.out.println("friday");
  break;}
  case 6:{
  System.out.println("saturday");
  break;}
  default:{
  System.out.println("try again");
  break;}

  }     
}
}

   


