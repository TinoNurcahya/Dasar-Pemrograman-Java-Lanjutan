package hierarchical;

public class Burung extends Hewan {
  private String warnaBulu;

  public Burung(String nama, int umur, String warnaBulu) {
    super(nama, umur);
    this.warnaBulu = warnaBulu;
  }

  public void terbang() {
    System.out.println(nama + " terbang dengan bulu berwarna " + warnaBulu);
  }
}
