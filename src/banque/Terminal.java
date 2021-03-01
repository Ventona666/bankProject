package banque;

/**
 * Terminal Type
 */
public class Terminal {
    private int numClient;
    private int numCompte;
    private Banque banque;

    /**
     * @param banque
     * @param numClient
     * @param numCompte
     */
    public Terminal(Banque banque, int numClient, int numCompte){
        this.numClient = numClient;
        this.numCompte = numCompte;
        this.banque = banque;
    }

    /**
     * @param valeur
     * @param carte
     * @param code
     * @return 1 si tout c'est passé correctent, 0 sinon
     */
    public int payer(float valeur, Carte carte, int [] code){

        if(carte.codeValide(code)){
            Banque banquePossesseurCarte = carte.getBanque();
            if(banquePossesseurCarte.genererAutorisation(carte, valeur).equals("OK")){
                carte.payer(banque, numClient, numCompte, valeur);
            }
            else{
                System.out.println("Paiement refusé");
            }
        }
        else {
            System.out.println("Code invalide ou nombre de tentatives supérieur à 3");
            return 0;
        }
        return 1;
    }
}
