public class LogLevels {

  public static String message(String logLine) {
      int index = logLine.lastIndexOf(":");
      String info = logLine.substring(index+1);
      return info.trim();
  }

  public static String logLevel(String logLine) {
      int indexStart = logLine.indexOf("[");
      int indexEnd = logLine.indexOf("]");
      String info = logLine.substring(indexStart + 1, indexEnd);
      return info.toLowerCase();
  }

  public static String reformat(String logLine) {
      return message(logLine) + " (" + logLevel(logLine) + ")";
  }
}
