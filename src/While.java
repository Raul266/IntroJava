public class While {
    public static void main(String[] args) {
        // while - loop, ciclu repetitiv
        // zona de cod care se repeta atat timp cat o conditie e true

        //EX: masina merge cati timp are inca benzina
        int litrii_benzina = 10;
        while (litrii_benzina > 0 ) {
            System.out.println("Conducem masina");
            litrii_benzina = litrii_benzina - 1;
            if (litrii_benzina <=3 ){
                System.out.println("Se aprinde becul la combustibil");
            }
        }
        System.out.println("Stop! Nu mai avem benzina");
    }
}
