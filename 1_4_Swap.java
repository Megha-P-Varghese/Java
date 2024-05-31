import java.io.*;
class Swap
{
  public static void main(String args[])
  {
  System.out.println("Megha P Varghese");
  DataInputStream din;
  int x,y,temp;
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
    System.out.println("\nvalues before swapping:\nx = " +x+ " \ny = " +y);
     temp=x;
     x=y;
     y=temp;
    System.out.println("\nvalues after swapping:\nx = " +x+ " \ny = " +y);
     temp=x;
     x=y;
     y=temp;
   }
     catch (Exception e)
    {
      System.out.println("Error : "+e); 
     }
   }
}