import java.util.List;
import java.util.Set;
import java.util.*;

class Matrix {
    List<List<Integer>> matrix;
    Set<MatrixCoordinate> result;

    Matrix(List<List<Integer>> values) {
        matrix = values;
        result = new HashSet<MatrixCoordinate>();
    }

    Set<MatrixCoordinate> getSaddlePoints() {
        if(matrix.size() == 0){
            return result;
        }

        for(int i = 0; i < matrix.size(); i ++){
            Integer maxRowVal = Collections.max(matrix.get(i));

            for(int j = 0; j < matrix.get(0).size(); j ++){
                ArrayList<Integer> columValues = new ArrayList<Integer>();
                for(int k = 0; k < matrix.size(); k ++){
                    columValues.add(matrix.get(k).get(j));
                }
                if(matrix.get(i).get(j) >= maxRowVal && matrix.get(i).get(j) <= Collections.min(columValues) ) {
                    MatrixCoordinate matrixEntry = new MatrixCoordinate(i + 1, j + 1);
                    result.add(matrixEntry);
                }
            }
        }

        return result;
    }
}
