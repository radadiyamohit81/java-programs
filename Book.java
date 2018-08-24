import java.util.Scanner;
class Book
{
    int book_no;
    String bname,aname,pname;
    float bprize;
    void getdata()
    {   
       Scanner s1=new Scanner(System.in);
       System.out.println("Enter the book no\t");
       book_no=s1.nextInt();
       System.out.println("Enter the book prize\t");
       bprize=s1.nextFloat();
       System.out.println("Enter the book Name\t");
       bname=s1.nextLine();
       System.out.println("Enter the Author Name\t");
       aname=s1.nextLine();
       System.out.println("Enter the Publication Name\t");
       pname=s1.nextLine();
       
     } 
    void display()
    {
       System.out.println("\t"+book_no+"\t"+bname+"\t"+aname+"\t"+bprize+"\t"+pname);  
    }
     public static void main(String args[])
   {
      Book B=new Book();
      Scanner s=new Scanner(System.in);
      System.out.println("enter the number of book");
      int n=s.nextInt();
      Book a[]=new Book[n];
      for(int i=0;i<n;i++)
      {
         a[i]=new Book();  
       }   
       for(int i=0;i<n;i++)
      {
         a[i].getdata();  
       }  
      System.out.println("\t"+"book_no"+"\t"+"bname"+"\t"+"aname"+"\t"+"bprize"+"\t"+"pname");  
       for(int i=0;i<n;i++)
      {
         a[i].display();  
      }    
   }
 }      
         
      
