import java.util.Scanner;
class constructor
{
     constructor()
     {
        System.out.println("this is default constructor");
      }
     constructor(int a)
     {
        System.out.println("area of square = "+(a*a));
      }
      constructor(int l,int h)
       {
        System.out.println("area of rectangle = "+(l*h));
      }
      constructor(float r,int h)
       {
        float b=2*(3.14F)*r*(h+r);
        System.out.println("area of cylinder = "+b);
      }      
    public static void main(String[] args)
    {
       Scanner s=new Scanner(System.in);
       System.out.println("enter the value of a = ");
       int a=s.nextInt();
       System.out.println("enter the value of h");
       int h=s.nextInt();
       System.out.println("enter the value of r");
       float r=s.nextFloat();
       System.out.println("enter the value of l");
       int l=s.nextInt();
       constructor c=new constructor(a);
       constructor d=new constructor(l,h);
       constructor e=new constructor(r,h);
     }
}