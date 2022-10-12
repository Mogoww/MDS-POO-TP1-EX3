import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // set compte with 1000
        // Compte compte1 = new Compte("Francois", 1000);
        // System.out.println(compte1.toString());

        // second account
        // Compte compte2 = new Compte("Michel");
        // System.out.println(compte2);

        // verser 500 euros de compte1 vers compte2
        // compte1.virement(compte2, 500);
        // System.out.println(compte1);
        // System.out.println(compte2);

        // create a new bank
        // Banque credit_blesois  = new Banque("crédit blésois");
        // credit_blesois.addCompte(compte1);
        // credit_blesois.addCompte(compte2);

        // search compte1
        // credit_blesois.rechercheCompte("Francois");

        Banque credit_blesois  = new Banque("crédit blésois");

        // while lopp
        while(true){
            System.out.println(" Que voulez-vous faire :");
            System.out.println("1 -> Ajouter un compte");
            System.out.println("2 -> Consulter votre compte");

            // scanner
            Scanner sc = new Scanner(System.in);
            if (!sc.hasNextInt() || sc.nextInt() > 2) {
                continue;
            }else {
                int choix = sc.nextInt();
                switch (choix) {
                    case 1:
                        System.out.println("Vous souhaitez ajouter un compte");
                        break;
                        case 2:
                            System.out.println("Vous souhaitez consulter un compte");
                            break;
                }
            }

        }


    }
}