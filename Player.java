import java.util.*;

public class Player extends Participant {

  private Hand hand;
  private String name;
  private int score;

  public Player( String name ) {
    this.hand = new Hand();
    this.name = name;
    this.score = 0;
  }

  public void sayHello() {
    System.out.println("Hello, I am a player");
  }

  public String getName() {
    return this.name;
  }

  public Hand getHand() {
    return this.hand;
  }

  public int cardCount() {
    return hand.size();
  }

  public void getCardFromDeck(Deck deck, int num) {
    deck.dealCards(hand.getCards(), num);
  }

}