package oop;

public class ContBancar {
    // oop = object oriented programing

    // proprietatile/atributele
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false;
    private int pin = 7777;
    int incercari_activare = 0;

    // constructor = are rolul de a impune date de start
    // ca si * din formulare, reqiured fields
    public ContBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }
    //metode
    public void descriere(){
        System.out.println("Titular " + this.titularCont);
        System.out.println("IBAN " + this.iban);
        System.out.println("Sold " + this.sold);
        System.out.println("Activ" + this.activ);
        System.out.println("Nr de incercari gresite " +this.incercari_activare);
        System.out.println("--------------------");
    }
    public void activareCont(int pinUtilizator) {
        // modificam activ in true doar daca pinul este corect
        System.out.println("Buna! " + this.titularCont);
        if (pinUtilizator == this.pin) {
            System.out.println("Cardul a fost activat cu succes");
            this.activ = true;
        } else {
            System.out.println("PIN gresit");
            this.incercari_activare++;
        }
    }

    public void alimentareCont(double suma_depusa) {
            // la de avem in cont se adauga suma depusa
            this.sold = this.sold + suma_depusa;
            System.out.println("Buna! " + this.titularCont);
            System.out.println("Depunere cu succes.Ati depus suma de " + suma_depusa + "Aveti in cont suma de " + this.sold);
        }

    public void plataCard (double suma_cheltuita){
        System.out.println("Buna! " + this.titularCont);
        if (suma_cheltuita<= this.sold){
            this.sold = this.sold - suma_cheltuita;
            System.out.println("Ai cheltuit " + suma_cheltuita);
            System.out.println("Mai ai sold: " + this.sold);
        }else {
            System.out.println("Fonduri insuficiente");
        }
    }
}
