class Darts {
  String status;

  Darts(double x, double y) {
      if(x*x + y*y <= 1*1){
          status = "inner";
      } else if (x*x + y*y <= 5*5){
          status = "middle";
      } else if (x*x + y*y <= 10*10){
          status = "outer";
      } else {
          status = "missed";
      }
  }

  int score() {
      if(this.status == "inner"){
          return 10;
      } else if (this.status == "middle") {
          return 5;
      }else if (this.status == "outer") {
          return 1;
      } else  {
          return 0;
      }
  }

}
