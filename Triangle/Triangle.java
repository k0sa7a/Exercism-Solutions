class Triangle {
  double sideOne;
  double sideTwo;
  double sideThree;

  Triangle(double side1, double side2, double side3) throws TriangleException {
      sideOne = side1;
      sideTwo = side2;
      sideThree = side3;

      if(sideOne == 0 || sideTwo == 0 || sideThree == 0){
          throw new TriangleException();
      }

      if((sideOne > sideTwo + sideThree) || (sideTwo > sideOne + sideThree) || (sideThree > sideOne + sideTwo)){
          throw new TriangleException();
      }

  }

  boolean isEquilateral() {
      return (sideOne == sideTwo && sideTwo == sideThree) ? true : false;
  }

  boolean isIsosceles() {
      return (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ? true : false;
  }

  boolean isScalene() {
      return (sideOne != sideTwo && sideTwo != sideThree) ? true : false;
  }

}
