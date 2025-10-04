public class Mahasiswa {
  // ===== Access Modifier =====
  private String nama;
  private int nim;
  private double ipk;

  // ===== Non-Access Modifier =====
  public static String universitas = "Universitas Informatika";
  public final String JURUSAN = "Teknik Informatika";

  // Constructor
  public Mahasiswa(String nama, int nim, double ipk) {
    this.nama = nama;
    this.nim = nim;
    this.ipk = ipk;
  }

  // ===== Getter =====
  public String getNama() {
    return nama;
  }

  public int getNim() {
    return nim;
  }

  public double getIpk() {
    return ipk;
  }

  // ===== Setter =====
  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setNim(int nim) {
    this.nim = nim;
  }

  public void setIpk(double ipk) {
    if (ipk >= 0 && ipk <= 4.0) {
      this.ipk = ipk;
    } else {
      System.out.println("Nilai IPK tidak valid!");
    }
  }
}