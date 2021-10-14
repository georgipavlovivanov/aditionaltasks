import java.util.Iterator;

/*
 * јгенци€та "FirstToEleven" исак да провери дали името и се среща в документите които за проверка.
 * “ази проверка  представл€ва преглед на цели€ символен низ, като името на агенци€та може да попада
 * в текста под вс€ква форма (наало, среда м каран на текста, както и малки/главни букви).
 * Ќапишете функци€, ко€то приема символен низ и дума за проверка и врща истина, ако думата се среща в текста под н€ква форма
 */
public class FirstToElevenAgency {

	
	public static void main(String[] args) {
		
		String agencyName = "FirstToEleven";
		String randomString = "firstToEleven Try to find is  content in document word ";
		
		System.out.println(checkWordIsContentInString(randomString, agencyName));
		
	}
	
	private static boolean checkWordIsContentInString(String str, String search) {
		
		// add new string [] to keep split words by " "
		String [] countWordsInStr = str.split(" ");
		String searchToLowerCase = search.toLowerCase();
		
		// iterate trough split String []
				for(String currentWord:countWordsInStr) {
					
				// get lenght of word if is equal of currentword check word is same
					if(currentWord.length() == search.length()) {
						// check words are equals
						if(currentWord.toLowerCase().equals(searchToLowerCase)){
							return true;
						}
					}
				}
		
		
		return false;
		
	}
	
}
