import java.util.Arrays;
import java.util.List;
class Connect {
    private final List<String> board;
    public Connect(String[] board) {
        this.board = Arrays.asList(board);
    }
    public Winner computeWinner() {
        for (int i = 0; i < board.get(0).length(); i++)
            if (board.get(0).charAt(i) == 'O')
                if (findWay(0, i, 'O', new Pair(-1, -1))) return Winner.PLAYER_O;
        for (int i = 0; i < board.size(); i++)
            if (board.get(i).charAt(i) == 'X')
                if (findWay(i, i, 'X', new Pair(-1, -1))) return Winner.PLAYER_X;
        return Winner.NONE;
    }
    private boolean findWay(int y, int x, char player, Pair lastPoint) {
        if (player == 'O') {
            if (y == board.size() - 1) return true;
        } else if (x - y == board.get(0).length() - 1) return true;
        if (y != 0 && x != 0
                && lastPoint.y() != y - 1 && lastPoint.x() != x - 2
                && board.get(y - 1).charAt(x - 1) == player)
            if (findWay(y - 1, x - 1, player, new Pair(y, x))) return true;
        if (y != 0 && x != board.get(y).length() - 1
                && lastPoint.y() != y - 1 && lastPoint.x() != x + 2
                && board.get(y - 1).charAt(x + 1) == player)
            if (findWay(y - 1, x + 1, player, new Pair(y, x))) return true;
        if (y != board.size() - 1 && x != 0
                && lastPoint.y() != y + 1 && lastPoint.x() != x - 2
                && board.get(y + 1).charAt(x - 1) == player)
            if (findWay(y + 1, x - 1, player, new Pair(y, x))) return true;
        if (y != board.size() - 1 && x != board.get(y).length() - 1
                && lastPoint.y() != y + 1 && lastPoint.x() != x + 2
                && board.get(y + 1).charAt(x + 1) == player)
            if (findWay(y + 1, x + 1, player, new Pair(y, x))) return true;
        if (x - y != 0
                && lastPoint.x() != x - 2
                && board.get(y).charAt(x - 2) == player)
            if (findWay(y, x - 2, player, new Pair(y, x))) return true;
        if (x - y != board.get(y).length() - 1
                && lastPoint.x() != x + 2
                && board.get(y).charAt(x + 2) == player)
            return findWay(y, x + 2, player, new Pair(y, x));
        return false;
    }
}
record Pair(int y, int x) {
}
