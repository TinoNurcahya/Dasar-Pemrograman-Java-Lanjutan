package hierarchical;

public class Hewan {
  protected String nama;
  protected int umur;

  public Hewan(String nama, int umur) {
    this.nama = nama;
    this.umur = umur;
  }

  public void tampilInfo() {
    System.out.println("Nama Hewan: " + nama + ", Umur: " + umur + " tahun");
  }
}
