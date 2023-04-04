package org.example.Exercice2;

public class CompteSimple extends Compte{

    int decouvert;

    public CompteSimple(int code, float solde, int decouvert) {
        super(code, solde);
        this.decouvert = decouvert;
    }

    @Override
    public void retrait(float ret) {
        if (this.solde >= ret + decouvert){
            this.solde = this.solde = ret;
        }
    }
}
