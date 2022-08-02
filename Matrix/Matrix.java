class Matrix {
  String[][] matr;
  int[][] intMat;
  Matrix(String matrixAsString) {

      String[] arrayOfStrings = matrixAsString.split("\n");
      int diment = arrayOfStrings[0].split(" ").length;
      matr = new String[arrayOfStrings.length][diment];
      for(int i = 0; i < arrayOfStrings.length; i++){
          matr[i] = arrayOfStrings[i].split(" ");
      }
      intMat = new int[matr.length][matr[0].length];
          for(int i = 0; i< matr.length; i++){
              for(int j = 0; j< matr[i].length; j++){
                  intMat[i][j] = Integer.parseInt(matr[i][j]);
              }
          }
  }
  int[] getRow(int rowNumber) {
      return intMat[rowNumber - 1];
  }
  int[] getColumn(int columnNumber) {
      int[][] columnMat = new int[matr[0].length][matr.length];
      for(int i = 0; i< matr[0].length; i++){
          for(int j = 0; j< matr.length; j++){
              columnMat[i][j] = Integer.parseInt(matr[j][i]);
          }
      }
      return columnMat[columnNumber -1];
  }
}
