import static org.junit.Assert.*;
import org.junit.*;

public class DealerTest {

  Dealer dealer;
  Deck deck;

  @Before
  public void before() {
    dealer = new Dealer( "Test Dealer" );
    deck = new Deck();
  }

  @Test
  public void hasName() {
    assertEquals( "Test Dealer", dealer.getName() );
  }

  @Test
  public void canGetCardFromDeck() {
    dealer.getCardFromDeck(deck, 2);
    assertEquals( 2, dealer.cardCount() );
  }

}