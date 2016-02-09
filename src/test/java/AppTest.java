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

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_10() {
    App scrabble = new App();
    Integer score = 10;
    assertEquals(score, scrabble.scrabbleScore('Q'));
  }

  @Test
  public void scrabbleScore_returnsAScrabbleScoreForALetter_1() {
    App scrabble = new App();
    Integer score = 1;
    assertEquals(score, scrabble.scrabbleScore('A'));
  }

  @Test
  public void letterArray_splitWordIntoCharArray_splitWord() {
    App scrabble = new App();
    Integer score = 4;
    assertEquals(score, scrabble.letterArray("AB"));
  }
}











//Return score for letter
//Split a word into CharArray
//Add letter values to create a total score
