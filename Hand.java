import java.util.*;

public class Hand {

  private ArrayList<Card> cards;

  public Hand() {
    cards = new ArrayList<Card>();
  }

  public ArrayList<Card> getCards() {
    return this.cards;
  }

  public Card takeCard(int id) {
    return cards.remove(id);
  }

  public int size() {
    return cards.size();
  }

}