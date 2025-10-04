package abstraction;

public abstract class PerangkatElektronik {
  protected String merk;

  public PerangkatElektronik(String merk) {
    this.merk = merk;
  }

  // method abstract
  public abstract void nyalakan();

  // method non-abstract
  public void info() {
    System.out.println("Perangkat Elektronik merk: " + merk);
  }
}
