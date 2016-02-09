import org.junit.*;
import static org.junit.Assert.*;

public class AppTest {

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_2() {
    App scrabble = new App();
    Integer score = 2;
    assertEquals(score, scrabble.scrabbleScore('D'));
  }

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_3() {
    App scrabble = new App();
    Integer score = 3;
    assertEquals(score, scrabble.scrabbleScore('B'));
  }

}











//Return score for letter
//Split a word into CharArray
//Add letter values to create a total score
