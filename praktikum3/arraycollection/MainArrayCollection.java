package arraycollection;

import java.util.ArrayList;
import java.util.HashMap;

import importpackage.Mahasiswa;

public class MainArrayCollection {
  public static void main(String[] args) {
    //  Array 
    String[] jurusan = { "Teknik Informatika", "Sistem Informasi", "Rekayasa Perangkat Lunak" };

    System.out.println("Daftar Jurusan (Array):");
    for (String j : jurusan) {
      System.out.println("- " + j);
    }

    //  ArrayList 
    ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();
    daftarMahasiswa.add(new Mahasiswa("Tino", 19));
    daftarMahasiswa.add(new Mahasiswa("Budi", 20));
    daftarMahasiswa.add(new Mahasiswa("Carla", 21));

    System.out.println("\nDaftar Mahasiswa (ArrayList):");
    for (Mahasiswa m : daftarMahasiswa) {
      System.out.println("- " + m);
    }

    //  HashMap 
    HashMap<String, Integer> nilaiMahasiswa = new HashMap<>();
    nilaiMahasiswa.put("Tino", 85);
    nilaiMahasiswa.put("Budi", 88);
    nilaiMahasiswa.put("Carla", 90);

    System.out.println("\nNilai Mahasiswa (HashMap):");
    for (String nama : nilaiMahasiswa.keySet()) {
      System.out.println("- " + nama + " : " + nilaiMahasiswa.get(nama));
    }
  }
}
