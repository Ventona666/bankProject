package test;

import banque.*;
import utilitaire.Date;

public class MainBanqueTest {
    public static void main(){
        Banque banque = new Banque(0, new Client[100]);
        int clement = banque.ajouterClient("PAYET", new Date(01,12,2000));
        int tony = banque.ajouterClient("DE FREITAS", new Date(07,06,2001));
        int compClem1 = banque.getClient(clement).ajouterCompte();
        int compTony1 = banque.getClient(tony).ajouterCompte();
        int compTony2 = banque.getClient(tony).ajouterCompte();
        banque.getClient(clement).getCompte(compClem1).depot(4000000);
        banque.getClient(tony).getCompte(compTony1).depot(20000);
        banque.getClient(tony).getCompte(compTony2).depot(20000);

        banque.getClient(clement).getCompte(compClem1).afficherSolde();
        banque.getClient(tony).getCompte(compTony1).afficherSolde();

        Carte carteDeTony = new Carte(new int[]{0,7,0,6}, new Date(10,02,2024), banque, tony, compTony1);
        Carte carteDeTony2 = new Carte(new int[]{0,7,0,6}, new Date(10,02,2019), banque, tony, compTony2);
        Terminal tpe = new Terminal(banque, clement, compClem1);
        tpe.payer(200, carteDeTony, new int[]{0,7,0,6});

        banque.getClient(clement).getCompte(compClem1).afficherSolde();
        banque.getClient(tony).getCompte(compTony1).afficherSolde();

        tpe.payer(200, carteDeTony, new int[]{0,6,0,6}); // Mauvais code, doit afficher une erreur
        tpe.payer(200, carteDeTony2, new int[]{0,7,0,6}); // Date d'expiration atteinte, doit afficher une erreur
    }
}
