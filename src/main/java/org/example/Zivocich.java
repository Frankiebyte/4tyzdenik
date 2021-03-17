package org.example;

public abstract class Zivocich  {
    private int pocetNoh;
    abstract void  zvuk();
    public Zivocich(int p){
        pocetNoh=p;
    }

    public int getPocetNoh() {
        return pocetNoh;
    }

    public void setPocetNoh(int pocetNoh) {
        this.pocetNoh = pocetNoh;
    }
}
