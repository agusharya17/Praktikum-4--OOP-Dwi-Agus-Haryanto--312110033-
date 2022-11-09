package bangundatar;

public class Lingkaran extends BangunDatar{
    // Membuat Variabel Lingkaran
    int r;
    
    public Lingkaran(int r){
        this.r = r;
    }
    
    @Override
    public float luas(){
        return (float) (Math.PI*r*r);
    }
    
    @Override
    public float keliling(){
        return (float)(Math.PI*r);
    }
    
}
