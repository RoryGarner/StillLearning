
class Jlab51


// Student Name : 		Enda Dunican
// Student Id Number : 	COM1234
// Date :				1/9/2005
// Purpose : 			A Sample skeleton program


// Error : "Invalid path, \bin\javac.exe -classpath"
// 	Solution
// 		Configure -> Options -> JDK Profiles -> New -> browse to C:\Program Files\Java\JDK1.7.03_03
//		Them click "OK" In the options dialogue box (if there is a blank line over "JDK ver . . delete it) Then click OK
{
	public static void main(String[] args)
	{
		String sentence = "equil an equil dog help equil ";  
		String currentWord = "";  						
		String validWords = "" ;
		int index ;
		int spacePosition ;
		int charCount ;
		int validCount = 0 ;
		int validWordCount = 0;
		char character ;

		
		spacePosition = sentence.indexOf(" ") ;
		while(spacePosition >-1)
		{
			currentWord = sentence.substring(0,spacePosition) ; // getting the current word by taking the first word from the string 
			charCount = currentWord.length() ; // the character count is the length of "currentWord"
			validCount = 0 ;
			for(index = 0 ; index <= currentWord.length()-1; index ++) // 
				{
					character = Character.toUpperCase(currentWord.charAt(index));
					if(character >= 'A' && character <= 'Z') // Testing characters for validity (capitals only) 
						{
							validCount++ ;	// if conditions aremet count goes up
						}
				}//for
					if(validCount == charCount)  // if the valid character count matches that of the charCount it is a valid word 
						{
							validWords = validWords + currentWord + " "; // Adds the valid words together 
							validWordCount ++;
					 	}
					sentence = sentence.substring(spacePosition + 1) ;
					spacePosition = sentence.indexOf(" ");	
		}
	System.out.println("The valad words are " + validWords); // outputs the new string
		
	}
}