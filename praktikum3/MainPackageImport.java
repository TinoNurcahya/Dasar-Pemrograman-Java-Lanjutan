import importpackage.Mahasiswa;

public class MainPackageImport {
  public static void main(String[] args) {
    Mahasiswa mhs = new Mahasiswa("Tino", 19);

    System.out.println("Nama Mahasiswa: " + mhs.getNama());
    System.out.println("Umur Mahasiswa: " + mhs.getUmur());
  }
}
