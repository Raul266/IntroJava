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

        // EX: o functie care calculeaza suma a 3 numere
        // nu de da nici un raspuns -suma nr. ca avea return
        // are nevoie de parametrii
        public static double mediaNr(double a, double b, double c){
            double media = (a+b+c)/3;
            return media;
        }

        // EX: o functie care me da valoarea lui pi
        // ne da un raspuns? da
        // raspunsul va fi double
        // are nevoie de parametrii? nu
        public static double piValue() {
            final double PI = 3.14;
            return PI;
        }

        public static void main(String[] args) {
        // intra clientul 1
        printGreeting(); // se apeleaza functia

        //intra clientul 2
        printGreeting();

        // apelam o functie cu parama, oferim argumente
            printGreetingByName("Albus","Raul");

            System.out.println(mediaNr(3,3,4));
            double media1 = mediaNr(3131313,313313,432);
            double media2 = mediaNr(35,234,432);
            double media3 = mediaNr(33,11,11);
            System.out.println(media1);
            System.out.println(media2);
            System.out.println(media3);

            System.out.println(piValue());
    }
}
