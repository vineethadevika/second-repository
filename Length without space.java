package Strings;
import java.util.*;
public class len_no_space {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		String str = sc.nextLine();
		int n = str.length();
		System.out.println("Length = "+ n);
		int m = str.replace(" ", "").length();
		System.out.println("Length without space= "+m);	
	} }