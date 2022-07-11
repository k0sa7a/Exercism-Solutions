class Scrabble {
  String word;
  Scrabble(String word) {
      this.word = word;
  }

  int getScore() {
      String upcasedWordStr = this.word.toUpperCase();
      char[] upcasedWord = upcasedWordStr.toCharArray();
      int onePoint = 0;
      int twoPoints = 0;
      int threePoints = 0;
      int fourPoints = 0;
      int fivePoints = 0;
      int eightPoints = 0;
      int tenPoints = 0;

      for (int i = 0; i < upcasedWord.length; i++) {
          if (upcasedWord[i] == 'A' || upcasedWord[i] == 'E' || upcasedWord[i] == 'I' || upcasedWord[i] == 'O' || upcasedWord[i] == 'U' || upcasedWord[i] == 'L' || upcasedWord[i] == 'N' || upcasedWord[i] == 'R' || upcasedWord[i] == 'S' || upcasedWord[i] == 'T') {
              onePoint += 1;
          } else if (upcasedWord[i] == 'D' || upcasedWord[i] == 'G' ) {
              twoPoints += 1;
          } else if (upcasedWord[i] == 'B' || upcasedWord[i] == 'C' || upcasedWord[i] == 'M' || upcasedWord[i] == 'P') {
              threePoints += 1;
          } else if (upcasedWord[i] == 'F' || upcasedWord[i] == 'H' || upcasedWord[i] == 'V' || upcasedWord[i] == 'W' || upcasedWord[i] == 'Y' ) {
              fourPoints += 1;
          } else if (upcasedWord[i] == 'K') {
              fivePoints += 1;
          } else if (upcasedWord[i] == 'J' || upcasedWord[i] == 'X') {
              eightPoints += 1;
          } else if (upcasedWord[i] == 'Q' || upcasedWord[i] == 'Z') {
              tenPoints += 1;
          }
      }
      return onePoint + twoPoints * 2 + threePoints * 3 + fourPoints * 4 + fivePoints * 5 + eightPoints * 8 + tenPoints * 10;
  }

}
