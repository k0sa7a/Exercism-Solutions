class MicroBlog {
  public String truncate(String input) {
      if (input.length() == 0 || input == null){
          return "";
      }

      String result = "";

      int[] ary = input.codePoints().toArray();

      int maxCounter = 5;
      if (ary.length < 5){
          maxCounter = ary.length;
      }

      for(int i = 0; i < maxCounter; i++){
          char[] ch = Character.toChars(ary[i]);
          for (char c : ch) {
              result += c;
          }
      }
      return result;
  }
}
