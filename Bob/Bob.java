public class Bob {

  public String hey(String string){
      String answer;
      boolean question;
      boolean allCaps = false;
      boolean onlyNonLetter = false;
      string = string.strip();
      string = string.replaceAll("[\s+]", "");
      String[] wordArray = string.split("");

      if(string.equals(string.toUpperCase())){
          allCaps = true;
      } else {
          allCaps = false;
          }

      if(string.matches("[^a-zA-Z]+")) {
          onlyNonLetter = true;
      }

      if (wordArray[wordArray.length - 1].equals("?")) {
          question = true;
      } else {
          question = false;
      }
      if (string == "") {
          answer = "Fine. Be that way!";
      } else if (onlyNonLetter && question){
          answer = "Sure.";
      }else if (allCaps && question){
          answer = "Calm down, I know what I'm doing!";
      } else if (!allCaps && question){
          answer = "Sure.";
      } else if (allCaps && !question && !onlyNonLetter){
          answer = "Whoa, chill out!";
      } else {
          answer = "Whatever.";
      }
      return answer;
  }
}
