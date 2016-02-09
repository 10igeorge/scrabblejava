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

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_4() {
    App scrabble = new App();
    Integer score = 4;
    assertEquals(score, scrabble.scrabbleScore('F'));
  }

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_5() {
    App scrabble = new App();
    Integer score = 5;
    assertEquals(score, scrabble.scrabbleScore('K'));
  }

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_8() {
    App scrabble = new App();
    Integer score = 8;
    assertEquals(score, scrabble.scrabbleScore('J'));
  }
}











//Return score for letter
//Split a word into CharArray
//Add letter values to create a total score
