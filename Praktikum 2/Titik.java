public class Titik{
    // deklarasi atribut
    double absis;
    double ordinat;
    static int counterTitik;

    //deklarasi konstruktor
    public Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    public Titik(double a, double b){
        absis = a;
        ordinat = b;
        counterTitik++;
    }

    //deklarasi metode
    public void setAbsis(double a){
        absis = a;
    }

    public void setOrdinat(double b){
        ordinat = b;
    }

    public double getAbsis(){
        return absis;
    }

    public double getOrdinat(){
        return ordinat;
    }

    public int getCounterTitik(){
        return counterTitik;
    }


}