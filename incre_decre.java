class incre_decre{
public static void main(String[]args){

 int x=20;

  int y=--x+x++- --x+x++;
  x= ++y+y- --y -y-- - --x;

 System.out.println("x:"+x);
 System.out.println("y:"+y);
}
}
