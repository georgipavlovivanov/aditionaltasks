import java.util.Iterator;

/*
 * ��������� "FirstToEleven" ���� �� ������� ���� ����� � �� ����� � ����������� ����� �� ��������.
 * ���� ��������  ������������ ������� �� ����� �������� ���, ���� ����� �� ��������� ���� �� ������
 * � ������ ��� ������ ����� (�����, ����� � ����� �� ������, ����� � �����/������ �����).
 * �������� �������, ����� ������ �������� ��� � ���� �� �������� � ���� ������, ��� ������ �� ����� � ������ ��� ����� �����
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
