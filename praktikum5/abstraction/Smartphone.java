package abstraction;

public class Smartphone implements PengisiDaya {
  private String merk;

  public Smartphone(String merk) {
    this.merk = merk;
  }

  @Override
  public void isiDaya() {
    System.out.println("Smartphone " + merk + " sedang diisi daya menggunakan kabel USB-C.");
  }
}