import java.util.Scanner;

public class Gauss{
	
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.println("What x and n values would you like to use?");
		System.out.print("x value: ");
		double x = in.nextInt();
				in.nextLine();
		System.out.print("n value: ");
		int n = in. nextInt();
				in. nextLine();
		System.out.println(gauss(x, n));
	}
	
	public static double gauss (double x, int n){
		double sum = 1;
		for (int i = 1; i <= n; i++){
		x = -1 * x / i;
		sum += x;
		}
		return sum;
	}
}
