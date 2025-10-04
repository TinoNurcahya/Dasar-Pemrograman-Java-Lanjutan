package multilevel;

public class Mahasiswa {
  protected String nama;
  protected String nim;

  public Mahasiswa(String nama, String nim) {
    this.nama = nama;
    this.nim = nim;
  }

  public void tampilInfo() {
    System.out.println("Nama: " + nama + ", NIM: " + nim);
  }
}
