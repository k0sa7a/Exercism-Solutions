class NeedForSpeed {
  public int speed;
  public int batteryDrain;
  public int carDistanceDriven;
  public int currentBattery = 100;
  public boolean batteryDrained = false;

  public NeedForSpeed (int speed, int batteryDrain) {
      this.speed = speed;
      this.batteryDrain = batteryDrain;
  }

  public boolean batteryDrained() {
      return this.batteryDrained;
  }

  public int distanceDriven() {
      return this.carDistanceDriven;
  }

  public void drive() {
      if(currentBattery >= this.batteryDrain) {
          this.carDistanceDriven += this.speed;
          this.currentBattery -= this.batteryDrain;
          this.batteryDrained = currentBattery == 0 ? true : false;
      }
  }

  public static NeedForSpeed nitro() {
      return new NeedForSpeed(50, 4);
  }
}

class RaceTrack {
  private int distance;

  public RaceTrack (int distance) {
      this.distance = distance;
  }

  public boolean tryFinishTrack(NeedForSpeed car) {
      double dblDistance = this.distance;
      double drives = dblDistance / car.speed;
      return (drives * car.batteryDrain) > car.currentBattery ? false : true;
  }
}
