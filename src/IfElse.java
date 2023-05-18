import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //Flow control - if else
        // evalueaza conditii si codul merge pe o anumita ramura in functie de conditie
        System.out.println("Pornim radio");
        boolean piesa_ok =true;
        if (piesa_ok == true){
            System.out.println("marim volumul radioul");
        }
        System.out.println("oprim radioul");

        // if else
        int nr = 3;
        if (nr % 2 == 0)
        {
            System.out.println(" nr. par");
        }  else {
            System.out.println("nr. impar");

        }
        // if, else if, else
        //luam date de la tastatura
        Scanner sc = new Scanner(System.in);
        System.out.println("Inrodu ora");
        int ora = sc.nextInt();
        if (ora < 0){
            System.out.println("ora invalida");
        } else if (ora <= 11) {
            System.out.println("Neata!");
        } else if (ora <= 18) {
        System.out.println("Buna ziua!");
        } else if (ora <= 21) {
            System.out.println("Buna seara!");
        } else if (ora <= 24) {
        System.out.println("Noapte buna!");
        } else {
            System.out.println("ora invalida");
        }
        // flow control
        // swich - se foloseste atunci cand stim valorile posibile
        System.out.println("alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea){
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("Ro");
                break;
            case 2:
                System.out.println("Eng");
                break;
            default:
                System.out.println("optiune invalida");

        }
    }

}
