import java.util.Scanner;

public class PigLatin{
	public static void main (String[] args){
		System.out.print("What phrase would you like to translate? ");
		Scanner in = new Scanner(System.in);
		String phrase = in.nextLine();
		
		System.out.println(toPigLatin(phrase));
		
	}
	
	public static String toPigLatin (String str){
		char start = str.charAt(0);
		String root = str.substring(1);
		
		return root + start + "ay";
		
	}
	
	public static String inWords (String str){
		int len = str.length();
		String word = "";
		for (int i = 1; i < len - 1; i++){
			if (str.charAt(i) != ' ' || str.charAt(i - 1) != ' ' || str.charAt(i + 1) != ' ' ){
				word = 
			}
		} 
	}

}
