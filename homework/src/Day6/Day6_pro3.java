package Day6;

public class Day6_pro3 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for(int i = 0; i<deck.cards.length; i++) {
			System.out.print(deck.cards[i] + ",");
		} //1, 2, 3K, 4, 5, 6K, 7, 8, 9K, 10, 11, 12, 13K, 14,15,16K,...,29K,30K
	}
}

class SutdaDeck{
	final int CARD_NUM = 30;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck() {
		for(int i=0; i<cards.length; i++) {
			int num = i + 1;
			boolean isKwang = (num%10==3 || num%10==6 || num%10==9 || num/10 ==3);
			cards[i] = new SutdaCard(num, isKwang);
		}
	}
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard() { this(1, true); }
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	// info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num+(isKwang ? "K" : "");
	}
}