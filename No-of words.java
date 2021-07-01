package Strings;
import java.util.*;
public class No_Words {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String str = sc.nextLine();
		String words[] = str.split(" ");
		System.out.println("No of words = "+ words.length);				
	}
}