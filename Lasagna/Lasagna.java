public class Lasagna {
  // TODO: define the 'expectedMinutesInOven()' method
  public int expectedMinutesInOven() {
      return 40;
  }
  // TODO: define the 'remainingMinutesInOven()' method
  public int remainingMinutesInOven(int ovenTime){
      return this.expectedMinutesInOven() - ovenTime;
  }
  // TODO: define the 'preparationTimeInMinutes()' method
  public int preparationTimeInMinutes(int layersCount){
      return layersCount * 2;
  }
  // TODO: define the 'totalTimeInMinutes()' method
  public int totalTimeInMinutes(int layersCount, int ovenTime){
      return preparationTimeInMinutes(layersCount) + ovenTime;
  }
}
