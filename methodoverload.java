import java.util.Scanner;
class Employee {
    int  eno,salary,basic,hrs,da;
    String Ename;
    Scanner s=new Scanner(System.in);
    void input(){
        System.out.print("Enter employee name:");
        this.Ename=s.nextLine();
        System.out.print("Enter employee number:");
        this.eno=s.nextInt();
        System.out.print("Enter employee basic salary: ");
        this.basic=s.nextInt();
        System.out.print("Enter employee hra:");
        this.hrs=s.nextInt();
        System.out.print("Enter employee da:");
        this.da=s.nextInt();
    }
    void calculate(){
        this.salary=hrs+da+basic;
    }
    void display(){
        System.out.print("Employee Number"+this.eno+"\t salary:"+this.salary);
    }
}
class empdetails{
    public static void main(String[] args){
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        Employee emp[]=new Employee[n];
        for(int i=0;i<n;i++){
            emp[i]=new Employee();
            emp[i].input();
            emp[i].calculate();
            emp[i].display();
        }
    }
}