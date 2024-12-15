/* Rashika Jain
 * 12/11/24 Period 5
 * Punctuation.java
 * This	program will take some text, read it word by word and print all of the words
 * that have some punctuation in it.
 * 
 * Psuedocode:
 * main()
 * 		call searchIt()
 * 
 * searchIt()
 * 		call getPunctuationWords()
 * 		call printWords()
 * 
 * getPunctuationWords()
 * 		call checkForPunctuation()
 * 
 * checkForPunctuation()
 * 		int start = 0;
 * 		if (charAt.start != " ")
 * 		else
 * 		finalText = finalText + word
 * 
 * printWords()
*/

public class Punctuation
{
	public static void main (String [] args)
	{
		searchIt();
	}
	
	public static void searchIt()
	{
		String text = new String ("I like... apples, \"bananas\" and monkeys! I hate: donkeys' goats- baboons; and roosters? (bye and bye)");
		text = getPunctuationWords(text);
		printWords(text);
	}
	
	public static String getPunctuationWords(String text2)
	{
		String finalText = new String (" ");
		String word = new String (" ");
		int start = 0;
		int end = 0;
		int length = text2.length();
		int wordLength;
		
		for(int position = 0; position <= length; position ++)
		{
			while (text2.charAt(end) != ' ')
			{
				end++;
			}
			wordLength = end - start;
			word = text2.substring(start, end);
			word = checkForPunctuation(word, wordLength);
			finalText = finalText + " " + word;
			start = end;
		}
		return finalText;
	}
	
	public static String checkForPunctuation(String word2, int length2)
	{
		int x = 0;
		for(int i = 0; i<length2; i++)
		{
			if((word2.charAt(x) == '.') || (word2.charAt(x) == ',') || (word2.charAt(x) == ';' )|| (word2.charAt(x) == ':') || (word2.charAt(x) == '!') || (word2.charAt(x) == '?') || (word2.charAt(x) == '"') || (word2.charAt(x) == '(') || (word2.charAt(x) == ')') || (word2.charAt(x) == '-'))
			{
				return word2;
			}
			else 
			{
				x++;
			}
		}
		return "";
	}
	
	public static void printWords(String finalText2)
	{
		System.out.println(finalText2);
	}
}
