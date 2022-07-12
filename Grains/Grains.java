import java.math.BigInteger;

class Grains {
    BigInteger[] board;

    public Grains() {
        board = new BigInteger[64];
        board[0] = new BigInteger("1");

        for (int i = 1 ; i < board.length; i++){
        board[i] = board[i - 1].multiply(new BigInteger("2"));
        }
    }




    BigInteger grainsOnSquare(final int square) {
        if(square > 64 || square < 1){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        return this.board[square - 1];
    }

    BigInteger grainsOnBoard() {
        BigInteger sum = new BigInteger("0");
        for(BigInteger grain : board){
            sum = sum.add(grain);
        }
        return sum;
    }

}
