import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * 
 * @author Nathan McGraw
 *
 */
public class Palindrome {
	
	/**
	 * Checks to see if a given string is a palindrome
	 * @param expr String that is checked to be a palindrome
	 * @return Whether or not the String is a palindrome
	 */
	public static boolean isaPalindrome(String expr) {
		expr = expr.toLowerCase();
		if(expr.length() <= 1) {
			return true;
		}
		if(expr.charAt(0) == expr.charAt(expr.length() - 1)) {
			return isaPalindrome(expr.substring(1, expr.length() - 1));
		} else {
			return false;
		}
	}
	
	/**
	 * Reads a file and prints out whether or not they are palindromes
	 * @param args
	 * @throws FileNotFoundException Thrown if the file is not found
	 */
	public static void main(String[] args) throws FileNotFoundException {
		File words = new File("src/words.dat");
		Scanner scan = new Scanner(words);
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.print(line + ": ");
			System.out.println(isaPalindrome(line));
		}
	}
	
}
