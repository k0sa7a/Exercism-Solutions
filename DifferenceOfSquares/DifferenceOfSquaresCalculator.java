class DifferenceOfSquaresCalculator {

  int computeSquareOfSumTo(int input) {
      int sum = 0;
      int[] arr = new int[input];

      for( int i = 0; i < arr.length; i++) {
          arr[i] = i + 1;
          sum += arr[i];
      }
      return sum * sum;
  }

  int computeSumOfSquaresTo(int input) {
      int sum = 0;
      int[] arr = new int[input];

      for( int i = 0; i < arr.length; i++) {
          arr[i] = (i + 1) * (i + 1);
          sum += arr[i];
      }
      return sum;
  }

  int computeDifferenceOfSquares(int input) {
      return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
  }

}
