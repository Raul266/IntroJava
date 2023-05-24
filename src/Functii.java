public class Functii {
        // functie  =  logica delimiteta care poate fi refolosita
        // nu putem folosi spatii in nume
        // nu putem defini o functie in alta functie

        // EX: o functie care ne printeaza ceva pe ecran
        // nu de da nici un raspuns
        // nu are parametrii
        public static void printGreeting() {
            System.out.println("Buna ziua!Bine ati venit!");
        }

        // EX: o functie care ne printeaza ceva pe ecran
        // nu de da nici un raspuns
        // are nevoie de parametrii

    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);
    }
        public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza functia

        //intra clientul 2
        printGreeting();

    }
}
