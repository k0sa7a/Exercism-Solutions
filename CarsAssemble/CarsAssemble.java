public class CarsAssemble {

  public double productionRatePerHour(int speed) {
      double carsProduction = speed * 221;
      if(speed >= 10){
          return carsProduction * 77/100;
      } else if (speed == 9) {
          return carsProduction * 80/100;
      } else if (speed >= 5 && speed <= 8){
          return (carsProduction * 90/100);
      } else {
          return carsProduction;
      }
  }

  public int workingItemsPerMinute(int speed) {
      return (int) productionRatePerHour(speed)/60;
  }
}
