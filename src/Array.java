public class Array {
    public static void main(String[] args) {

        // declarare si initializare
        String[] elevi = {"Gigel", "Costel", "Sara", "Ion", "Mara"};
        int[] numere = {1, 33, 81, 99, 201};
        // contine mai multe elemente de aceelas tip
        // accesam elementele prin index, care incepe intotdeauna de la 0
        // are dimensiune fixa
        // are proprietatea lenght care arata dimensiunea array'ului

        System.out.println(elevi[2]);
        elevi[2] = "Sebi";
        System.out.println(elevi[2]);
        System.out.println(elevi.length);
        // cum printam ultimul element indiferent de marime?
        System.out.println("last place: " + elevi[elevi.length-1]);

        // declarare si alocare de memorie
        int[] note = new int[5];
        System.out.println(note[1]);
        note[0]=10;
        note[1]=7;
        note[2]=9;
        note[3]=5;
        System.out.println(note[1]);


    }
}
