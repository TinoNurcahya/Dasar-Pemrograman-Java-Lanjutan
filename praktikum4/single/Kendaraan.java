package single;

public class Kendaraan {
  private String merk;
  private int tahun;

  public Kendaraan(String merk, int tahun) {
    this.merk = merk;
    this.tahun = tahun;
  }

  public void info() {
    System.out.println("Merk: " + merk + ", Tahun: " + tahun);
  }
}
