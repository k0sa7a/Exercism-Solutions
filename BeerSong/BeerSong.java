public class BeerSong {
  String result = "";

  public String sing(int startBottles, int lessBottles) {
      for(int i = startBottles; i > (startBottles - lessBottles); i --){
          if(i >= 3){
              result += i + " bottles of beer on the wall, " + i + " bottles of beer.\n" + "Take one down and pass it around, " + (i-1) + " bottles of beer on the wall.\n\n";
              } else if(i == 2) {
                  result += i + " bottles of beer on the wall, " + i + " bottles of beer.\n" + "Take one down and pass it around, " + (i-1) + " bottle of beer on the wall.\n\n";
              } else if (i == 1){
                  result += i + " bottle of beer on the wall, " + i + " bottle of beer.\n" + "Take it down and pass it around, no more bottles of beer on the wall.\n\n";
              } else {
                  result += "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy " + "some more, 99 bottles of beer on the wall.\n\n";
              }

          }
          return result;
  }

  public String singSong() {
      this.sing(99, 100);
      return result;
  }
}
