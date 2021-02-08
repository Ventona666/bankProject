package banque;

public class Compte {
    private float solde = 0;

    public Compte(float solde){
        this.solde = solde;
    }

    public float getSolde(){
        return solde;
    }

    public void depot(float valeur){
        solde += valeur;
    }

    public void retrait(float valeur){
        solde -= valeur;
    }

    public void afficherSolde(){
        System.out.println("Solde du compte : " + solde + " €.");
    }

    public void virer(float valeur, Compte destinataire){
        retrait(valeur);
        destinataire.depot(valeur);
    }


}
