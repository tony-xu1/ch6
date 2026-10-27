import java.util.Scanner;

public class Palindrome{
	public static void main (String[] args){
		System.out.print("What phrase would you like to check? ");
		Scanner in = new Scanner(System.in);
		String phrase = in.nextLine();
		
		System.out.println("Is this phrase a palindrome? " + isPalindrome(phrase.toLowerCase()));
	
	}
	
	public static boolean isPalindrome (String str){
		str = remove(str);
		int len = str.length();
		for (int i = 0; i < len; i++){
			if(str.charAt(i) != str.charAt(len - 1 - i)){
				return false;
			}
		}
		return true;
	}
	
	public static String remove (String str){
		String nonLetters = ",.:;()[]{}!@#$%^&* ";
		int len = str.length();
		String fin = "";
		for (int i = 0; i < len; i++){
			if (!nonLetters.contains(str.substring(i, i+1))){
				fin = fin + str.charAt(i);
			}
		} return fin;
	}

}
