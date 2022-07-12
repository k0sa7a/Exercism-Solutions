import java.lang.StringBuilder;

class SqueakyClean {
    static String clean(String identifier) {
          if (identifier == null || identifier.isEmpty() || identifier.trim().equals("")) return "";




    for(int i = 0; i < identifier.length(); i++){

            identifier = identifier.replace(" ", "_");
                identifier = identifier.replaceAll("\\p{So}+",
                "");

            if (identifier == null || identifier.isEmpty() || identifier.trim().equals("")) return "";


            if(Character.isISOControl(identifier.charAt(i))){
                StringBuilder plainText = new StringBuilder(identifier);
                plainText.replace(i, i+1, "CTRL");
                identifier = plainText.toString();
            }

            if (identifier == null || identifier.isEmpty() || identifier.trim().equals("")) return "";


            if(identifier.charAt(i) == '-'){
                StringBuilder plainText = new StringBuilder(identifier);
                plainText.replace(i, i+1, "");
                char c = plainText.charAt(i);
                c = Character.toUpperCase(c);
                plainText.setCharAt(i , c);
                identifier = plainText.toString();
            }


            if (identifier == null || identifier.isEmpty() || identifier.trim().equals("")) return "";


            if(Character.isLetter(identifier.codePointAt(i)) == false && identifier.charAt(i) != '_'){
                StringBuilder plainText = new StringBuilder(identifier);
                plainText.deleteCharAt(i);
                identifier = plainText.toString();
            }





            identifier = identifier.replaceAll("[α-ω]",
                "");

            identifier = identifier.replaceAll("\\d",
                "");




         }



        return identifier;
    }
}
