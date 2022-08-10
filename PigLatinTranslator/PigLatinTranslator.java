public class PigLatinTranslator {


  public String translate(String input) {
      if(input.contains(" ")){
          String multiWordedResult = "";
          String[] arr = input.split(" ");
          for(int i = 0; i < arr.length; i ++){
              multiWordedResult += this.translate(arr[i]) + " ";
          }
          return multiWordedResult.trim();
      }

      input = this.vowelTransformer(input);
      input = this.simpleConsTransformer(input);

      return input;
  }

  public String vowelTransformer(String word){
      if(word.substring(0, 2).matches("xr") || word.substring(0, 2).matches("yt")){
          return word += "ay";
      } else if(word.substring(0, 1).matches("[aeiou]")){
          return word += "ay";
      } else {
          return word;
      }
  }

  public String simpleConsTransformer(String word){
      if(word.substring(0, 2).matches("xr") || word.substring(0, 2).matches("yt") || word.substring(0, 1).matches("[aeiou]")){
          return word;
      } else {
          String ending = "";
          for(int i = 0; i < word.length(); i++){
              if (word.substring(i, i+1).matches("y") && i ==0){
                  ending += word.substring(i, i+1);
              } else if(word.substring(i, i+1).matches("[a-z&&[^aeiou]]") && (!word.substring(i, i+1).matches("y"))){
                  ending += word.substring(i, i+1);
              } else if (word.substring(i, i+1).matches("u") && word.substring(i-1, i).matches("q")){
                  ending += word.substring(i, i+1);
                  word = word.substring(i+1, word.length());
                  word += ending + "ay";
                  break;
              } else if (word.substring(i, i+1).matches("y") && i != 0 && word.substring(i-1, i).matches("[a-z&&[^aeiou]]")) {
                  word = word.substring(i, word.length());
                  word += ending + "ay";
                  break;
              } else {
                  word = word.substring(i, word.length());
                  word += ending + "ay";
                  break;
              }
          }
          return word;
      }
  }

}
