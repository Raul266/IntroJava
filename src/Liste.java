import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala
        List<String> fructe = new ArrayList<>();
        // au o dimensine dinamica

        // adaugam elemente in lista
        fructe.add("mar");
        fructe.add("banana");
        fructe.add("portocala");

        // cum se iau elementele?
        System.out.println(fructe.get(0));

        // cum se afla indexul unui element?
        System.out.println(fructe.indexOf("banana"));

        // scoatem un element
        fructe.remove("mar");
        System.out.println(fructe);

        // este lista goala?
        System.out.println(fructe.isEmpty());

        //EX: daca lista este goala nu cumparam fructe
        if (!fructe.isEmpty()) { // daca lista este goala nu cumparam
            System.out.println("Cumparam fructe");
        } else {
            System.out.println("Nu cumparam fructe");
        }

    }
}
