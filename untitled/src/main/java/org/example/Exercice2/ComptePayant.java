package org.example.Exercice2;

public class ComptePayant extends Compte{

    public ComptePayant(int code, float solde) {
        super(code, solde);
    }

    @Override
    public void versement(float vers) {
        this.solde = this.solde + vers - (vers*5/100);
    }

    @Override
    public void retrait(float ret) {
        this.solde = this.solde - ret - (ret*5/100);;
    }
}
