class BirdWatcher {
  private final int[] birdsPerDay;
  private static final int[] LAST_WEEK_BIRDS = {0, 2, 5, 3, 7, 8, 4};

  public BirdWatcher(int[] birdsPerDay) {
      this.birdsPerDay = birdsPerDay.clone();
  }

  public int[] getLastWeek() {
      return LAST_WEEK_BIRDS;
  }

  public int getToday() {
      if (birdsPerDay != null && birdsPerDay.length >= 1){
          return birdsPerDay[birdsPerDay.length -1];
      } else {
          return 0;
      }

  }

  public void incrementTodaysCount() {
      birdsPerDay[birdsPerDay.length -1] += 1;
  }

  public boolean hasDayWithoutBirds() {
      boolean birdlessDay = false;
      for (int bird : birdsPerDay) {
          if(bird == 0){
          birdlessDay = true;
          }
      }
      return birdlessDay;
  }

  public int getCountForFirstDays(int numberOfDays) {
      if (numberOfDays > 7) {
          numberOfDays = 7;
      }
      int numberOfBirds = 0;
      for (int i = 0; i <= numberOfDays -1; i++){
          numberOfBirds += birdsPerDay[i];
      }
      return numberOfBirds;
  }

  public int getBusyDays() {
      int busyDays = 0;
      for (int bird : birdsPerDay) {
          if(bird >= 5){
          busyDays += 1;
          }
      }
      return busyDays;
  }
}
