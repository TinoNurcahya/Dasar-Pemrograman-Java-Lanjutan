public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("Tino", 1234567, 3.5);

        System.out.println("Nama : " + mhs1.getNama());
        System.out.println("NIM  : " + mhs1.getNim());
        System.out.println("IPK  : " + mhs1.getIpk());

        // Update data dengan setter
        mhs1.setNama("Tino Nurcahya");
        mhs1.setIpk(3.9);

        System.out.println("\nSetelah update:");
        System.out.println("Nama : " + mhs1.getNama());
        System.out.println("NIM  : " + mhs1.getNim());
        System.out.println("IPK  : " + mhs1.getIpk());

        // Akses static & final
        System.out.println("\nUniversitas: " + Mahasiswa.universitas);
        System.out.println("Jurusan    : " + mhs1.JURUSAN);
    }
}
