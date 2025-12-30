public class constructos {
  int modelYear;
  String modelName;

  public constructos(int year, String name) {
    modelYear = year;
    modelName = name;
  }

  public static void main(String[] args) {
    constructos myCar = new constructos(1969, "BMW M5");
    System.out.println(myCar.modelYear + " " + myCar.modelName);
  }
}
