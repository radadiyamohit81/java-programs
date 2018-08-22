import  java.util.Scanner;
class Second_largest
{
  public static void main(String[] args)
  {
    Scanner s=new Scanner(System.in);
    int i,j;
    System.out.println("enter the no of array");
    int n=s.nextInt();
    int a[]=new int[n];
    for(i=0;i<n;i++)
    {
      a[i]=s.nextInt();
    }
    for(i=0;i<n;i++)
    {
      for(j=i+1;j<n;j++)
      {
         if(a[i]>a[j])
         {
           int swap=a[i];
               a[i]=a[j];
               a[j]=swap;
          }
       }
     }
     
     int b=a[i-2];
     System.out.println("the second largest number from array is = "+b);
   }
}   