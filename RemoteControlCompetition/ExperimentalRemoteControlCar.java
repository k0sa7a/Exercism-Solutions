public class ExperimentalRemoteControlCar implements RemoteControlCar {
  int distance = 0;

  public void drive() {
      this.distance += 20;
  }

  public int getDistanceTravelled() {
      return this.distance;
  }
}
