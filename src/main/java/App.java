import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {}

  public static Integer scrabbleScore(char letter) {
    Integer totalScore = 0;

    if (letter == 'D' || letter == 'G') {
      totalScore += 2;
    }
    if (letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P') {
      totalScore += 3;
    }
    char[] score4 = { 'F', 'H', 'V', 'W', 'Y' };
    for (char c : score4){
      if (c == letter){
        totalScore += 4;
      }
    }
    if (letter == 'K'){
      totalScore += 5;
    }
    if (letter == 'J' || letter == 'X') {
      totalScore += 8;
    }
    if (letter == 'Q' || letter == 'Z') {
      totalScore += 10;
    }
    char[] score1 = { 'A', 'E', 'I', 'O', 'U', 'L', 'N', 'R', 'S', 'T' };
    for (char x : score1){
      if (x == letter){
      totalScore +=1;
      }
    }
    return totalScore;
  }
  //
  // public static
}
