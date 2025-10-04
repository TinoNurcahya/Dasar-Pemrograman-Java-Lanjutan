package polymorphism;

public class Mesin {
  public void hidupkan(String namaMesin) {
    System.out.println("Mesin " + namaMesin + " dinyalakan.");
  }

  public void hidupkan(String namaMesin, int kecepatan) {
    System.out.println("Mesin " + namaMesin + " dinyalakan dengan kecepatan " + kecepatan + " rpm.");
  }

  public void hidupkan(String namaMesin, double konsumsiBbm) {
    System.out.println("Mesin " + namaMesin + " dinyalakan, konsumsi BBM: " + konsumsiBbm + " L/jam.");
  }
}