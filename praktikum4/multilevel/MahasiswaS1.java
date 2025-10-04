package multilevel;

public class MahasiswaS1 extends Mahasiswa {
  protected String jurusan;

  public MahasiswaS1(String nama, String nim, String jurusan) {
    super(nama, nim);
    this.jurusan = jurusan;
  }

  public void tampilJurusan() {
    System.out.println("Jurusan: " + jurusan);
  }
}
