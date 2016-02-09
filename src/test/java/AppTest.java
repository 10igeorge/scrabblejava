import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_2() {
    App scrabble = new App();
    Integer score = 2;
    assertEquals(score, scrabble.scrabbleScore('D'));
  }


}











//Return score for letter
//Split a word into CharArray
//Add letter values to create a total score
