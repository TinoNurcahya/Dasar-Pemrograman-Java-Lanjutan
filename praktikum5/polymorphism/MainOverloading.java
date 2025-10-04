package polymorphism;

public class MainOverloading {
  public static void main(String[] args) {
    Mesin mesin = new Mesin();

    mesin.hidupkan("Diesel");
    mesin.hidupkan("Bensin", 3000);
    mesin.hidupkan("Listrik", 1.5);
  }
}
