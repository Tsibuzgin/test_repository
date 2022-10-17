package isWordAPalindrome;

import java.util.*;

public class IsWordAPalindrome {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Type word");
		String string = in.next();
		int c = 0;
		for (int i = 0; i != string.length()/2; i++) {
			System.out.println(string.substring(i, i + 1));
			System.out.println(string.substring(string.length() - 1 - i, string.length() - i));
			if (!string.substring(i, i + 1).equals(string.substring(string.length() - 1 - i, string.length() - i))) break;
			if (i == string.length()/2 - 1) c++;
		};
		if (c == 0) System.out.println("No"); else System.out.println("Yes");
	}	
}
