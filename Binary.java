import java.util.Scanner;

public class Binary{
	public static void main (String[] args){
		System.out.print("What number would you like to change into binary? ");
		
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
				in.nextLine();
				
		System.out.println("This number in binary is " + convertToBinary(n));
	
	}
	
	public static String convertToBinary (int n){
		String fin = "";
		while (n > 0){
			fin = n % 2 + fin;
			n = n / 2;
		}
		return fin;
	}

}
