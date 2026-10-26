import java.util.Scanner;

public class Scrabble{
	public static void main(String[] args){
		System.out.print("What word would you like to spell?");
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		
		System.out.print("What letters do you have?");
		String letters = in.nextLine();
		
		System.out.println("Can you spell it? " + canSpell(word.toLowerCase(), letters));
	}
	
	public static boolean canSpell(String str, String letters){
		for (char i = 'a'; i < 'z'; i++){
			if (counter(str, i) > counter(letters, i)){
				return false;
			}
		} 
		return true;
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
