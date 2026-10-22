import java.util.Scanner;

public class Abecedarian{
	public static void main (String[] args){
		System.out.print("Enter a word!");
		
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		
		System.out.println("This word is Abecedarian?" + isAbecedarian(word));
	}
	
	public static boolean isAbecedarian (String str){
		int len = str.length();
		for (int i = 0; i < len - 1; i++){
			if (str.charAt(i) > str.charAt(i + 1)){
				return false;
			}
		} return true;
	}

}
