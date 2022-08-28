import java.util.*;

class MinesweeperBoard {
    List<char[]> field;

    public MinesweeperBoard(List<String> input){
        List<char[]> result = new ArrayList<char[]>();

        for(String str : input) {
            result.add(str.toCharArray());
        }

        field = result;
    }

    public List<String> withNumbers(){
        for(int i = 0; i < field.size(); i++) {
            char[] row = field.get(i);
            for(int j = 0; j < row.length; j++) {
                if(row[j] == '*') {
                    int rowUpperBound = Math.max(i - 1, 0);
                    int rowLowerBound = Math.min(i + 1, (field.size() - 1));
                    while(rowUpperBound <= rowLowerBound) {
                        int colLeftBound = Math.max(j - 1, 0);
                        int colRightBound = Math.min(j + 1, (row.length - 1));
                        while(colLeftBound <= colRightBound) {
                            Character tile = field.get(rowUpperBound)[colLeftBound];
                            if(tile == '*') {
                                colLeftBound++;
                                continue;
                            }
                            if(Character.isDigit(tile)) {
                                int mineCount = Character.getNumericValue(field.get(rowUpperBound)[colLeftBound]) + 1;
                                field.get(rowUpperBound)[colLeftBound] = Character.forDigit(mineCount, 10);
                            } else {
                                field.get(rowUpperBound)[colLeftBound] = '1';
                            }
                            colLeftBound++;
                        }
                        rowUpperBound++;
                    }
                }
            }
        }



        List<String> result = new ArrayList<String>();
        for(char[] arr : field) {
            String strRow = "";
            for(char c : arr) {
                strRow += c;
            }
            result.add(strRow);
        }
        return result;
    }

}
