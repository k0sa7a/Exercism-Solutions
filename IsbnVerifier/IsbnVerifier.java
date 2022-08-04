class IsbnVerifier {

  boolean isValid(String stringToVerify) {
      stringToVerify = stringToVerify.replace("-", "");
      String[] strArr = new String[10];
      if(stringToVerify.length() != 10) {
          return false;
      } else {
          strArr = stringToVerify.split("");
      }
      //check if last character is number or X
      if(!strArr[strArr.length-1].matches("[0-9]") && !strArr[strArr.length-1].matches("X")) {
          return false;
      }

      //check if characters 1-8 are numbers
      for(int i = 0; i < 9; i ++){
          if(!strArr[i].matches("[0-9]")){
              return false;
          }
      }

      //check if calculation is correct
      int[] numbersArray = integerize(strArr);
      if(checkFormula(numbersArray) == false){
          return false;
      }

      return true;
  }

  public int[] integerize(String[] str){
      int[] array = new int[10];
      for(int i = 0; i < 10; i++){
          if(i < 9){
              array[i] = Integer.valueOf(str[i]);
          } else {
              array[i] = str[i].equals("X") ? 10 : Integer.valueOf(str[i]);
          }
      }
      return array;
  }

  public boolean checkFormula(int[] arr){
      return (arr[0] * 10 + arr[1] * 9 + arr[2] * 8 + arr[3] * 7 + arr[4] * 6 + arr[5] * 5 + arr[6] * 4 + arr[7] * 3 + arr[8] * 2 + arr[9] * 1) % 11 == 0;
  }

}
