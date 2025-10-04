package multiple;

public class KendaraanListrik implements IsiBaterai, NyalaMesin {
  private String merk;

  public KendaraanListrik(String merk) {
    this.merk = merk;
  }

  @Override
  public void charge() {
    System.out.println(merk + " sedang di-charge...");
  }

  @Override
  public void startEngine() {
    System.out.println("Mesin " + merk + " dinyalakan tanpa suara!");
  }
}
