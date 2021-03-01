package banque;

/**
 * Compte type
 */
public class Compte {
    private float solde;

    /**
     * @param solde
     */
    public Compte(float solde){
        this.solde = solde;
    }

    /**
     * @return le solde
     */
    public float getSolde(){
        return solde;
    }

    /**
     * @param valeur
     * ajoute la valeur au compte
     */
    public void depot(float valeur){
        solde += valeur;
    }

    /**
     * @param valeur
     * retire la valeur au compte
     */
    public void retrait(float valeur){
        solde -= valeur;
    }

    /**
     * Affiche le solde du compte
     */
    public void afficherSolde(){
        System.out.println("Solde du compte : " + solde + " €.");
    }

    /**
     * @param valeur
     * @param destinataire
     * Permet de virer de l'argent vers un autre compte
     */
    public void virer(float valeur, Compte destinataire){
        retrait(valeur);
        destinataire.depot(valeur);
    }
}
