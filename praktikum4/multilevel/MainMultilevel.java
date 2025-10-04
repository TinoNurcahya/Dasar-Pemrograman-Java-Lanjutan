package multilevel;

public class MainMultilevel {
  public static void main(String[] args) {
    MahasiswaAktif mhs = new MahasiswaAktif("Carla", "2301123", "Teknik Informatika", 5);

    mhs.tampilInfo(); // dari Mahasiswa
    mhs.tampilJurusan(); // dari MahasiswaS1
    mhs.tampilStatus(); // dari MahasiswaAktif
  }
}
