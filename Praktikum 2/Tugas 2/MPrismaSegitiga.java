public class MPrismaSegitiga {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga(3, 4);
        double tinggiPrisma = 5;
        PrismaSegitiga Prisma = new PrismaSegitiga(segitiga, tinggiPrisma);
        
        double volume = Prisma.hitungVolume();
        double luasPermukaan = Prisma.hitungLuasPermukaan();
        
        System.out.println("Volume Prisma Segitiga: " + volume + " Satuan.");
        System.out.println("Luas Permukaan Prisma Segitiga: " + luasPermukaan + " Satuan.");
    }
}
