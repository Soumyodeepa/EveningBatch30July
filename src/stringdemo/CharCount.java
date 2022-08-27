package stringdemo;

public class CharCount {

	public static void main(String[] args) {
		String str1 = "Hello World Java Learning";

		int beforelength = 0;
		int currentlength = 0;

		for (int i = 97; i <= 122; i++) {
			char ch = (char) i;

			beforelength = str1.length();
			str1 = str1.replaceAll(String.valueOf(ch), "");
			currentlength = str1.length();
			int diff = beforelength - currentlength;
			if (diff > 0) {
				System.out.println("for Character " + ch + " :-> " + diff);
			}

		}

	}

}
