public class MOperasiTitik {
    public static void main(String[] args){
        Titik t = new Titik(4,4);
        OperasiTitik o = new OperasiTitik();

        System.out.println("titik(" + t.getAbsis() + "," + t.getOrdinat() + ")");

        //o.refleksiSumbuX(t);
        o.refleksiX(t);
        System.out.println("Titik Refleksi X: (" + t.getAbsis() + "," + t.getOrdinat() + ")");

        //o.refleksiSumbuY(t);
        o.refleksiY(t);
        System.out.println("Titik Refleksi Y: (" + t.getAbsis() + "," + t.getOrdinat() + ")");
    }
}
