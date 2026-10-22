import java.util.Scanner;

public class Spell{
	public static void main(String[] args){
		System.out.print("What word would you like to spell?");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		
		System.out.print("What letters do you have?");
		String letters = in.nextLine();
	}
	
	public static boolean canSpell(String str, String letters){
		
	}
	
	public static int counter (String str, char let){
		int len = str.length();
		int sum = 0;
		for (int i = 0; i < len; i++){
			if (str.charAt(i) == let){
				sum++;
			}
		} return sum;
	}

}
