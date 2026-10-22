import java.util.Scanner;

public class Doubloon{
	public static void main (String[] args){
		System.out.print("Enter your word!");
		
		Scanner in = new Scanner(System.in);
		String word = in.nextLine();
		
		System.out.println("Your word is Doubloon?" + isDoubloon(word.toLowerCase()));
		
	}
	
	public static boolean isDoubloon (String str){
		for (char i = 'a'; i <= 'z'; i++){
			if (counter(str, i) != 2 && counter(str, i) != 0){
				return false;
			}
		} return true;
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
