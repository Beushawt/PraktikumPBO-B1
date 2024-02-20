class Titik{
    // deklarasi atribut
    double absis;
    double ordinat;
    static int counterTitik;

    //deklarasi konstruktor
    Titik(){
        absis = 0;
        ordinat = 0;
        counterTitik++;
    }

    Titik(double a, double b){
        absis = a;
        ordinat = b;
        counterTitik++;
    }

    //deklarasi metode
    void setAbsis(double a){
        absis = a;
    }

    void setOrdinat(double b){
        ordinat = b;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    int getCounterTitik(){
        return counterTitik;
    }


}