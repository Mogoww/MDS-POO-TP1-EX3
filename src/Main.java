public class Main {
    public static void main(String[] args) {

        // set compte with 1000
        Compte compte1 = new Compte("Francois", 1000);
        System.out.println(compte1.toString());

        // second account
        Compte compte2 = new Compte("Michel");
        System.out.println(compte2);

        // verser 500 euros de compte1 vers compte2
        compte1.virement(compte2, 500);
        System.out.println(compte1);
        System.out.println(compte2);

        // create a new bank
        Banque credit_blesois  = new Banque("crédit blésois");
        credit_blesois.addCompte(compte1);
        credit_blesois.addCompte(compte2);

    }
}