public class PrismaSegitiga{
    private Segitiga alas;
    private double tinggiPrisma;

    public PrismaSegitiga (Segitiga alas, double tinggiPrisma){
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
    }
    // public double getTinggiPrisma(){
    //     return tinggiPrisma;
    // }
    public double hitungLuasPermukaan(){
        double luasAlas = alas.hitungLuas();
        double kelilingAlas = alas.getAlas() * 3;
        return (2 * luasAlas) + (kelilingAlas * tinggiPrisma);
    }
    public double hitungVolume(){
        return alas.hitungLuas() * tinggiPrisma;
    }
}