package hybrid;

public class Hewan {
  protected String nama;

  public Hewan(String nama) {
    this.nama = nama;
  }

  public void infoHewan() {
    System.out.println("Nama Hewan: " + nama);
  }
}
