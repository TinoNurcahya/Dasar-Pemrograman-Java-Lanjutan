package hybrid;

public class Kucing extends Mamalia {
  public Kucing(String nama) {
    super(nama);
  }

  public void suara() {
    System.out.println(nama + " mengeong.");
  }
}
