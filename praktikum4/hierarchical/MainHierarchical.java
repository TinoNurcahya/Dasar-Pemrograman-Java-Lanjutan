package hierarchical;

public class MainHierarchical {
  public static void main(String[] args) {
    Kucing k = new Kucing("Kitty", 2, "Persia");
    Burung b = new Burung("Cendrawasih", 3, "Emas");

    k.tampilInfo(); // dari Hewan
    k.suara(); // dari Kucing

    b.tampilInfo(); // dari Hewan
    b.terbang(); // dari Burung
  }
}
