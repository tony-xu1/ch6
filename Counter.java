import java.util.Scanner;

public class Counter{
	public static void main (String[] args){
		Scanner in = new Scanner(System.in);
		
		System.out.print("Whats your word?");
		String str = in.nextLine();
		System.out.println("There are " + counterA(str) + " a's in the word");
		System.out.println("This is an isoA word:" + isoA(str));
		
	}
	
	public static int counterA (String str){
		int sum = 0;
		int len = str.length();
		for (int i = 0; i < len; i++){
			if (str.charAt(i) == 'a'){
				sum++;
			}
		}
		return sum;
	}
	
	public static boolean isoA(String str){
		int len = str.length();
		boolean iso = true;
		if(counterA(str) > 0){
			for (int i = 0; i < len - 2; i++){
				if (str.substring(i, i + 2).equals("aa")){
					iso = false;
			} else iso = true;
		}
	}else iso = false;
	return iso;
}
}
