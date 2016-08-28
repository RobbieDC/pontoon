import java.util.*;

public class Runner {

  public static void main(String[] args) {

    Player player = new Player( "testPlayer" );
    player.sayHello();

    Dealer dealer = new Dealer( "testDealer" );
    dealer.sayHello();

    Deck deck = new Deck();
    deck.shuffle();
    System.out.println( "Deck added and shuffled" );

    player.getCardFromDeck( deck, 2 );
    int numPlayerCards = player.cardCount();
    System.out.println( String.format( "%s has %d cards", player.getName(), numPlayerCards ) );

    dealer.getCardFromDeck( deck, 2);
    int numDealerCards = dealer.cardCount();
    System.out.println( String.format( "%s has %d cards", dealer.getName(), numDealerCards ) );

    ArrayList<Card> playerHand = player.getHand().getCards();
    System.out.println("Player has:");
    int playerScore = 0;
    for (Card card : playerHand) {
      Value cardType = card.getValue();
      int cardValue = card.getValue().getNum();
      playerScore += cardValue;
      System.out.println( cardType );
    }
    System.out.println( playerScore );

    ArrayList<Card> dealerHand = dealer.getHand().getCards();
    System.out.println("Dealer has:");
    int dealerScore = 0;
    for (Card card : dealerHand) {
      Value cardType = card.getValue();
      int cardValue = card.getValue().getNum();
      dealerScore += cardValue;
      System.out.println( cardType );
    }
    System.out.println( dealerScore );

    if (playerScore > dealerScore) {
      System.out.println( "Player wins" );
    } else if (playerScore < dealerScore) {
      System.out.println( "Dealer wins" );
    } else if (playerScore == dealerScore) {
      System.out.println( "Draw, dealer wins" );
    }

  }

}