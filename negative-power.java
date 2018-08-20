/*To finding the negative power of the any number like ex. 7^-2 .*/

import java.util.Scanner;
class main1
{
 static float power(float x,int y)
 {
  if(y==0)
  {
    return 1;
  }
  else if(y%2==0)
  {
    return power(x,y/2)*power(x,y/2);
  }
  else
  {
   if(y>0)
   {
    return (x*power(x,y/2)*power(x,y/2));
    }
   else
   {
    return(power(x,y/2)*power(x,y/2))/x;
   }
  }
 }
}
class negative
{
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  float x=s.nextFloat();
  int y=nextInt();
  main1 a=new main1();
  double ans=a.power(x,y);
  System.out.println("the power ="+ans);
 }
}
