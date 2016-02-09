import java.util.HashMap;

import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {}

  public static Integer scrabbleScore(char letter) {
    Integer totalScore = 0;
    if (letter == 'D' || letter == 'G') {
      totalScore += 2;
    } if (letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P') {
      totalScore += 3;
    }
    return totalScore;
  }
}
