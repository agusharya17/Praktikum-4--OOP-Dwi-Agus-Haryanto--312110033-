package bangundatar;
public class Utama {
    public static void main(String[] args){
        // Buat Objek Bangun Datar, Persegi, Segitiga, Lingakaran
        BangunDatar bangunDatar = new BangunDatar();
        
        // Masukkan nilai parameter sisi persegi dengan sisi misal = 4
        Persegi persegi = new Persegi(4);
        
        // Masukkan nilai parameter alas dan tinggi dengan nilai misal alas = 8 & tinggi = 6
        Segitiga segitiga = new Segitiga(8, 6);
        
        // Masukkan nilai parameter jari- jari Lingkaran misal 30
        Lingkaran lingkaran = new Lingkaran(30);
        
        // Memanggil method Luas dan Keliling
        bangunDatar.luas();
        bangunDatar.keliling();
        
        System.out.println("Luas Persegi: " + persegi.luas());
        System.out.println("Keliling Persegi: " + persegi.keliling());
        System.out.println("Luas Segitiga: " + segitiga.luas());
        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Keliling Lingkaran: " + lingkaran.keliling());       

}