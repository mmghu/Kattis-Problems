import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tri {
	public static void main(String[] args) throws IOException {
		// Get input from the user
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String[] numbers = reader.readLine().split(" ");
		
		// Split into variables
		int a = Integer.parseInt(numbers[0]);
		int b = Integer.parseInt(numbers[1]);
		int c = Integer.parseInt(numbers[2]);
		
		// Loop through 8 iterations
		boolean found = false; // easiest way to do this w/ only 8 iterations
		if(a + b == c && !found){System.out.println(a+"+"+b+"="+c); found = true;}
		if(a - b == c && !found){System.out.println(a+"-"+b+"="+c); found = true;}
		if(a * b == c && !found){System.out.println(a+"*"+b+"="+c); found = true;}
		if(a / b == c && !found){System.out.println(a+"/"+b+"="+c); found = true;}
		if(a == b + c && !found){System.out.println(a+"="+b+"+"+c); found = true;}
		if(a == b - c && !found){System.out.println(a+"="+b+"-"+c); found = true;}
		if(a == b * c && !found){System.out.println(a+"="+b+"*"+c); found = true;}
		if(a == b / c && !found){System.out.println(a+"="+b+"/"+c); found = true;}
		
	} // end main
} // end class
