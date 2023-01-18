/*
 * Activity 2.4.4
 * 
 */
import java.util.Scanner;
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String letters = "abcdefghijklmnopqrstuvwxyz";
		System.out.println("Enter a phrase: ");
		String phrase = sc.nextLine();

		System.out.println("The following shows the letter frequencies for the phrase");

    	/* your code here */
		for(int i = 1; i <= letters.length(); i++){
			int letterAmt = 0;
			String alpha = letters.substring(i-1,i);
			for(int j = 0; j < phrase.length(); j++){
				if (phrase.toLowerCase().substring(j,j+1).equals(alpha)){
					letterAmt++;
				}
			}
			System.out.println("Number of " + alpha + "'s: " + letterAmt);
		}
	}
}
