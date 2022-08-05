class LuhnValidator {
  String[] strArr;

  boolean isValid(String candidate) {
      String value = candidate.replace(" ","");
      if(value.length() <= 1){
          return false;
      }

      strArr = value.split("");

      //check if characters are numbers
      for(int i = 0; i < strArr.length; i ++){
          if(!strArr[i].matches("[0-9]")){
              return false;
          }
      }


      int[] numbersArray = integerize(strArr);

      if(checkFormula(numbersArray) == false){
          return false;
      }

      return true;
  }


  public int[] integerize(String[] str){
      int[] array = new int[str.length];
      for(int i = 0; i < str.length; i++){
          array[i] = Integer.valueOf(str[i]);
      }
      return array;
  }

      public boolean checkFormula(int[] arr){
          boolean even = (arr.length % 2 == 0);
          int sum = 0;
          if(even == true){
              for(int i = arr.length - 1; i >= 0; i --){
                  if((i+1) % 2 == 0){
                      sum += arr[i];
                      continue;
                  } else {
                      int value = (arr[i] * 2) > 9 ? (arr[i] * 2) - 9 : arr[i] * 2;
                      sum += value;
                  }
              }
          }else{
                  for(int i = arr.length - 1; i >= 0; i --){
                      if((i+1) % 2 != 0){
                          sum += arr[i];
                          continue;
                      } else {
                          int value = (arr[i] * 2) > 9 ? (arr[i] * 2) - 9 : arr[i] * 2;
                          sum += value;
                      }
                  }
              }
          boolean result = sum % 10 == 0;
          return result;
          }


}
