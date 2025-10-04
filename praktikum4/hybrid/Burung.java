package hybrid;

public class Burung extends Hewan {
  public Burung(String nama) {
    super(nama);
  }

  public void terbang() {
    System.out.println(nama + " bisa terbang.");
  }
}
