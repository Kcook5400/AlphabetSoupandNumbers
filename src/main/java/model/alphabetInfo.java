package model;

/**
 * @author kevin.cook - Kevin Cook
 *CIS175 - Fall 2021 
 * Sep 13, 2021
 */
public class alphabetInfo {
	private String letter;
	private int AlphaIndex;
	private String letterUP;
	private String letterLOW;
	private String soundWord;
	
	private String [] alphabet = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};

	private String [] alphaWords = {"Aligator", "Bat", "Cat", "Dog", "Elephant", "Fox", "Giraffe", "Halloween", "Igloo", "Jellyfish", "Kangaroo", "Lion", "Monkey","Newt", "Octopus", "Panda", "Queen", "Raisin", "Salamander", "Tiger", "Umbrella", "Vulture", "Walrus", "X-Ray", "Yummy", "Zebra"};
	
	
	
	/**
	 * 
	 */
	public alphabetInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public alphabetInfo(String letter) {
		this.letter= letter.toUpperCase();
		getInfo(letter);
	}
	public void setLetter(String letter) {
		this.letter=letter.toUpperCase();
		getInfo(letter);
	}
	public int getAlphaIndex() {
		return AlphaIndex;
	}
	public void setAlphaIndex(String letter) {
		for (int i =0; i < alphabet.length; i++) {
			if (this.letter.equalsIgnoreCase(alphabet[i])) {
				this.AlphaIndex =i+1;
			}
		}
		
		
	}
	
	
	
	
	public String getLetterUP() {
		return letterUP;
	}
	public void setLetterUP(String letterUP) {
		this.letterUP = letterUP.toUpperCase();
	}
	public String getLetterLOW() {
		return letterLOW;
	}
	public void setLetterLOW(String letterLOW) {
		this.letterLOW = letterLOW.toLowerCase();
	}
	public String getSoundWord() {
		return soundWord;
	}
	public void setSoundWord(String soundWord) {
		this.soundWord = this.alphaWords[getAlphaIndex()-1];;
	}
	public String getLetter() {
		return letter;
	}
	
	public void getInfo(String letter) {
		setLetterUP(letter);
		setLetterLOW(letter);
		setAlphaIndex(letter);
		setSoundWord(letter);
		
	}
	
	
	@Override
	public String toString() {
		return "alphabetInfo [letter=" + letter + ", AlphaIndex=" + AlphaIndex + ", letterUP=" + letterUP
				+ ", letterLOW=" + letterLOW + ", soundWord=" + soundWord + "]";
	}
	
	
	
	

}
