package single;

public class Mobil extends Kendaraan {
  private String bahanBakar;

  public Mobil(String merk, int tahun, String bahanBakar) {
    super(merk, tahun);
    this.bahanBakar = bahanBakar;
  }

  public void infoMobil() {
    info();
    System.out.println("Bahan Bakar: " + bahanBakar);
  }
}
