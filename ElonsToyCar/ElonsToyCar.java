public class ElonsToyCar {
  int distance = 0;
  int batteryPercentage = 100;

  public ElonsToyCar() {

  }

  public static ElonsToyCar buy() {
      return new ElonsToyCar();
  }

  public String distanceDisplay() {
      return "Driven " + this.distance + " meters";
  }

  public String batteryDisplay() {
      return batteryPercentage == 0 ? "Battery empty" : "Battery at " + this.batteryPercentage + "%";
  }

  public void drive() {
      if (batteryPercentage != 0){
          this.distance += 20;
          this.batteryPercentage -= 1;
      }
  }
}
