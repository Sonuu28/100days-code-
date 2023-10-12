import java.util.Scanner;
class check_char{
public static void main(String[]args){

  Scanner sc=new Scanner(System.in);
  System.out.println("please enter a character");
  char ch= sc.next().charAt(0);

  if(ch>='a'&&ch<='z' || ch>='A'&& ch<='Z')
  System.out.println("it is a alphabet");

  else if(ch>='0' && ch<='9')
  System.out.println("it is a number");
 
  else
  System.out.println("it is special symbol");
}
}