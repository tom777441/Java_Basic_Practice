package Card;
import java.util.Random;
public class DeckOfCards {
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	
	private static final Random randomNumber = new Random();
	
	public  DeckOfCards() {
		
		String[] faces= {"Ace","Deuce","Three","Four","Five","Six",
				"Seven","Eight","Nine","Ten","Jack","Queen","King"};
		
		String[] suits= {"Hearts","Diamonds","Clubs","Spades"};
		
		deck = new Card[NUMBER_OF_CARDS];
		currentCard = 0;
		
		for(int count=0;count<deck.length;count++) {
			deck[count] =
					new Card(faces[count%13],suits[count/13]);
		}
	}  //end DeckOfCards constructor
	
	public void shuffle() {
		currentCard =0;
		
		for(int first=0;first<deck.length;first++) {
			int second = randomNumber.nextInt(NUMBER_OF_CARDS);
			
			Card tmp = deck[first];
			deck[first] = deck[second];
			deck[second] = tmp;
		}
	}
	
	public Card dealCard() {
		if (currentCard<deck.length) {
			return deck[currentCard++];
		}else {
			return null;
		}
	}
}
