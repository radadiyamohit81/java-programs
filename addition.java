/*Write a Program to addition of two float number.*/
import java.util.Scanner;
class Addition
{
  float x,y;
  void computeAddition()
  {
   Scanner s=new Scanner(System.in); 
   x=s.nextFloat();
   y=s.nextFloat();
   System.out.println("The addition is = "+(x+y));
   }
  public static void main(String[] args)
  {
    Addition a=new Addition();
    a.computeAddition();
  }
} 
