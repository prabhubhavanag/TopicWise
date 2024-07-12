package string;

import java.util.Arrays;

public class CountNoOfWords {

	public static void main(String[] args) {
		int len = 0;
		String givenString = "This is the sample string to be checked";

		// string split way
		len = givenString.split("\\s+").length;
		System.out.println("string split way :: " + len);

		// java 8 stream way
		len = (int) Arrays.stream(givenString.split("\s")).count();
		System.out.println("java 8 stream way :: " + len);

		// char Array way
		String trim = givenString.trim();
		len = 0;
		for (int i = 0; i < trim.length(); i++) {
			if ((i == 0 && trim.charAt(i) != ' ') || (trim.charAt(i - 1) != ' ' && trim.charAt(i) == ' '))
				len++;
		}
		System.out.println("char Array way :: " + len);
	}
}
