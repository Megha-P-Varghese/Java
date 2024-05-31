import java.io.*;
class Sum
{
  public static void main(String args[])
  {
  System.out.println("Megha P Varghese");
  DataInputStream din;
  int x,y;

  String s;
  din = new DataInputStream(System.in);
  try
  {
    System.out.println("\nenter the first number :");
    s=din.readLine();
    x=Integer.parseInt(s);
    System.out.println("\nenter the second  number :");
    s=din.readLine();
    y=Integer.parseInt(s);
    System.out.println("\n sum of  "+x+" and "+y+" is " + (x+y));
   }
     catch (Exception e)
    {
      System.out.println("Error : "+e); 
     }
   }
}