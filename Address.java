import java.util.*;
public class Main
{
	public static void main(String[] args) {

	    Scanner y = new Scanner(System.in);
	    Scanner x = new Scanner(System.in);

	    System.out.print("Enter House Number : ");
	    int h = y.nextInt();

	    System.out.print("Enter Street Name : ");
	    String s = x.nextLine();
	    
	    System.out.print("Enter City Name : ");
	    String c = x.nextLine();
	    
	    System.out.print("Enter State Name : ");
	    String y = x.nextLine();
	    
	    System.out.print("Enter Zip Code : ");
	    int z = y.nextInt();
	    
	    System.out.println("You Address is : ");
	    System.out.println(h);
	    System.out.println(s);
	    System.out.println(c);
	    System.out.println(y);
	    System.out.println(z);
	}
}
