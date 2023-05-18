public class Variabile {
    public static void main(String[] args) {
        String marcaMasina ="Volvo";
        String modelMasina = "XC 60";
        System.out.println("Am cumparat o masina marca: "+ marcaMasina);
        System.out.println("Este modelul: " + modelMasina);
        // suprascriere
        modelMasina = "XC 60 facelift";
        System.out.println("Am cumparat o masina marca: "+ marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // declarare
        String proprietar;
        // initializare
        proprietar = "Raul";
        int varsta = 26;
        System.out.println(proprietar + " cu varsta de " + varsta);
    }
}
