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
		String tempstr1 = "I have a ";
		String tempstr2 = ", I have a ";
		String obj1 = "";
		String obj2 = "";
		for (int i = 0; i < len; i++){
			if (i < 8 && str.charAt(i) != tempstr1.charAt(i) || i > tempstr1.length()){
				obj1 = obj1 + str.charAt(i);
				tempstr2 = tempstr1 + obj1 + tempstr2;
			}
			
			if (str.charAt(i) != tempstr2.charAt(i)){
				obj2 = obj2 + str.charAt(i);
			}
		} return "Uh! " + obj2 + " " + obj1;
		
	}

}
