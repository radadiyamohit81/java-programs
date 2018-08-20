import java.util.Scanner;
class Employee
{
 int eno,basic,da,hra;
 String name;
 void inputdata()
 {
  Scanner s1=new Scanner(System.in);
  System.out.println("enter the name of employee");
  name=s1.nextLine();
  System.out.println("enter the employee number");
  eno=s1.nextInt();
  System.out.println("enter the basic value");
  basic=s1.nextInt();
  System.out.println("enter the DA value");
  da=s1.nextInt();
  System.out.println("enter the HRA value");
  hra=s1.nextInt();
 }
 void display()
 {
  System.out.println(name+"\t"+eno+"\t"+basic+"\t"+da+"\t"+hra+"\t");
 }
 void calculate()
 {
  System.out.println("the salary is = "+(basic+da+hra));
 }
 public static void main(String[] args)
 {
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number of employee");
  int n=s.nextInt();
  Employee a[]=new Employee[n];
  for(int i=0;i<n;i++)
  {
   a[i]=new Employee();
   }
  for(int i=0;i<n;i++)
  {
   a[i].inputdata();
  }
  System.out.println("Enter the value of employee\n name \t eno \t basic \t da \t hra");
  for(int i=0;i<n;i++)
  {
   a[i].display();
   a[i].calculate();
  }
  }
}