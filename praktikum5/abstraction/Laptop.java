package abstraction;

public class Laptop extends PerangkatElektronik {
  public Laptop(String merk) {
    super(merk);
  }

  @Override
  public void nyalakan() {
    System.out.println("Laptop " + merk + " dinyalakan dengan tombol power.");
  }
}
