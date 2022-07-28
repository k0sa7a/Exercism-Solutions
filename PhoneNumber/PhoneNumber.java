class PhoneNumber {
  String phone;
  public PhoneNumber(String number) {
       String cleanedNumber = this.cleanNumber(number);
       String phoneNumber = cleanAreaCode(cleanedNumber);

      if(phoneNumber.length() != 10 && !(phoneNumber.length() > 11) && phoneNumber.length() != 11) {
          throw new IllegalArgumentException("incorrect number of digits");
      }

      if(this.hasLetter(number)) {
          throw new IllegalArgumentException("letters not permitted");
      }

      if(this.hasPunctuation(number)) {
          throw new IllegalArgumentException("punctuations not permitted");
      }

       if(phoneNumber.length() > 11) {
           throw new IllegalArgumentException("more than 11 digits");
       } else if (phoneNumber.charAt(0) == '0' ){
           throw new IllegalArgumentException("area code cannot start with zero");
       } else if (phoneNumber.charAt(0) == '1'){
           throw new IllegalArgumentException("area code cannot start with one");
       } else if (phoneNumber.charAt(3) == '0'){
           throw new IllegalArgumentException("exchange code cannot start with zero");
       } else if (phoneNumber.charAt(3) == '1'){
           throw new IllegalArgumentException("exchange code cannot start with one");
       } else if (phoneNumber.length() == 11 && phoneNumber.charAt(0) != '1' ){
           throw new IllegalArgumentException("11 digits must start with 1");
       } else if (phoneNumber.length() != 10){
           throw new IllegalArgumentException("incorrect number of digits");
       } else {
           phone = phoneNumber;
       }
  }

  public String getNumber () {
      return phone;
  }

  public String cleanNumber(String number){
      String result = number.strip().replaceAll("[-\s.+]", "");
      return result.replace(")", "").replace("(", "");

  }

  public String cleanAreaCode(String number){
      if(number.charAt(0) == '1' && number.length() == 11){
          return number.substring(1);
      } else {
          return number;
      }
  }

  public boolean hasLetter(String num){
      String[] numArr = num.split("");
      boolean result = false;
      for(String diggit : numArr){
          if(diggit.matches("[a-zA-Z]")) {
              result = true;
              break;
          }

      }
      return result;
  }

  public boolean hasPunctuation(String num){
      String[] numArr = num.split("");
      boolean result = false;
      for(String diggit : numArr){
          if(diggit.matches("[@:!]")) {
              result = true;
              break;
          }

      }
      return result;
  }
}
