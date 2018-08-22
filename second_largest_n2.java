import  java.util.Scanner;
class Second_largest
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int i,j,max=0,sec_max=0;
    System.out.println("enter the no of array");
    int n=s.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    for(i=0;i<n;i++)
    {
      if(a[i]>max)
      {
        max=a[i];
      }  
    }
    for(i=1;i<n;i++)
    {
      if(sec_max<a[i] && a[i]<max)
      {
        sec_max=a[i];
      }  
    }
   System.out.println("the maximum of"+sec_max);
  }
}   