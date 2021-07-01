package Strings;
import java.util.*;
public class Rev_each_word {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String str = sc.nextLine();
		String words[] = str.split("\\s");
		String rev ="";// sentence
		// to pick each word
		for(int i =0; i<words.length; i++) // i = 0 < words.length=5 => 0 1 2 3 4
		{
			String w = words[i]; 
			String r = "";  // each word
			// to reverse each word
			for(int j =  w.length()-1; j>= 0; j-- )
			{
				r = r + w.charAt(j);				
			}
			//System.out.println(r);
			rev = rev+r+" "; 
		}
		System.out.println(rev);
} }
