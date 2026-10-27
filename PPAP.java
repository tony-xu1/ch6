import java.util.Scanner;

public class PPAP {

	public static void main ( String[] args){
		
		System.out.print("Enter your lyric ");
		Scanner in = new Scanner(System.in);
		String lyric = in.nextLine();
		
		System.out.println(ppap(lyric));
	
	}
	
	public static String ppap (String str){
		int len = str.length();
		int comma = str.indexOf(",");
		int period = str.indexOf(".");
		
		String obj1 = str.substring(9, comma); 
		String obj2 = str.substring(comma + 11, period);
	
		 return "Uh! " + obj2 + " " + obj1;
		
	}

}
