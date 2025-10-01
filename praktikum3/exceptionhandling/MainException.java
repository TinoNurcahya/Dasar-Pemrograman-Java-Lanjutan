package exceptionhandling;

import exceptionhandling.Validator;

public class MainException {
  public static void main(String[] args) {
    // contoh try-catch-finally
    try {
      Validator.cekUmur(16); // ini akan melempar exception
      System.out.println("Validasi umur sukses");
    } catch (IllegalArgumentException e) {
      System.out.println("Terjadi error: " + e.getMessage());
    } finally {
      System.out.println("Blok finally: selalu dijalankan.\n");
    }

    // contoh ArrayIndexOutOfBoundsException
    try {
      int[] angka = { 1, 2, 3 };
      System.out.println(angka[5]); // salah index
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Kesalahan array: " + e.getMessage());
    }

    // contoh NullPointerException
    try {
      String teks = null;
      System.out.println(teks.length());
    } catch (NullPointerException e) {
      System.out.println("Kesalahan null: " + e.getMessage());
    }

    // contoh NumberFormatException
    try {
      String input = "abc";
      int angka = Integer.parseInt(input);
      System.out.println("Angka: " + angka);
    } catch (NumberFormatException e) {
      System.out.println("Kesalahan format angka: " + e.getMessage());
    }
  }
}
