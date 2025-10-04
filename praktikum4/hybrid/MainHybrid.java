package hybrid;

public class MainHybrid {
  public static void main(String[] args) {
    Kucing k = new Kucing("Kitty");
    Burung b = new Burung("Cendrawasih");

    k.infoHewan(); // dari Hewan
    k.jenisMamalia(); // dari Mamalia
    k.suara(); // dari Kucing

    b.infoHewan(); // dari Hewan
    b.terbang(); // dari Burung
  }
}
