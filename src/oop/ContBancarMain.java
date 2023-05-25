package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop

        // initializam obiecte de tip ContBancar
        // instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("Raul A", "Ro001");
        ContBancar cont2 = new ContBancar("Larisa A","Ro002");

        // apelam metoda descriere
        // cont1.descriere();
        // cont2.descriere();

        // activam contul
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);

        // alimentam contul
        cont1.alimentareCont(200.5);
        cont2.alimentareCont(300);
        cont2.alimentareCont(200);

        // cheltuim mai mult decat avem pe card
        cont1.plataCard(10000);

        // cheltuim mai putin decat avem pe card
        cont1.plataCard(10);

        cont1.descriere();
        cont2.descriere();
    }
}
