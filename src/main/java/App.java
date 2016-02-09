import java.util.HashMap;
import java.util.ArrayList;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;

import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

  get("/form", (request, response) -> {
    HashMap model = new HashMap();
    model.put("template", "templates/form.vtl");
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());

  get("/score", (request, response) -> {
    HashMap model = new HashMap();
    model.put("template", "templates/score.vtl");

    String word = request.queryParams("word");
    Integer score = letterArray(word);
    model.put("score", score);
    return new ModelAndView(model, layout);
  }, new VelocityTemplateEngine());
}

  public static Integer scrabbleScore(char letter) {


    if (letter == 'D' || letter == 'G') {
      return 2;
    }
    if (letter == 'B' || letter == 'C' || letter == 'M' || letter == 'P') {
      return 3;
    }
    char[] score4 = { 'F', 'H', 'V', 'W', 'Y' };
    for (char c : score4){
      if (c == letter){
        return 4;
      }
    }
    if (letter == 'K'){
      return 5;
    }
    if (letter == 'J' || letter == 'X') {
      return 8;
    }
    if (letter == 'Q' || letter == 'Z') {
      return 10;
    }
      return 1;
  }

  public static Integer letterArray(String word) {
    Integer totalScore = 0;
    word = word.toUpperCase();
    char[] splitWord = word.toCharArray();
    for (char c : splitWord){
      totalScore += scrabbleScore(c);
    }
    return totalScore;
  }
}
