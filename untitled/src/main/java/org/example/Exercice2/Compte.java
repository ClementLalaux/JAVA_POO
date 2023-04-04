package org.example.Exercice2;

public class Compte {

    static int nbCompte;

    int code;
    float solde;

    public Compte(int code, float solde) {
        this.code = nbCompte++;
        this.solde = solde;
    }

    public void versement(float vers){
        this.solde = this.solde+vers;
    }

    public void retrait(float ret){
        if(this.solde>=ret){
            this.solde = this.solde-ret;
        }
    }

}
