package exceptionhandling;

public class Validator {

  // method dengan throws (lempar exception ke pemanggil)
  public static void cekUmur(int umur) throws IllegalArgumentException {
    if (umur < 17) {
      // lempar exception secara manual
      throw new IllegalArgumentException("Umur minimal mahasiswa adalah 17 tahun!");
    }
  }
}
