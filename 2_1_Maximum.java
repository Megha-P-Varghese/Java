import java.io.*;
class Maximum
{
	public static void main(String args[])
	{
		DataInputStream din;
		String s;
		int x,y,z;
		din=new DataInputStream(System.in);
		try
		{
		System.out.println("Enter the first no");
                s=din.readLine();
                x=Integer.parseInt(s);
		System.out.println("Enter the second no");
                s=din.readLine();
                y=Integer.parseInt(s);
		System.out.println("Enter the third no");
                s=din.readLine();
                z=Integer.parseInt(s);
		if(x>y && x>z)
		{
			System.out.println(x+" is the maximum"); 
		}
		else if(y>z)
		{
			System.out.println(y+" is the maximum"); 
		}
		else
		{
			System.out.println(z+" is the maximum"); 
		}
		}
		catch(Exception e)
		{
			System.out.println("Error : "+e);
		}
	}
}