import java.util.List;
import java.util.*;

class HandshakeCalculator {

    List<Signal> calculateHandshake(int number) {
        String binary = this.toBinaryConversion(number);
        List<Signal> result = new ArrayList<Signal>();

        if(binary.length() == 0){
            return result;
        }

        String[] binArr = binary.split("");
        if(binArr.length >= 1 && binArr[binArr.length - 1].equals("1")){
            result.add(Signal.WINK);
        }

        if(binArr.length >= 2 && binArr[binArr.length - 2].equals("1")){
            result.add(Signal.DOUBLE_BLINK);
        }

        if(binArr.length >= 3 && binArr[binArr.length - 3].equals("1")){
            result.add(Signal.CLOSE_YOUR_EYES);
        }

        if(binArr.length >= 4 && binArr[binArr.length - 4].equals("1")){
            result.add(Signal.JUMP);
        }

        if(binArr.length >= 5 && binArr[binArr.length - 5].equals("1")){
            Collections.reverse(result);
        }

        return result;
    }

    String toBinaryConversion(int num) {
        String bin = Integer.toBinaryString(num);
        return bin;
    }

}
