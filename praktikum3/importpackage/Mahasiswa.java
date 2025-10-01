package importpackage;

public class Mahasiswa {
  private String nama;
  private int umur;

  public Mahasiswa(String nama, int umur) {
    this.nama = nama;
    this.umur = umur;
  }

  public String getNama() {
    return nama;
  }

  public int getUmur() {
    return umur;
  }

  @Override
  public String toString() {
    return nama + " (Umur: " + umur + ")";
  }
}
