package abstraction;

public class TV extends PerangkatElektronik {
  public TV(String merk) {
    super(merk);
  }

  @Override
  public void nyalakan() {
    System.out.println("TV " + merk + " dinyalakan dengan remote.");
  }
}
