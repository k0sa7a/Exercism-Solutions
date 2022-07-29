class Proverb {
  String[] proverbWords;

  Proverb(String[] words) {
      proverbWords = words;
  }

  String recite() {
      String message = "";
      if(proverbWords.length == 0){
          return "";
      } else if (proverbWords.length == 1) {
          return "And all for the want of a " + proverbWords[0] + ".";
      } else if (proverbWords.length > 1) {

          for(int i = 0; i < proverbWords.length; i++) {
              if (i < (proverbWords.length -1)) {
                  message += "For want of a " + proverbWords[i] + " the " + proverbWords[i + 1] + " was lost.\n";
              }
          }
          message += "And all for the want of a " + proverbWords[0] + ".";
          }
      return message;
  }

}
