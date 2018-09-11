class final1
{
  final void run()
  {
    System.out.println("there is the final method calling");
   }
}
class MAin extends final1
{
  void run()
  {
    System.out.println("this is the main class in one method");
   }
  public static void main(String[] args)
  {
   MAin f=new MAin();
   f.run();
  }
}