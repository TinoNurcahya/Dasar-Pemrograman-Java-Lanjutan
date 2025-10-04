package polymorphism;

public class MainOverriding {
  public static void main(String[] args) {
    Kendaraan k1 = new Mobil();
    Kendaraan k2 = new Motor();

    k1.jalan(); // Panggil method di Mobil
    k2.jalan(); // Panggil method di Motor
  }
}
