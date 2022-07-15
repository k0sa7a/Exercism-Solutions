public class SalaryCalculator {
  public double multiplierPerDaysSkipped(int daysSkipped) {
      double result = daysSkipped > 5 ? 0.85 : 1.0;
      return result;
  }

  public int multiplierPerProductsSold(int productsSold) {
      int result = productsSold > 20 ? 13 : 10;
      return result;
  }

  public double bonusForProductSold(int productsSold) {
      return productsSold * multiplierPerProductsSold(productsSold);
  }

  public double finalSalary(int daysSkipped, int productsSold) {
      double calculation = (1000 * multiplierPerDaysSkipped(daysSkipped)) + bonusForProductSold(productsSold);
      double result = calculation > 2000.00 ? 2000.00 : calculation;
      return result;
  }
}
