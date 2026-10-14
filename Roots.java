import java.util.Scanner;

public class SquareRoot{
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("What positive number would you like to use?");
		
		double a = in.nextInt();
				in.nextLine();
				
		System.out.println(squareRoot(a/2.0, a));
		
	}
	
	public static double squareRoot (double n, double a){
		double diff = a - n;
		while (diff > 0.001){
			diff = Math.abs(n - (n + a/n)/2.0);
			n = (n + a/n)/2.0;
		}
		return n;
	}

}
