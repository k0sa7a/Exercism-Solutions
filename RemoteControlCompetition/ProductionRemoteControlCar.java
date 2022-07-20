class ProductionRemoteControlCar implements Comparable<ProductionRemoteControlCar>, RemoteControlCar {
  int victories = 0;
  int distance = 0;

  public void drive() {
      this.distance += 10;
  }

  public int getDistanceTravelled() {
      return this.distance;
  }

  public int getNumberOfVictories() {
      return this.victories;
  }

  public void setNumberOfVictories(int numberofVictories) {
      this.victories = numberofVictories;
  }

  @Override
  public int compareTo(ProductionRemoteControlCar car) {
      if (this.victories == car.getNumberOfVictories()) {
          return 0;
      } else if (this.victories > car.getNumberOfVictories()) {
          return 1;
      } else {
          return -1;
      }
  }
}
