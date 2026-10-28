import java.util.Scanner;

public class PigLatin{
	public static void main (String[] args){
		System.out.print("What phrase would you like to translate? ");
		Scanner in = new Scanner(System.in);
		String phrase = in.nextLine();
		
		System.out.println(inWords(phrase));
		
	}
	
	public static String toPigLatin (String str){
		char start = str.charAt(0);
		String root = str.substring(1);
		if (str.length() > 2){
			return root + start + "ay";
		} return str;
	}
	
	public static String inWords (String str){
		str = str + ' ';
		int len = str.length();
		String sentence = "";
		int n = 0;
		for (int i = 0; i < len; i++){
			if (str.charAt(i) == ' '){
				if (n < i){
					sentence = sentence + toPigLatin(str.substring(n, i)) + ' ';
					n = i + 1;
				}
			}
		} return sentence;
	}
}

