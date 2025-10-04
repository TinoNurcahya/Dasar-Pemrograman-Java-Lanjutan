package multilevel;

public class MahasiswaAktif extends MahasiswaS1 {
  private int semester;

  public MahasiswaAktif(String nama, String nim, String jurusan, int semester) {
    super(nama, nim, jurusan);
    this.semester = semester;
  }

  public void tampilStatus() {
    System.out.println("Semester: " + semester);
  }
}
